package ATnT_Regression_Suite;

import java.util.List;


//import org.openqa.selenium.WebDriver;
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

public class FPP_1090_verifyDealApprovers_byPricer extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * This script will verify that an Pricing Manager can view the approvers required based on Pricer chain of command for a deal
	 * 
	 * Role: Pricing Manager
	 * 
	 */
	
	@DataProvider(name = "FPP_1090")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_1090", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_1090")
	public void runTest(String browser,String site,String uid, String psw,String dealName) {
	
	try {
		
		//WebDriver driver = setupBrowserAbsDriverPath(browser);
		ReportsConfig();
		Common_Actions objLogin = new Common_Actions(); objLogin.login(browser,site, uid, psw);
       
		//System.out.println(dealName);
        //List <WebElement> tblRows = getElements(jDealInboxPage.dealLinks,jDealInboxPage.dealLinksBy);
		
		//for (int i=0;i<tblRows.size();i++) {
        //    if(tblRows.get(i).getText().equalsIgnoreCase(dealName)) {
        //    	WebElement e = tblRows.get(i);
        //    	moveToElement(e);
        //    	e.click();	
        //    }
        // break;   
		//}
		
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
