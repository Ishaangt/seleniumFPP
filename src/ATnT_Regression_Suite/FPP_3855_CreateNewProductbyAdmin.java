package ATnT_Regression_Suite;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.Directory;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;
import utilities.Utility;
import client2.Admin_MasterData;
import client2.Admin_Product;
import client2.ObjectRepository;
import client2.ObjectRepository.jMasterData;

public class FPP_3855_CreateNewProductbyAdmin extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To create a new product by admin
	 * 
	 * Role: Admin
	 * 
	 */
	
	@DataProvider(name = "FPP_3855")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_3855", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_3855")
	public void runTest(String browser,String site,String uid, String psw, String dash_tiles, String newProdName, String catName, String catID,String pNotes) {
	
	try {
		ReportsConfig();
		 
		Common_Actions objCa = new Common_Actions(); Utility utl = new Utility();
		
		Common_Actions objLogin = new Common_Actions();  objLogin.login(browser,site, uid, psw);
		Thread.sleep(5000);
		Admin_MasterData objMasterData = new Admin_MasterData(); objMasterData.goToMasterData(dash_tiles);
		Thread.sleep(5000);
		clickButton(jMasterData.createNewPrd,jMasterData.createNewPrdBy);
		Thread.sleep(10000);
		
		Admin_Product objProduct = new Admin_Product(); 
		
		objProduct.checkProductPageElements();  //Check All elements
		
		objProduct.verifyIncompleteFields();   //Verify Mandatory Fields
		
		System.out.println(objProduct.getProductStatus());
		
		objProduct.verifyNewProductFieldsBehaviour(pNotes);
		
		//killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
