package ATnT_Regression_Suite;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.Directory;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;
import client2.ObjectRepository;

public class FPP_1103_verifyApproverPortal_GlobalNavigationSidebar extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify that approver can login and select a page to navigate on the Global Navigation Sidebar.
	 * 
	 * Role: Approver
	 * 
	 */
	
	@DataProvider(name = "FPP_1103")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_1103", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_1103")
	public void runTest(String browser,String site,String uid, String psw) {
	
	try {
		ReportsConfig();
		Common_Actions objLogin = new Common_Actions(); objLogin.login(browser,site, uid, psw);
		Common_Actions objCheck = new Common_Actions();
		
		//Verifying Approver functionalities in Global Side bar Navigation
		
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
