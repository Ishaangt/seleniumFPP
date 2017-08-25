package RegressionSuite_Prasfutita;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.AUTBaseTest;
import testng.Directory;
import client.FPPLoginPage;
import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client2.ObjectRepository.Login1;

public class FPP_2472_UI_VerifyPricingManagerCanViewWaterfallChartForDeal extends AUTBaseTest {

	List<String> lstElementPillar=new ArrayList<String>();
	String sDealName;
	
	@DataProvider(name = "FPP_2472")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_2472", "FPP_2472");
		return(data);
	}

	@Test(dataProvider = "FPP_2472")
	public void test(String browser, String url, String userId, String password, String dealName,String ElementORPillar)
	{
		
		try
		{
			ReportsConfig();
			if(!dealName.equalsIgnoreCase("null"))
			{
			sDealName=dealName;
			}
			
			if(!browser.equalsIgnoreCase("null"))
			{
			setupBrowserAbsDriverPath(browser);
			//Thread.sleep(10000);
			accessHomePage(url,Login1.tbxUserid,Login1.tbxUseridBy);
			Thread.sleep(5000);
			FPPLoginPage objFPPLoginPage=new FPPLoginPage();
			objFPPLoginPage.userLogon(userId, password);
			//Thread.sleep(10000);
			}
			
			if(!ElementORPillar.equalsIgnoreCase("null"))
			{
				lstElementPillar.add(ElementORPillar);
			}
			
			if(ElementORPillar.equalsIgnoreCase("null"))
			{
			
			FPPPricingManagerLandingPage objFPPLandingPage=new FPPPricingManagerLandingPage();
			objFPPLandingPage.navigateToDealPortal(sDealName);
			Thread.sleep(12000);
			
			FPPPricingManagerDealPortalPage objFPPPricingManagerDealPortalPage=new FPPPricingManagerDealPortalPage();
			objFPPPricingManagerDealPortalPage.verifyWaterfall(lstElementPillar);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
}
}
