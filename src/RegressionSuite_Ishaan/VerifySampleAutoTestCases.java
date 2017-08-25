package RegressionSuite_Ishaan;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPLoginPage;
import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class VerifySampleAutoTestCases extends AUTBaseTest {
	
	
	@DataProvider(name = "FPPPricingManager")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPPPricingManager", "FPPPricingManager");
		return(data);
	}

	@Test(dataProvider = "FPPPricingManager")
	public void test(String browser, String url, String userId, String password, String dealName)
	{
		switch(url) {
		case "http://10.31.101.14:7074/": url="http://zlt16161.vci.att.com:32543/"; break;
		case "approver":url="http://zlt16161.vci.att.com:32544/"; break;
		case "seller":url="http://zlt16161.vci.att.com:32545/"; break;
		case "admin":url="http://zlt16161.vci.att.com:32546/"; break;
	}
		dealName = "Wells Fargo";
		try
		{
			ReportsConfig();
			setupBrowserAbsDriverPath(browser);
			//Thread.sleep(25000);
			accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
			//Thread.sleep(5000);
			//FPPLoginPage objFPPLoginPage=new FPPLoginPage();
			///objFPPLoginPage.userLogon(userId, password);

			FPPPricingManagerLandingPage objFPPLandingPage=new FPPPricingManagerLandingPage();
			objFPPLandingPage.navigateToDealPortal(dealName);
			Thread.sleep(500);
			
			FPPPricingManagerDealPortalPage objFPPPricingManagerDealPortalPage=new FPPPricingManagerDealPortalPage();
		
			objFPPPricingManagerDealPortalPage.dropdownVerification();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	
	}
		

}
