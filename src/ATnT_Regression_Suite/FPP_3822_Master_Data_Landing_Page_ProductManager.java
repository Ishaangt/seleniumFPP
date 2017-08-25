package ATnT_Regression_Suite;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.Directory;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;
import utilities.Utility;
import client2.ObjectRepository;
import client2.ObjectRepository.jMasterData;

public class FPP_3822_Master_Data_Landing_Page_ProductManager extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify Admin Landing page showing Admin functions alphabetically.
	 * 
	 * Role: Admin
	 * 
	 */
	
	@DataProvider(name = "FPP_3822")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_3822", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_3822")
	public void runTest(String browser,String site,String uid, String psw, String dash_tiles, String itemVal) {
	
	try {
		ReportsConfig();
		Common_Actions objLogin = new Common_Actions(); objLogin.login(browser,site, uid, psw);
		Common_Actions objCheck = new Common_Actions(); Utility utl = new Utility();
		
		objCheck.checkpointElement("Admin Dashboard Tiles",jAdminDashboard.dashTiles,jAdminDashboard.dashTilesBy);
	    
		List<WebElement> opts = getElements(jAdminDashboard.dashTiles,jAdminDashboard.dashTilesBy);  
			
		for(int i=0;i<opts.size();i++) {
				
		  if (opts.get(i).getText().equalsIgnoreCase(dash_tiles)) {
			  Reports.add("Pass","Master Data tile should be displayed", "Master Data tile is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
              moveToElement(opts.get(i)); 
              opts.get(i).click();
              //Thread.sleep(7000);
			  break;
		  } 		   
    	  //Reports.add("Failed","Master Data tile should be displayed", "Master Data tile is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		
		objCheck.checkpointElement("Product Manager",jMasterData.productMgr,jMasterData.productMgrBy);
		Thread.sleep(10000);
		
		//Code to add for checking whether the current selection is highlighted or not
		
		getElement(jMasterData.productMgr,jMasterData.productMgrBy).findElement(By.xpath("..")).click();
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("PRODUCT MANAGER")) {
			Reports.add("Pass","Product Manager page should be displayed", "Product Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Product Manager page should be displayed", "Product Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
				
		List <WebElement> colheads = getElements(jMasterData.columnTitles,jMasterData.columnTitlesBy);
		
		if (colheads.get(0).getText().equalsIgnoreCase("PRODUCT ID")) {
			Reports.add("Pass","Column [Product ID] should be displayed", "Column [Product ID] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [Product ID] should be displayed", "Column [Product ID] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(1).getText().equalsIgnoreCase("PRODUCT NAME")) {
			Reports.add("Pass","Column [Product NAME] should be displayed", "Column [Product NAME] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [Product NAME] should be displayed", "Column [Product NAME] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(2).getText().equalsIgnoreCase("PRODUCT STATUS")) {
			Reports.add("Pass","Column [Product STATUS] should be displayed", "Column [Product STATUS] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [Product STATUS] should be displayed", "Column [Product STATUS] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(3).getText().equalsIgnoreCase("CREATED BY")) {
			Reports.add("Pass","Column [CREATED BY] should be displayed", "Column [CREATED BY] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [CREATED BY] should be displayed", "Column [CREATED BY] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		
		
		objCheck.SearchByItemName("Product", itemVal);
		
		clickButton(jMasterData.createNewPrd,jMasterData.createNewPrdBy);
		objCheck.checkpointElement("Create New Product page", jMasterData.createPrdHeader, jMasterData.createPrdHeaderBy);
		
		//placeCursorOnElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		//getElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy).click();
		//getElement(jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy).click();
		
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
