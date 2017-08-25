package RegressionSuite_Prasfutita;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPLoginPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class FPP_1157_VerifyLoginWithAuthorizedFPPUser extends AUTBaseTest {
	
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
			killBrowser();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

}
