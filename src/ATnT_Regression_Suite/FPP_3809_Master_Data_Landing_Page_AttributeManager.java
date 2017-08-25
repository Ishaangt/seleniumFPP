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

public class FPP_3809_Master_Data_Landing_Page_AttributeManager extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify Admin Landing page showing Admin functions alphabetically.
	 * 
	 * Role: Admin
	 * 
	 */
	
	private static final Boolean True = null;
	private static final Boolean False = null;

	@DataProvider(name = "FPP_3809")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_3809", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_3809")
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
		
		objCheck.checkpointElement("Attribute Manager",jMasterData.attributeMgr,jMasterData.attributeMgrBy);
		Thread.sleep(10000);
		
		//Code to add for checking whether the current selection is highlighted or not
		
		getElement(jMasterData.attributeMgr,jMasterData.attributeMgrBy).findElement(By.xpath("..")).click();
		Thread.sleep(15000);
		
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("ATTRIBUTE MANAGER")) {
			Reports.add("Pass","Attribute Manager page should be displayed", "Attribute Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Attribute Manager page should be displayed", "Attribute Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
						
		List <WebElement> colheads = getElements(jMasterData.columnTitles,jMasterData.columnTitlesBy);
		
		if (colheads.get(0).getText().equalsIgnoreCase("ATTRIBUTE ID")) {
			Reports.add("Pass","Column [ATTRIBUTE ID] should be displayed", "Column [ATTRIBUTE ID] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [ATTRIBUTE ID] should be displayed", "Column [ATTRIBUTE ID] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(1).getText().equalsIgnoreCase("ATTRIBUTE NAME")) {
			Reports.add("Pass","Column [ATTRIBUTE NAME] should be displayed", "Column [ATTRIBUTE NAME] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [ATTRIBUTE NAME] should be displayed", "Column [ATTRIBUTE NAME] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(2).getText().equalsIgnoreCase("ATTRIBUTE TYPE")) {
			Reports.add("Pass","Column [ATTRIBUTE TYPE] should be displayed", "Column [ATTRIBUTE TYPE] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [ATTRIBUTE TYPE] should be displayed", "Column [ATTRIBUTE TYPE] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(3).getText().equalsIgnoreCase("ATTRIBUTE STATUS")) {
			Reports.add("Pass","Column [ATTRIBUTE STATUS] should be displayed", "Column [ATTRIBUTE STATUS] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [ATTRIBUTE STATUS] should be displayed", "Column [ATTRIBUTE STATUS] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		if (colheads.get(4).getText().equalsIgnoreCase("ATTRIBUTE DESCRIPTION")) {
			Reports.add("Pass","Column [ATTRIBUTE DESCRIPTION] should be displayed", "Column [ATTRIBUTE DESCRIPTION] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}   else {
			Reports.add("Fail","Column [ATTRIBUTE DESCRIPTION] should be displayed", "Column [ATTRIBUTE DESCRIPTION] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		
		objCheck.SearchByItemName("Attribute", itemVal);
		
		clickButton(jMasterData.createNewAtt,jMasterData.createNewAttBy);
		objCheck.checkpointElement("Create New Attribute page", jMasterData.createAttHeader, jMasterData.createAttHeaderBy);
		
		//placeCursorOnElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		//getElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy).click();
		//getElement(jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy).click();
		
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
