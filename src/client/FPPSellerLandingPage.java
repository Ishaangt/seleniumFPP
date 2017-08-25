package client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import client2.ObjectRepository.Landing_PricingManager;
import client2.ObjectRepository.Landing_Seller;

//import java.time.Month;


public class FPPSellerLandingPage extends AUTBaseTest {

	List<String> listMonthName_Actual=new ArrayList<String>();
	List<String> listMonthName_Expected=new ArrayList<String>();


	Map<String, List<Object>> resultMap = new HashMap<String, List<Object>>();

	//String dbHost="10.31.117.11";
	//String dbPort="1521";
	//String dbService="com.local.oracle";
	//String dmeDbname="XE";
	String dbUsername="fppdev";
	String	dbPassword="fppdev";
	String	dbType="oracle";
	String dbURL="10.31.117.11:1521:XE";

	//FPP-2807 UI - Verify that seller can view the Deal Alerts Module	

	public void verifyAllLabel()
	{
		try
		{

			if(isElementPresent(Landing_PricingManager.lblMyDashboard,Landing_PricingManager.lblMyDashboardBy))
				Reports.add("Pass","MY DASHBOARD label should display","MY DASHBOARD label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(Landing_PricingManager.lblCmpltdDeals,Landing_PricingManager.lblCmpltdDealsBy))
				Reports.add("Pass","COMPLETED DEALS label should display","COMPLETED DEALS label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(Landing_PricingManager.lblDealAlert,Landing_PricingManager.lblDealAlertBy))
				Reports.add("Pass","DEAL ALERT label should display","DEAL ALERT label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(Landing_PricingManager.lblMyInbox,Landing_PricingManager.lblMyInboxBy))
				Reports.add("Pass","MY INBOX label should display","MY INBOX label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(Landing_PricingManager.lblDealInbox,Landing_PricingManager.lblDealInboxBy))
				Reports.add("Pass","DEAL INBOX label should display","DEAL INBOX label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));




		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	//FPP-2808 UI - Verify that seller can view messages if there is no deal alerts in the Deal Alerts Module

	public void verifyNoDealAlert()
	{
		String sqlQueryUpdate="";
		String sqlQuerySelect="";
		try
		{
			//check in db that there is no deal in approved state
			//Update a particular deal as completed for seller in DB
			//executeDatabaseAction(dbType,sqlQueryUpdate,"select",dbURL,dbUsername,dbPassword);
			WebElement ele=getElement(Landing_Seller.lblYouInClear,Landing_Seller.lblYouInClearBy);

			if(isElementPresent(Landing_Seller.lblYouInClear,Landing_Seller.lblYouInClearBy))
				Reports.add("Pass","You are in the clear message should come when there in no deal in completed status","["+ ele.getText()+ "] message is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			else
				Reports.add("Fail","You are in the clear message should come when there in no deal in completed status","Required message is not displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));




		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	//FPP-2827 UI - Verify that Seller can view the Completed Deals Module.

	public void verifyCompletedDealModule()
	{
		String sqlQuery="select * from ADDRESS1";
		Actions act=new Actions(driver);

		try
		{
			List<WebElement> monthCompletedDeal=getElements(Landing_Seller.lblAllMonth_CompletedDeal,Landing_Seller.lblAllMonth_CompletedDealBy);
			WebElement e=getElement(Landing_Seller.lblAllMonth_CompletedDeal,Landing_Seller.lblAllMonth_CompletedDealBy);
			//List<WebElement> monthCompletedDeal=driver.findElements(By.xpath(Landing_Seller.lblAllMonth_CompletedDeal));


			for(int i=0;i<monthCompletedDeal.size();i++)
			{
				listMonthName_Actual.add(monthCompletedDeal.get(i).getText());
				System.out.println(monthCompletedDeal.get(i).getText());
			}

			Calendar now = Calendar.getInstance();
			int s=(now.get(Calendar.MONTH) + 1);
			System.out.println(s);

			//String currentMonth = ( Month.of(now.get(Calendar.MONTH) + 1)).toString();

			//listMonthName_Expected.add((Month.of(now.get(Calendar.MONTH)-2).toString()));
			//listMonthName_Expected.add((Month.of(now.get(Calendar.MONTH)-1).toString()));
			//listMonthName_Expected.add((Month.of(now.get(Calendar.MONTH)).toString()));
			//listMonthName_Expected.add(currentMonth);


 
			for(int i=0;i<listMonthName_Expected.size();i++)
			{
				if(listMonthName_Expected.get(i).toLowerCase().contains(listMonthName_Actual.get(i).toLowerCase()))
					Reports.add("Pass","Current and last 3 months are displaying in Completed Deal module","Month value ["+listMonthName_Actual.get(i)+"]", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				else
					Reports.add("Pass","Current and last 3 months are displaying in Completed Deal module","Month value ["+listMonthName_Actual.get(i)+"]", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}

			if(getElements(Landing_Seller.currentMonthPillar_CompletedDeal,Landing_Seller.currentMonthPillar_CompletedDealBy).size()==1)
			{
				WebElement eCurrentMonth=getElements(Landing_Seller.currentMonthPillar_CompletedDeal,Landing_Seller.currentMonthPillar_CompletedDealBy).get(0);
				act.moveToElement(eCurrentMonth).build().perform();;
				


			}





			resultMap=executeDatabaseAction(dbType,sqlQuery,"select",dbURL,dbUsername,dbPassword);
			System.out.println(resultMap);
			
		

		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


	public void verifyCompletedDealModule_NoCompletedDeal()
	{

	}

}
