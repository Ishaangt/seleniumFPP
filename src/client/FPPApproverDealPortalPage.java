package client;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Utility;
import client2.ObjectRepository.DealPortal;
import client2.ObjectRepository.DealPreview;
import client2.ObjectRepository.Landing_PricingManager;

public class FPPApproverDealPortalPage extends AUTBaseTest {
	
	Utility objUtility=new Utility();
	
	public void verifyButton()
	{
		if(isElementPresent(DealPortal.btnPreviewDeal,DealPortal.btnPreviewDealBy))
			Reports.add("Pass","","Preview Deal button is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		
		if(isElementPresent(DealPortal.btnUpdateFinancial,DealPortal.btnUpdateFinancialBy))
			Reports.add("Pass","","Update Financial button is showing", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			
	}
	
	
	public void verifyLabel_DealPortal()
	{
		if(isElementPresent(DealPortal.lblDealWaterfall,DealPortal.lblDealWaterfallBy))
			Reports.add("Pass","","Deal waterfall label is displaying in side nav", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		else
			Reports.add("Fail","","Deal waterfall label is not displaying in side nav", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		
		if(isElementPresent(DealPortal.lblFinancialStatementCashFlow,DealPortal.lblFinancialStatementCashFlowBy))
			Reports.add("Pass","","Financial statement cash Flow label is displaying in side nav", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		
		
		if(isElementPresent(DealPortal.lblFinancialStatementDealIncome,DealPortal.lblFinancialStatementDealIncomeBy))
			Reports.add("Pass","","Financial statement deal income label is displaying in side nav", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			
		
		if(isElementPresent(DealPortal.lblProductList,DealPortal.lblProductListBy))
		{
			WebElement element=getElement(DealPortal.lblProductList,DealPortal.lblProductListBy);
			//objUtility.highlightElement(element,"yellow");
			Reports.add("Pass","Product List label should be displayed","[" + element.getText() + "] is displaying in side nav", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

		}


		if(isElementPresent(DealPortal.lblBookOfBusiness,DealPortal.lblBookOfBusinessBy))
		{
			WebElement element=getElement(DealPortal.lblBookOfBusiness,DealPortal.lblBookOfBusinessBy);
			//objUtility.highlightElement(element,"yellow");
			Reports.add("Pass","Book of Business label should be displayed","[" + element.getText() + "] is displaying in side nav", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

		}

			
	}
	
	
	public void clickPreviewDeal()
	{
		try
		{
			clickWebLink(DealPortal.btnPreviewDeal,DealPortal.btnPreviewDealBy);
			Thread.sleep(10000);
			
			if(isElementPresent(DealPreview.lblKeyFinancial,DealPreview.lblKeyFinancialBy))
				Reports.add("Pass","","Successfuly navigated to Deal Preview page", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	
	//2473
	
	public void verifyWaterfall(List<String> lstElementPillar)
	{
		try
		{


			if(isElementPresent(DealPortal.waterfall,DealPortal.waterfallBy))
			{
				Reports.add("Pass","Base Waterfall should arrive","Base Waterfall is displaying properly", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element=getElement(DealPortal.waterfall,DealPortal.waterfallBy);
				objUtility.highlightElement(element,"yellow");
			}
			
			if(isElementPresent(DealPortal.optWaterfall,DealPortal.optWaterfallBy))
			{
				Reports.add("Pass","Waterfall option should arrive","Waterfall option is displaying properly", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element=getElement(DealPortal.optWaterfall,DealPortal.optWaterfallBy);
				objUtility.highlightElement(element,"yellow");
			}
			
			if(isElementPresent(DealPortal.optTimeSeries,DealPortal.optTimeSeriesBy))
			{
				Reports.add("Pass","Time series option should arrive","ime series option is displaying properly", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element=getElement(DealPortal.optTimeSeries,DealPortal.optTimeSeriesBy);
				objUtility.highlightElement(element,"yellow");
			}
			
			
			

			List <WebElement> waterfallPillarsAndElements=getElements(DealPortal.hightChartAllPillarsAndElements,DealPortal.hightChartAllPillarsAndElementsBy);

			for(int i=0;i<waterfallPillarsAndElements.size();i++)
			{

				objUtility.highlightElement(waterfallPillarsAndElements.get(i),"yellow");
				new Actions(driver).moveToElement(waterfallPillarsAndElements.get(i)).build().perform();
				Thread.sleep(1000);

				try{
					
					String hoverText=getElements(DealPortal.hightChartAllPillarsAndElementsHoverText,DealPortal.hightChartAllPillarsAndElementsHoverTextBy).get(0).getText();
					Reports.add("Log","Pillar/Element name should display","["+ hoverText + "] is displaying", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					if(lstElementPillar.get(i).equalsIgnoreCase(hoverText))
					{
						Reports.add("Pass","Pillar/Element name should display as per list","["+ hoverText + "] is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					}
					else
					{
						Reports.add("Fail","Pillar/Element name should display as per list","["+ hoverText + "] is displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					}
					
					String hoverAbsoluteValue=getElements(DealPortal.hightChartAllPillarsAndElementsHoverText,DealPortal.hightChartAllPillarsAndElementsHoverTextBy).get(1).getText();
					Reports.add("Pass","Absolute Value should display","["+ hoverAbsoluteValue + "] is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					
					/*String hoverText=getElements(DealPortal.hightChartAllPillarsAndElementsHoverText,DealPortal.hightChartAllPillarsAndElementsHoverTextBy).get(0).getText();
					Reports.add("Pass","Line Item should be displayed","["+ hoverText + "] is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					*/
					
				}
				catch(Exception e)
				{
					System.out.println(e.toString());
				}


			}




			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}


}
