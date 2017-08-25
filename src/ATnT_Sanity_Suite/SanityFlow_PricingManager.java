package ATnT_Sanity_Suite;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client.FPPLoginPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class SanityFlow_PricingManager extends AUTBaseTest {

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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait added
			
			//Thread.sleep(10000);
			accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
			//Thread.sleep(500);
			FPPLoginPage objFPPLoginPage=new FPPLoginPage();
			objFPPLoginPage.userLogon(userId, password);

			FPPPricingManagerLandingPage objFPPLandingPage=new FPPPricingManagerLandingPage();

			objFPPLandingPage.verifyAllLabel();
			//Thread.sleep(500);

			objFPPLandingPage.navigateToDealPortal(dealName);

			//Thread.sleep(500);

			FPPPricingManagerDealPortalPage objFPPDealPortalPage=new FPPPricingManagerDealPortalPage();
			//Thread.sleep(500);
			objFPPDealPortalPage.verifyButton();
			//Thread.sleep(500);

			objFPPDealPortalPage.verifyLabel_DealPortal();
			
			//Thread.sleep(500);
			
			//objFPPDealPortalPage.userLogout();
			
			
			objFPPDealPortalPage.clickPreviewDeal();


		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


}
