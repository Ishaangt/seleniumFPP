package ATnT_Sanity_Suite;

import java.util.Arrays;
import java.util.List;
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
import client2.ObjectRepository.jGlobalNavigation;

public class SanityFlow_Admin extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify Admin Landing page showing Admin functions alphabetically.
	 * 
	 * Role: Admin
	 * 
	 */
	
	@DataProvider(name = "FPPAdmin")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPPAdmin", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPPAdmin")
	public void runTest(String browser,String site,String uid, String psw, String dash_tiles) {
	
	try {
		ReportsConfig();
		Common_Actions objLogin = new Common_Actions(); objLogin.login(browser,site, uid, psw);
		
		Common_Actions objCheck = new Common_Actions(); Utility utl = new Utility();
		
		objCheck.checkpointElement("Admin Dashboard Tiles",jAdminDashboard.dashTiles,jAdminDashboard.dashTilesBy);
	    
		List<WebElement> opts = getElements(jAdminDashboard.dashTiles,jAdminDashboard.dashTilesBy);  
		List<String> tiles = Arrays.asList(dash_tiles.split(","));
		
		for(int i=0;i<opts.size();i++) {
			
		  moveToElement(opts.get(i)); utl.highlightElement(opts.get(i),"red");
			
		  if (tiles.get(i).equalsIgnoreCase(opts.get(i).getText())) {
				Reports.add("Pass",tiles.get(i).toString() + " - function should be displayed", opts.get(i).getText() + " - function is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		      } 
		  else { 
			    Reports.add("Failed",tiles.get(i).toString() + " - function should be displayed", opts.get(i).getText() + " - function is displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		  }
			
		}
		
		objCheck.checkpointElement("Global Navigation Sidebar",jGlobalNavigation.globalNavigationPane,jGlobalNavigation.globalNavigationPaneBy);
		objCheck.checkpointElement("ATnT Logo",jGlobalNavigation.logoAtnt,jGlobalNavigation.logoAtntBy);
		objCheck.checkpointElement("Internet Icon",jGlobalNavigation.iconInternet,jGlobalNavigation.iconInternetBy);
		objCheck.checkpointElement("My Inbox Icon",jGlobalNavigation.iconInbox,jGlobalNavigation.iconInboxBy);
		objCheck.checkpointElement("Chart Icon",jGlobalNavigation.iconChart,jGlobalNavigation.iconChartBy);
		objCheck.checkpointElement("Search Icon",jGlobalNavigation.iconSearch,jGlobalNavigation.iconSearchBy);
		objCheck.checkpointElement("Profit Analyzer Icon",jGlobalNavigation.iconProfitAnalyzer,jGlobalNavigation.iconProfitAnalyzerBy);
		objCheck.checkpointElement("Help/Question Icon",jGlobalNavigation.iconQuestion,jGlobalNavigation.iconQuestionBy);
		objCheck.checkpointElement("Profile Icon",jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		
		placeCursorOnElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		getElement(jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy).click();
		objCheck.checkpointElement("Logout Option",jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy);		
		
		if (getElement(jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy).getText().equalsIgnoreCase("LOGOUT")) {
			Reports.add("Pass","LOGOUT option should be displayed","LOGOUT option is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	    } 
	    else { 
		    Reports.add("Failed","LOGOUT option should be displayed","LOGOUT option is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	    }
		
		getElement(jGlobalNavigation.iconLogout,jGlobalNavigation.iconLogoutBy).click();
		
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
