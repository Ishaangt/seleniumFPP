package RegressionSuite_Prasfutita;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.AUTBaseTest;
import testng.Directory;
import client.FPPApproverDealPortalPage;
import client.FPPApproverLandingPage;
import client.FPPLoginPage;
import client.FPPPricingManagerDealPortalPage;
import client.FPPPricingManagerLandingPage;
import client2.ObjectRepository.Login1;

public class FPP_2473_UI_VerifyapproverCanViewWaterfallChartForDeal extends AUTBaseTest {

	List<String> lstElementPillar=new ArrayList<String>();
	String sDealName;
	
	@DataProvider(name = "FPP_2473")
	public Object[][] testLoginScenario() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_2473", "FPP_2473");
		return(data);
	}

	@Test(dataProvider = "FPP_2473")
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
			
				FPPApproverLandingPage objFPPApproverLandingPage=new FPPApproverLandingPage();
				objFPPApproverLandingPage.navigateToDealPortal(sDealName);
			Thread.sleep(10000);
			
			FPPApproverDealPortalPage objFPPApproverDealPortalPage=new FPPApproverDealPortalPage();
			objFPPApproverDealPortalPage.verifyWaterfall(lstElementPillar);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
}
}