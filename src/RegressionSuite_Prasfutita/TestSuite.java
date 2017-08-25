package RegressionSuite_Prasfutita;
/**
 * This is the main test class. All the tests are defined here. 
 *
 * @author  FPP QE Team, PwC 
 * @version 1.0
 * @since   2017-05-08 
 *//*

package ATnT_Regression_Suite;

import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testng.AUTBaseTest;
import client.FPPLoginPage;
import client.FPPObjectRepository;
import client.FPPPricingManagerInboxPage;

public class TestSuite extends AUTBaseTest implements FPPObjectRepository {

	Alert alertWindow = null;
	FPPPricingManagerInboxPage objFPPPricingManagerInboxPage = new FPPPricingManagerInboxPage();
	FPPLoginPage objFPPLoginPage = new FPPLoginPage();

	@BeforeTest
	@Parameters({ "URL", "browser" })
	public void launchApplication(String URL, String browser) throws FileNotFoundException, IOException, InterruptedException {

		 Description : Configuring the listeners for execution report 
		ReportsConfig();

		 Opening browser 	
		setupBrowserAbsDriverPath(browser);
		Thread.sleep(5000);

		 Launch FPP Application 
		homePageHandleAlert(URL,Login.lblUserid,"xpath");
		//homePageHandleAlert(URL,PricingManagerInbox.lblCompletedDeals,"xpath");
		Thread.sleep(2000);
		if (ExpectedConditions.alertIsPresent() != null)
		{
			alertWindow = driver.switchTo().alert();
			alertWindow.accept();
		}
	}


	@TestSuite (priority=0)
	public void VerifyLogin() throws BiffException, IOException, InterruptedException {

		Thread.sleep(2000);
		objFPPLoginPage.clickOK();
		Thread.sleep(10000);
	}

	@TestSuite (priority=1)
	public void verifyCompletedDealsModule() throws BiffException, IOException, InterruptedException {

		Thread.sleep(2000);
		 verifying Completed Deals Module in FPP Pricing Manager Inbox Page 
		objFPPPricingManagerInboxPage.verifyCompletedDealsModule();
	}

	@TestSuite (priority=2)
	public void verifyDealAlertsModule() throws BiffException, IOException, InterruptedException {

		Thread.sleep(2000);
		 verifying Deal Alerts Module in FPP Pricing Manager Inbox Page 
		objFPPPricingManagerInboxPage.verifyDealAlertsModule();
	}

	@TestSuite (priority=3)
	public void verifyMyInboxModule() throws BiffException, IOException, InterruptedException {

		Thread.sleep(2000);
		 verifying My Inbox Module in FPP Pricing Manager Inbox Page 
		objFPPPricingManagerInboxPage.verifyMyInboxModule();
	}

	@TestSuite (priority=4)
	public void verifyPricingManagerPortalPage() throws BiffException, IOException, InterruptedException {

		Thread.sleep(2000);	
		 verifying FPP Pricing Manager Inbox Page 
		objFPPPricingManagerInboxPage.verifyPricingManagerPortalPage();
	}

	@TestSuite (priority=5)
	public void verifyDealInbox() throws BiffException, IOException, InterruptedException {

		Thread.sleep(2000);
		 verifying Deal Inbox in FPP Pricing Manager Inbox Page 
		objFPPPricingManagerInboxPage.verifyDealInbox();
	}

	@AfterTest
	public void afterTest() throws Exception {

		 Closing Browser 	
		killBrowser();
	}

}
*/