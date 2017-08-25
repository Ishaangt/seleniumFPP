package RegressionSuite_Prasfutita;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPApproverPreviewDeal;
import client.FPPLoginPage;
import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client.FPPPricingManagerPreviewDeal;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class FPP_1148_VerifyfieldsOnApproverDealOverviewPage extends AUTBaseTest {

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
			//Thread.sleep(10000);
			accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
			Thread.sleep(5000);
			FPPLoginPage objFPPLoginPage=new FPPLoginPage();
			objFPPLoginPage.userLogon(userId, password);
			Thread.sleep(10000);
			FPPPricingManagerLandingPage objFPPLandingPage=new FPPPricingManagerLandingPage();
			objFPPLandingPage.navigateToDealPortal(dealName);
			Thread.sleep(5000);
			FPPPricingManagerDealPortalPage objFPPDealPortalPage=new FPPPricingManagerDealPortalPage();
			objFPPDealPortalPage.clickPreviewDeal();
			Thread.sleep(5000);
			//FPPPricingManagerPreviewDeal objFPPPricingManagerPreviewDeal=new FPPPricingManagerPreviewDeal();
			//objFPPPricingManagerPreviewDeal.verifyAllLable();
			
			FPPApproverPreviewDeal objFPPApproverPreviewDeal=new FPPApproverPreviewDeal();
			objFPPApproverPreviewDeal.verifyAllLable();


		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}


}
