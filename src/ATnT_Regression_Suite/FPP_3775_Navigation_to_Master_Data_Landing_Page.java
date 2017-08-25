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

public class FPP_3775_Navigation_to_Master_Data_Landing_Page extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify Admin Landing page showing Admin functions alphabetically.
	 * 
	 * Role: Admin
	 * 
	 */
	
	@DataProvider(name = "FPP_3775")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_3775", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_3775")
	public void runTest(String browser,String site,String uid, String psw, String dash_tiles) {
	
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
		objCheck.checkpointElement("Category Manager",jMasterData.categoryMgr,jMasterData.categoryMgrBy);
		objCheck.checkpointElement("Line Item Manager",jMasterData.lineItemMgr,jMasterData.lineItemMgrBy);
		objCheck.checkpointElement("Attribute Manager",jMasterData.attributeMgr,jMasterData.attributeMgrBy);
		
		Thread.sleep(10000);
		
		getElement(jMasterData.productMgr,jMasterData.productMgrBy).findElement(By.xpath("..")).click();
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("PRODUCT MANAGER")) {
			Reports.add("Pass","Product Manager page should be displayed", "Product Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Product Manager page should be displayed", "Product Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		Thread.sleep(10000);
		
		getElement(jMasterData.categoryMgr,jMasterData.categoryMgrBy).findElement(By.xpath("..")).click();
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("CATEGORY MANAGER")) {
			Reports.add("Pass","Category Manager page should be displayed", "Category Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Category Manager page should be displayed", "Category Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		Thread.sleep(10000);
		
		getElement(jMasterData.lineItemMgr,jMasterData.lineItemMgrBy).findElement(By.xpath("..")).click();
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("LINEITEM MANAGER")) {
			Reports.add("Pass","Line Item Manager page should be displayed", "Line Item Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Line Item Manager page should be displayed", "Line Item Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		Thread.sleep(10000);
		
		getElement(jMasterData.attributeMgr,jMasterData.attributeMgrBy).findElement(By.xpath("..")).click();
		if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("ATTRIBUTE MANAGER")) {
			Reports.add("Pass","Attribute Manager page should be displayed", "Attribute Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			Reports.add("Fail","Attribute Manager page should be displayed", "Attribute Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		//placeCursorOnElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		//getElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy).click();
		//getElement(jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy).click();
		
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
