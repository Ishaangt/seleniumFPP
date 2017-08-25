package client;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import client2.ObjectRepository.Landing_PricingManager;

public class FPPApproverLandingPage extends AUTBaseTest {

	public void verifyAllLabel()
	{
		try
		{

			if(isElementPresent(Landing_PricingManager.lblMyDashboard,Landing_PricingManager.lblMyDashboardBy))
				Reports.add("Pass","MY DASHBOARD label should display","MY DASHBOARD label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			/*if(isElementPresent(Landing_PricingManager.lblCmpltdDeals,Landing_PricingManager.lblCmpltdDealsBy))
				Reports.add("Pass","COMPLETED DEALS label should display","COMPLETED DEALS label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
*/
			if(isElementPresent(Landing_PricingManager.lblDealAlert,Landing_PricingManager.lblDealAlertBy))
				Reports.add("Pass","DEAL ALERT label should display","DEAL ALERT label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			/*if(isElementPresent(Landing_PricingManager.lblMyInbox,Landing_PricingManager.lblMyInboxBy))
				Reports.add("Pass","MY INBOX label should display","MY INBOX label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
*/
			if(isElementPresent(Landing_PricingManager.lblDealInbox,Landing_PricingManager.lblDealInboxBy))
				Reports.add("Pass","DEAL INBOX label should display","DEAL INBOX label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));



		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


	public void navigateToDealPortal(String dealName)
	{
		try
		{
			List <WebElement> tblRows=getElements(Landing_PricingManager.tblDealInbox,Landing_PricingManager.tblDealInboxBy);

			for(int i=0;i<tblRows.size();i++)
			{
				List<WebElement> tblCols=tblRows.get(i).findElements(By.xpath("//td/span/p"));

				for(int j=0;j<tblCols.size();j++)
				{
					System.out.println(tblCols.get(j).getText());
					if(tblCols.get(j).getText().equalsIgnoreCase(dealName))
					{
						WebElement e=tblCols.get(j);
						moveToElement(e);
						tblCols.get(j).click();
						Thread.sleep(15000);
						Reports.add("Pass","","Successfuly navigated to Deal portal page", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
						break;
					}
					else
					{
						System.out.println("Required deal is not present");
					}
				}
			}

		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
