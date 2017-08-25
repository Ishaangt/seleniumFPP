package ATnT_Sanity_Suite;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPApproverDealPortalPage;
import client.FPPApproverLandingPage;
import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client.FPPLoginPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class SanityFlow_Approver extends AUTBaseTest {

	@DataProvider(name = "FPPApprover")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPPApprover", "FPPApprover");
		return(data);
	}

	@Test(dataProvider = "FPPApprover")
	public void test(String browser, String url, String userId, String password, String dealName)
	{
		try
		{
			ReportsConfig();
			setupBrowserAbsDriverPath(browser);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait added
			
			//Thread.sleep(10000);
			accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
			//Thread.sleep(500);
			FPPLoginPage objFPPLoginPage=new FPPLoginPage();
			objFPPLoginPage.userLogon(userId, password);
			
			FPPApproverLandingPage objFPPApproverLandingPage=new FPPApproverLandingPage();

			objFPPApproverLandingPage.verifyAllLabel();
			//Thread.sleep(500);

			objFPPApproverLandingPage.navigateToDealPortal(dealName);

			//Thread.sleep(500);

			FPPApproverDealPortalPage objFPPApproverDealPortalPage=new FPPApproverDealPortalPage();
			//Thread.sleep(500);
			
			objFPPApproverDealPortalPage.verifyButton();
			objFPPApproverDealPortalPage.verifyLabel_DealPortal();
			
			//Thread.sleep(500);

			objFPPApproverDealPortalPage.clickPreviewDeal();


		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


}
