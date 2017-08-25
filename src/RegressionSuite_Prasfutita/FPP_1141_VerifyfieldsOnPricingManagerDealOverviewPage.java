package RegressionSuite_Prasfutita;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPLoginPage;
import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client.FPPPricingManagerPreviewDeal;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class FPP_1141_VerifyfieldsOnPricingManagerDealOverviewPage extends AUTBaseTest {

	@DataProvider(name = "FPPPricingManager")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPPPricingManager", "FPPPricingManager");
		return(data);
	}

	@Test(dataProvider = "FPPPricingManager")
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
			FPPPricingManagerPreviewDeal objFPPPricingManagerPreviewDeal=new FPPPricingManagerPreviewDeal();
			objFPPPricingManagerPreviewDeal.verifyAllLable();


		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}


}
