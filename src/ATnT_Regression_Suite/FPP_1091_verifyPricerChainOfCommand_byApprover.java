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

public class FPP_1091_verifyPricerChainOfCommand_byApprover extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * This script will verify,
     * that an Approver can view the approvers required based on Pricer chain of command for a deal
	 * 
	 * Role: Approver
	 * 
	 */
	
	@DataProvider(name = "FPP_1091")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_1091", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_1091")
	public void runTest(String browser,String site,String uid, String psw,String dealName) {
	
	try {
		ReportsConfig();
		Common_Actions objLogin = new Common_Actions(); objLogin.login(browser,site, uid, psw);
        
		Thread.sleep(10000);
		clickWebLink(jDealInboxPage.dealNameLink,jDealInboxPage.dealNameLinkBy);
				
		if(isElementPresent(jDealPortalPage.approverLink,jDealPortalPage.approverLinkBy)) {
			placeCursorOnElement(jDealPortalPage.approverLink,jDealPortalPage.approverLinkBy);
			Reports.add("Pass","DEAL Approver list should be displayed","Deal Approvers list is displayed", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
			
	List<WebElement> appRows = getElements(jDealPortalPage.dealApprovers,jDealPortalPage.dealApproversBy);
		
		for (int i=0;i<appRows.size();i++) {
			System.out.println(appRows.get(i).getText());
		}
    
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
