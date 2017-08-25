package RegressionSuite_Prasfutita;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import client.FPPLoginPage;
import client.FPPPricingManagerLandingPage;
import client2.ObjectRepository.Login1;
import testng.AUTBaseTest;
import testng.Directory;

public class PricingManager_TableHeaderCheck extends AUTBaseTest{

	List<String> colHeader=new ArrayList<String>();


	@DataProvider(name = "FPPPricingManager1")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPPPricingManager1", "FPPPricingManager1");
		return(data);
	}

	@Test(dataProvider = "FPPPricingManager1")
	public void headerVerification(String browser, String url, String userId, String password, String dealName,String tableHeader)
	{
		try
		{
 
			ReportsConfig();
			setupBrowserAbsDriverPath(browser);
			//Thread.sleep(10000);
			if(!browser.equalsIgnoreCase("null"))
			{
				accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
				Thread.sleep(5000);
				FPPLoginPage objFPPLoginPage=new FPPLoginPage();
				objFPPLoginPage.userLogon(userId, password);
				
			}

			if(!tableHeader.equalsIgnoreCase("null"))
			{
				colHeader.add(tableHeader);

			}

			if(tableHeader.equalsIgnoreCase("null"))
			{
				
				Thread.sleep(5000);
				FPPPricingManagerLandingPage objFPPPricingManagerLandingPage=new FPPPricingManagerLandingPage();
				//objFPPPricingManagerLandingPage.verifyHeaderDealInboxGrid("CURRENT", colHeader);
				objFPPPricingManagerLandingPage.verifyHeaderDealInboxGrid("Archive", colHeader);
				//objFPPPricingManagerLandingPage.verifyHeaderDealInboxGrid("Archive", colHeader);
				
				
				

			}



		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


}
