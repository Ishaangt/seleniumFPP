package client;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Utility;
import client2.ObjectRepository.Landing_PricingManager;

public class FPPPricingManagerLandingPage extends AUTBaseTest {
	Utility objUtility=new Utility();
	String sMonth;

	public void verifyAllLabel()
	{
		try
		{

			if(isElementPresent(Landing_PricingManager.lblMyDashboard,Landing_PricingManager.lblMyDashboardBy))
			{
				WebElement element=getElement(Landing_PricingManager.lblMyDashboard,Landing_PricingManager.lblMyDashboardBy);
				objUtility.highlightElement(element,"yellow");

				Reports.add("Pass","MY DASHBOARD label should display","[" + element.getText() + "] is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
			}
			if(isElementPresent(Landing_PricingManager.lblCmpltdDeals,Landing_PricingManager.lblCmpltdDealsBy))

			{
				WebElement element=getElement(Landing_PricingManager.lblCmpltdDeals,Landing_PricingManager.lblCmpltdDealsBy);
				objUtility.highlightElement(element,"yellow");

				Reports.add("Pass","COMPLETED DEALS label should display","[" + element.getText() + "] is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				

			}

			if(isElementPresent(Landing_PricingManager.lblDealAlert,Landing_PricingManager.lblDealAlertBy))

			{
				WebElement element=getElement(Landing_PricingManager.lblDealAlert,Landing_PricingManager.lblDealAlertBy);
				objUtility.highlightElement(element,"yellow");

				Reports.add("Pass","DEAL ALERT label should display","[" + element.getText() + "] label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
			}

			if(isElementPresent(Landing_PricingManager.lblMyInbox,Landing_PricingManager.lblMyInboxBy))

			{
				WebElement element=getElement(Landing_PricingManager.lblMyInbox,Landing_PricingManager.lblMyInboxBy);
				objUtility.highlightElement(element,"yellow");

				Reports.add("Pass","MY INBOX label should display","[" + element.getText() + "] label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				
			}

			if(isElementPresent(Landing_PricingManager.lblDealInbox,Landing_PricingManager.lblDealInboxBy))
			{
				WebElement element=getElement(Landing_PricingManager.lblDealInbox,Landing_PricingManager.lblDealInboxBy);
				objUtility.highlightElement(element,"yellow");

				Reports.add("Pass","DEAL INBOX label should display","[" + element.getText() + "]  label is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				

			}

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
						moveToElement(driver.findElement(By.xpath("//*[text()='PRICING']")));
						objUtility.highlightElement(tblCols.get(j),"yellow");
						Thread.sleep(1000);
						tblCols.get(j).click();
						Thread.sleep(1000);
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

	public void verifyHeaderDealInboxGrid(String sViewType,List<String> colHeader)
	{
		int j=0;
		try
		{
			String elementXpath="//*[text()='"+sViewType+"']";
			WebElement e=getElement(elementXpath,"xpath");
			moveToElement(e);
			clickButton(elementXpath,"xpath");

			WebElement ele=getElement(Landing_PricingManager.tblHeaderScore,Landing_PricingManager.tblHeaderScoreBy);
			moveToElement(ele);
			//moveToElement(driver.findElement(By.xpath("//*[text()='Score']")));

			//List <WebElement> tblRows=getElements(Landing_PricingManager.tblHeaderDealInbox,Landing_PricingManager.tblHeaderDealInbox);

			List <WebElement> tblRows=driver.findElements(By.xpath("//*[@class='ui-datatable-thead']/tr/th/span[3]"));
			for(int i=0;i<tblRows.size();i++)
			{
				String sHeader=tblRows.get(i).getText();
				String s1=colHeader.get(j);
				System.out.println("from webpage"+ sHeader + i);
				System.out.println("from excel"+ s1 + j );


				if(sHeader.equalsIgnoreCase(s1))
				{
					Reports.add("Pass","","Column header matched", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					j++;
				}
				else
				{
					Reports.add("Fail","","Column header didn't match", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}
			}



		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}


	public void checkMonth_CompletedDeal()
	{
		try
		{
			List<WebElement> monthName=getElements(Landing_PricingManager.lblAllMonth_CompletedDeal,Landing_PricingManager.lblAllMonth_CompletedDealBy);

			Calendar now = Calendar.getInstance();
			//	String month=




			for(int i=0;i<monthName.size();i++)
			{
				sMonth=monthName.get(i).getText();
				System.out.println(sMonth);


			}



		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}





}
