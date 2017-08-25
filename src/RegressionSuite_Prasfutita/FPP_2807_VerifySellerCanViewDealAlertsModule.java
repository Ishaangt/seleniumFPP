package RegressionSuite_Prasfutita;

//FPP-2807 and FPP-2808

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPLoginPage;
import client.FPPSellerLandingPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class FPP_2807_VerifySellerCanViewDealAlertsModule extends AUTBaseTest {
	
	@DataProvider(name = "FPPSeller")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPPSeller", "FPPSeller");
		return(data);
	}

	@Test(dataProvider = "FPPSeller")
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
			Thread.sleep(5000);
			FPPSellerLandingPage objFPPSellerLandingPage=new FPPSellerLandingPage();
			objFPPSellerLandingPage.verifyAllLabel();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
