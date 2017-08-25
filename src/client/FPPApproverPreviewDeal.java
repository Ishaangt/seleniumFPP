package client;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import client2.ObjectRepository.DealPreview;
import client2.ObjectRepository.Landing_PricingManager;

public class FPPApproverPreviewDeal extends AUTBaseTest {

	public void verifyAllLable()
	{
		try
		{

			//Key Financial	
			if(isElementPresent(DealPreview.lblKeyFinancial,DealPreview.lblKeyFinancialBy))
				Reports.add("Pass","Key Financial label should display","Key Financial label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Key Financial label should display","Key Financial label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblTVC_Approver,DealPreview.lblTVC_ApproverBy))
				Reports.add("Pass","TCV label should display","TCV label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","TCV label should display","TCV label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));


			if(isElementPresent(DealPreview.lblEBITMargin,DealPreview.lblEBITMarginBy))
				Reports.add("Pass","Ebit Margin label should display","Ebit Margin label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Ebit Margin label should display","Ebit Margin label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));


			if(isElementPresent(DealPreview.lblIRR,DealPreview.lblIRRBy))
				Reports.add("Pass","IRR label should display","IRR label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","IRR label should display","IRR label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			//Deal Note

			if(isElementPresent(DealPreview.lblDEALNOTES,DealPreview.lblDEALNOTESBy))
				Reports.add("Pass","Deal Note label should display","Deal Note label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Deal Note label should display","Deal Note label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));



			//Book of Business

			if(isElementPresent(DealPreview.lblBOOKOFBUSINESS,DealPreview.lblBOOKOFBUSINESSBy))
				Reports.add("Pass","Book Of business label should display","Book Of business label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Book Of business label should display","Book Of business label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblAnnualSpend,DealPreview.lblAnnualSpendBy))
				Reports.add("Pass","Annual Spend label should display","Annual Spend label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Annual Spend label should display","Annual Spend label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblATTShareofWallet,DealPreview.lblATTShareofWalletBy))
				Reports.add("Pass","AT&T Share of Wallet  label should display","AT&T Share of Wallet  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","AT&T Share of Wallet  label should display","AT&T Share of Wallet  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));


			//Deal Financial

			if(isElementPresent(DealPreview.lblDEALFINANCIALS,DealPreview.lblDEALFINANCIALSBy))
				Reports.add("Pass","DEAL FINANCIALS  label should display","DEAL FINANCIALS  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","DEAL FINANCIALS  label should display","DEAL FINANCIALS  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblListPrice,DealPreview.lblListPriceBy))
				Reports.add("Pass","List Price  label should display","List Price  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","List Price  label should display","List Price  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblVolumeDiscount,DealPreview.lblVolumeDiscountBy))
				Reports.add("Pass","Volume Discount   label should display","Volume Discount   label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Volume Discount   label should display","Volume Discount   label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblCompetitiveDiscount,DealPreview.lblCompetitiveDiscountBy))
				Reports.add("Pass","Competitive Discount  label should display","Competitive Discount  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail","Competitive Discount  label should display","Competitive Discount  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblPromotion,DealPreview.lblPromotionBy))
				Reports.add("Pass"," Promotion  label should display"," Promotion  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail"," Promotion  label should display"," Promotion  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if(isElementPresent(DealPreview.lblOnVoiceCredit_Approver,DealPreview.lblOnVoiceCredit_ApproverBy))
				Reports.add("Pass"," On Voice Credit  label should display"," On Voice Credit  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail"," On Voice Credit  label should display"," On Voice Credit  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));


			if(isElementPresent(DealPreview.lblOn_offCharges_Approver,DealPreview.lblOn_offCharges_ApproverBy))
				Reports.add("Pass"," On-off Charges  label should display"," On-off Charges  label is displaying", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail"," On-off Charges  label should display"," On-off Charges  label is not displaying", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));


			//Line Items

			List<WebElement> allRows=getElements(DealPreview.tblLineItem,DealPreview.tblLineItemBy);
			List<WebElement> allRowsHeader=allRows.get(0).findElements(By.xpath("//th"));
			for(int i=0;i<allRowsHeader.size();i++)
			{
				String s=allRowsHeader.get(i).getText();
				System.out.println(s);
			}
				List<WebElement> allColsVal=allRows.get(0).findElements(By.xpath("//td/span[2]"));
			for(int i=0;i<allColsVal.size();i++)
			{
				String s=allColsVal.get(i).getText();
				//String s1=allColsVal.get(1).getText();
				System.out.println(s);
			
			}



		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
