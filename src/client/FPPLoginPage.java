/**
 * This Class access the FPP Pricing Manager page.
 * 
 *
 * @author  FPP QE Team, PwC 
 * @version 1.0
 * @since   2017-05-08 
 */

package client;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import client2.ObjectRepository.Landing_PricingManager;
import client2.ObjectRepository.Login1;
import jxl.read.biff.BiffException;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Utility;

public class FPPLoginPage extends AUTBaseTest implements FPPObjectRepository{

	public static String lblUseridValue = null;
	Utility objUtility=new Utility();
	Calendar c = new GregorianCalendar();


	/*Description : verifying Login Module */
	public void clickOK() throws BiffException, IOException {
		try {
			/* Description : Verify if "Login" section is displayed */
			lblUseridValue=getDisplayedText(Login.lblUserid, "xpath");
			if (!verifySuccessMessageBoolean("UserID*:",lblUseridValue)) {
				System.out.println("Launch Page has not loaded properly");
			}
			else {
				setTextboxValue(Login.tbxUserid, Login.tbxUseridBy, "tr0001");
				setTextboxValue(Login.tbxPassword, Login.tbxPasswordBy, "tr0001");
				Thread.sleep(2000);
				clickButton(Login.btnOk, Login.btnOkBy);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	
	public void userLogon(String userId,String password)
	{
		try
		{
			setTextboxValue(Login1.tbxUserid,Login1.tbxUseridBy,userId);
			setTextboxValue(Login1.tbxPassword,Login1.tbxPasswordBy,"");
			clickButton(Login1.btnOk,Login1.btnOkBy);
			Thread.sleep(10000);
			if(isElementPresent(Landing_PricingManager.lblDealAlert,Landing_PricingManager.lblDealAlertBy))
				Reports.add("Pass","User should be able to login successfully","User has logged in successfully", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","User should be able to login successfully","User hasn't logged in successfully", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				

			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public void unauthorizedUserLogon(String userId,String password)
	{
		try
		{
			setTextboxValue(Login1.tbxUserid,Login1.tbxUseridBy,userId);
			setTextboxValue(Login1.tbxPassword,Login1.tbxPasswordBy,"");
			clickButton(Login1.btnOk,Login1.btnOkBy);
			Thread.sleep(10000);
			
			if(isElementPresent(Login1.unauthorizedLoginMessage,Login1.unauthorizedLoginMessageBy))
				Reports.add("Pass","Unauthorized user shouldn't be able to login","Unauthorized User is not able to log in", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Unauthorized user shouldn't be able to login","User is able to logged in successfully", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	

}
