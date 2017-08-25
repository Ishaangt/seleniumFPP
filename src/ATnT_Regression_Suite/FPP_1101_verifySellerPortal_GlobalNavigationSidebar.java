package ATnT_Regression_Suite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.Directory;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;
import client2.GlobalNavigation_Pane;
import client2.ObjectRepository;

public class FPP_1101_verifySellerPortal_GlobalNavigationSidebar extends AUTBaseTest  implements ObjectRepository {
	/* Description:
	 * To verify that seller can login and select a page to navigate on the Global Navigation Sidebar.
	 * 
	 * Role: Seller
	 * 
	 */
	
	@DataProvider(name = "FPP_1101")
	public Object[][] dt() throws Exception
	{
		Object[][] data = getTableArray(Directory.dataSheetPath, "FPP_1101", "jData");
		return(data);
	}
	
	@Test (dataProvider = "FPP_1101")
	public void runTest(String browser,String site,String uid, String psw) {
	
	try {
		ReportsConfig();
		Common_Actions objLogin = new Common_Actions(); objLogin.login(browser,site, uid, psw);
		

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row globemenu']")));
		
		GlobalNavigation_Pane objGlobalNavigationPane = new GlobalNavigation_Pane();
		objGlobalNavigationPane.checkGlobalNavigationElements();
		
		objGlobalNavigationPane.GlobalNavigation_Logout();
	
		killBrowser();
		
       } 
	  catch(Exception e)  { System.out.println(e.toString());}
	}
}
