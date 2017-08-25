package client2;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;
import client2.ObjectRepository.jGlobalNavigation;

public class GlobalNavigation_Pane extends AUTBaseTest  implements ObjectRepository {

	public void default_method (String args) {
		try {
		      // Code to Paste here
		}
		
		catch(Exception e) {System.out.println(e.toString());}
	}
	
	
	public void checkGlobalNavigationElements () {
		try {
			Common_Actions objCheck = new Common_Actions();
			
			objCheck.checkpointElement("Global Navigation Sidebar",jGlobalNavigation.globalNavigationPane,jGlobalNavigation.globalNavigationPaneBy);
			objCheck.checkpointElement("ATnT Logo",jGlobalNavigation.logoAtnt,jGlobalNavigation.logoAtntBy);
			objCheck.checkpointElement("Internet Icon",jGlobalNavigation.iconInternet,jGlobalNavigation.iconInternetBy);
			objCheck.checkpointElement("My Inbox Icon",jGlobalNavigation.iconInbox,jGlobalNavigation.iconInboxBy);
			objCheck.checkpointElement("Chart Icon",jGlobalNavigation.iconChart,jGlobalNavigation.iconChartBy);
			objCheck.checkpointElement("Search Icon",jGlobalNavigation.iconSearch,jGlobalNavigation.iconSearchBy);
			objCheck.checkpointElement("Profit Analyzer Icon",jGlobalNavigation.iconProfitAnalyzer,jGlobalNavigation.iconProfitAnalyzerBy);
			objCheck.checkpointElement("Help/Question Icon",jGlobalNavigation.iconQuestion,jGlobalNavigation.iconQuestionBy);
			objCheck.checkpointElement("Profile Icon",jGlobalNavigation.iconProfile,jGlobalNavigation.iconProfileBy);
		}
		
		catch(Exception e) {System.out.println(e.toString());}
	}

	public void GlobalNavigation_Logout () {
		try {
			
			Common_Actions objCheck = new Common_Actions();
			
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
		}
		
		catch(Exception e) {System.out.println(e.toString());}
	}
	
	
	
}
