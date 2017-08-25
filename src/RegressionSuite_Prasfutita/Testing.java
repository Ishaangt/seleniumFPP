package RegressionSuite_Prasfutita;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.AUTBaseTest;
import testng.Directory;
import utilities.Common_Actions;
import client2.ObjectRepository;
import client2.ObjectRepository.jAdminDashboard;
import client2.ObjectRepository.jDealInboxPage;

public class Testing extends AUTBaseTest  implements ObjectRepository {

	@DataProvider(name = "FPP_1090")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_1090", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_1090")
	public void runTest(String browser,String site,String uid, String psw,String dealName) {
	
	try {
		ReportsConfig();
		Common_Actions ca = new Common_Actions(); ca.login(browser,site, uid, psw);
		Thread.sleep(10000);
		clickWebLink(jDealInboxPage.dealNameLink,jDealInboxPage.dealNameLinkBy);
		
		List<WebElement> myele = getElements("//li[@class='pull-left']/input","xpath");  
		System.out.println(myele.size());
		
		//for(int i=0;i<myele.size();i++) { 
		//	System.out.println(myele.get(i).getAttribute("value"));
		//}
		
		System.out.println(ca.returnAttributes(myele.get(0)));
		
	}
	 catch(Exception e)  { System.out.println(e.toString());}
}
	
}	
