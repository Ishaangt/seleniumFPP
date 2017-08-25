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

public class FPP_3810_Master_Data_Landing_Page_CategoryManager extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify Admin Landing page showing Admin functions alphabetically.
	 * 
	 * Role: Admin
	 * 
	 */
	
	@DataProvider(name = "FPP_3810")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_3810", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_3810")
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
		
		objCheck.checkpointElement("Category Manager",jMasterData.categoryMgr,jMasterData.categoryMgrBy);
		Thread.sleep(10000);
		
		//Code to add for checking whether the current selection is highlighted or not
		
		getElement(jMasterData.categoryMgr,jMasterData.categoryMgrBy).findElement(By.xpath("..")).click();
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("CATEGORY MANAGER")) {
			Reports.add("Pass","Category Manager page should be displayed", "Category Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Category Manager page should be displayed", "Category Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
				
		List <WebElement> colheads = getElements(jMasterData.columnTitles,jMasterData.columnTitlesBy);
		
		if (colheads.get(0).getText().equalsIgnoreCase("CATEGORY ID")) {
			Reports.add("Pass","Column [CATEGORY ID] should be displayed", "Column [CATEGORY ID] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [CATEGORY ID] should be displayed", "Column [CATEGORY ID] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(1).getText().equalsIgnoreCase("CATEGORY NAME")) {
			Reports.add("Pass","Column [CATEGORY NAME] should be displayed", "Column [CATEGORY NAME] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [CATEGORY NAME] should be displayed", "Column [CATEGORY NAME] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(2).getText().equalsIgnoreCase("CATEGORY DESCRIPTION")) {
			Reports.add("Pass","Column [CATEGORY DESCRIPTION] should be displayed", "Column [CATEGORY DESCRIPTION] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [CATEGORY DESCRIPTION] should be displayed", "Column [CATEGORY DESCRIPTION] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(3).getText().equalsIgnoreCase("CATEGORY STATUS")) {
			Reports.add("Pass","Column [CATEGORY STATUS] should be displayed", "Column [CATEGORY STATUS] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [CATEGORY STATUS] should be displayed", "Column [CATEGORY STATUS] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		objCheck.SearchByItemName("Category", itemVal);
				
		clickButton(jMasterData.createNewCat,jMasterData.createNewCatBy);
		objCheck.checkpointElement("Create New Category page", jMasterData.createCatHeader, jMasterData.createCatHeaderBy);
		
		//placeCursorOnElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		//getElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy).click();
		//getElement(jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy).click();
		
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
