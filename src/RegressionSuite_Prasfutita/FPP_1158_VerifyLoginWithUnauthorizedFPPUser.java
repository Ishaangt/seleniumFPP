package RegressionSuite_Prasfutita;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPLoginPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class FPP_1158_VerifyLoginWithUnauthorizedFPPUser extends AUTBaseTest {
	
	@DataProvider(name = "UnauthorizedUserLogon")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "UnauthorizedUserLogon", "UnauthorizedUserLogon");
		return(data);
	}

	
	@Test(dataProvider = "UnauthorizedUserLogon")
	public void unauthorizedLogin(String browser, String url, String userId, String password)
	{
		try
		{
			ReportsConfig();
			setupBrowserAbsDriverPath(browser);
			//Thread.sleep(10000);
			accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
			Thread.sleep(5000);
			FPPLoginPage objFPPLoginPage=new FPPLoginPage();
			objFPPLoginPage.unauthorizedUserLogon(userId,password);
			killBrowser();

			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	

}
