package client;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Utility;
import client2.ObjectRepository.DealPortal;
import client2.ObjectRepository.DealPreview;
import client2.ObjectRepository.Landing_PricingManager;

public class FPPPricingManagerDealPortalPage extends AUTBaseTest {

	Utility objUtility = new Utility();

	public void verifyButton() {
		try {
			if (isElementPresent(DealPortal.btnPreviewDeal, DealPortal.btnPreviewDealBy)) {
				Reports.add("Pass", "Preview Deal button should show", "Preview Deal button is showing", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element = getElement(DealPortal.btnPreviewDeal, DealPortal.btnPreviewDealBy);
				objUtility.highlightElement(element, "yellow");
			} else
				Reports.add("Fail", "Preview Deal button should show", "Preview Deal button is not showing",
						LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.btnUpdateFinancial, DealPortal.btnUpdateFinancialBy)) {
				Reports.add("Pass", "Update Financial button should show", "Update Financial button is showing",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element = getElement(DealPortal.btnUpdateFinancial, DealPortal.btnUpdateFinancialBy);
				objUtility.highlightElement(element, "yellow");
			} else
				Reports.add("Fail", "Update Financial button should show", "Update Financial button is not showing",
						LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void verifyLabel_DealPortal() {
		try {
			if (isElementPresent(DealPortal.lblDealWaterfall, DealPortal.lblDealWaterfallBy)) {
				WebElement element = getElement(DealPortal.lblDealWaterfall, DealPortal.lblDealWaterfallBy);
				objUtility.highlightElement(element, "yellow");
				Reports.add("Pass", "Deal Waterfall label should be displayed ",
						"[" + element.getText() + "] label is displaying in side nav", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}

			if (isElementPresent(DealPortal.lblFinancialStatementCashFlow,
					DealPortal.lblFinancialStatementCashFlowBy)) {
				WebElement element = getElement(DealPortal.lblFinancialStatementCashFlow,
						DealPortal.lblFinancialStatementCashFlowBy);
				objUtility.highlightElement(element, "yellow");
				Reports.add("Pass", "Financial statement cash Flow label should be displayed",
						"[" + element.getText() + "]  is displaying in side nav", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}

			if (isElementPresent(DealPortal.lblFinancialStatementDealIncome,
					DealPortal.lblFinancialStatementDealIncomeBy)) {
				WebElement element = getElement(DealPortal.lblFinancialStatementDealIncome,
						DealPortal.lblFinancialStatementDealIncomeBy);
				objUtility.highlightElement(element, "yellow");
				Reports.add("Pass", "Financial statement deal income label should be displayed",
						"[" + element.getText() + "] is displaying in side nav", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}

			if (isElementPresent(DealPortal.lblProductList, DealPortal.lblProductListBy)) {
				WebElement element = getElement(DealPortal.lblProductList, DealPortal.lblProductListBy);
				objUtility.highlightElement(element, "yellow");
				Reports.add("Pass", "Product List label should be displayed",
						"[" + element.getText() + "] is displaying in side nav", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}

			if (isElementPresent(DealPortal.lblBookOfBusiness, DealPortal.lblBookOfBusinessBy)) {
				WebElement element = getElement(DealPortal.lblBookOfBusiness, DealPortal.lblBookOfBusinessBy);
				objUtility.highlightElement(element, "yellow");
				Reports.add("Pass", "Book of Business label should be displayed",
						"[" + element.getText() + "] is displaying in side nav", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void clickPreviewDeal() {
		try {
			clickWebLink(DealPortal.btnPreviewDeal, DealPortal.btnPreviewDealBy);
			Thread.sleep(10000);

			if (isElementPresent(DealPreview.lblKeyFinancial, DealPreview.lblKeyFinancialBy))
				Reports.add("Pass", "", "Successfuly navigated to Deal Preview page", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void userLogout() {
		try {
			clickButton(DealPortal.iconPerson, DealPortal.iconPersonBy);
			Thread.sleep(1000);
			clickButton(DealPortal.btnLogout, DealPortal.btnLogoutBy);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void verifyExpandCollapseSolution() {
		try {
			if (isElementPresent(DealPortal.lblScore, DealPortal.lblScoreBy))
				Reports.add("Pass", "Score label should display", "Score label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Score label should display", "Score label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblSolutionProductListItem, DealPortal.lblSolutionProductListItemBy))
				Reports.add("Pass", "Solution Product ListItem label should display",
						"Solution Product ListItem label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Solution Product ListItem label should display",
						"Solution Product ListItem label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblVariable, DealPortal.lblVariableBy))
				Reports.add("Pass", "Variable label should display", "Variable label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Variable label should display", "Variable label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblQuantity, DealPortal.lblQuantityBy))
				Reports.add("Pass", "Quantity label should display", "Quantity label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Quantity label should display", "Quantity label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblListPrice, DealPortal.lblListPriceBy))
				Reports.add("Pass", "List Price label should display", "List Price label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "List Price label should display", "List Price label is NOT displaying",
						LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblDiscount, DealPortal.lblDiscountBy))
				Reports.add("Pass", "Discount label should display", "Discount label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Discount label should display", "Discount label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblCredits, DealPortal.lblCreditsBy))
				Reports.add("Pass", "Credit label should display", "Credit label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Credit label should display", "Credit label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblProposedEffectiveRate, DealPortal.lblProposedEffectiveRateBy))
				Reports.add("Pass", "ProposedEffectiveRate label should display",
						"ProposedEffectiveRate label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "ProposedEffectiveRate label should display",
						"ProposedEffectiveRate label is NOT displaying", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblTargetPrice, DealPortal.lblTargetPriceBy))
				Reports.add("Pass", "Target Price label should display", "Target Price label is displaying",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Target Price label should display", "Target Price label is NOT displaying",
						LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			if (isElementPresent(DealPortal.lblEbitMargin, DealPortal.lblEbitMarginBy))
				Reports.add("Pass", "Ebit Margin label should display", "Ebit Margin label is displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			else
				Reports.add("Fail", "Ebit Margin label should display", "Ebit Margin label is NOT displaying",
						LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			WebElement ele = getElement(DealPortal.lbl_FinancialStatement, DealPortal.lbl_FinancialStatementBy);

			moveToElement(ele);
			Thread.sleep(5000);

			clickButton(DealPortal.btnExpand_Solution, DealPortal.btnExpand_SolutionBy);
			Thread.sleep(5000);
			clickButton(DealPortal.btnExpand_Product, DealPortal.btnExpand_ProductBy);
			Thread.sleep(5000);

			WebElement ele1 = getElement(DealPortal.lbl_Line_Item1, DealPortal.lbl_Line_Item1By);

			if (isElementDisplayed(DealPortal.lbl_Line_Item1, DealPortal.lbl_Line_Item1By)) {
				Reports.add("Pass", "Line Item should be displayed", "[" + ele1.getText() + "] is displaying",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			} else {
				Reports.add("Pass", "Line Item should be displayed", "Line Item is not displaying", LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			Thread.sleep(500);

			int size = getElements(DealPortal.btnCollapse_ProductAndSolution,
					DealPortal.btnCollapse_ProductAndSolutionBy).size();
			System.out.println(size);

			for (int i = 0; i < getElements(DealPortal.btnCollapse_ProductAndSolution,
					DealPortal.btnCollapse_ProductAndSolutionBy).size(); i++) {
				getElements(DealPortal.btnCollapse_ProductAndSolution, DealPortal.btnCollapse_ProductAndSolutionBy)
						.get(i).click();
				Reports.add("Pass", "Collapse button should be clicked",
						"[" + getElements(DealPortal.btnCollapse_ProductAndSolution,
								DealPortal.btnCollapse_ProductAndSolutionBy).get(i) + "] is clicked",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// Not Finished
	public void verifyMouseHoverSolutionTable() {
		int k = 9;
		try {
			WebElement element = getElement(DealPortal.lbl_FinancialStatement, DealPortal.lbl_FinancialStatementBy);

			moveToElement(element);
			Thread.sleep(5000);

			// Hover on Credits
			List<WebElement> allRows = getElements(DealPortal.tblSolution, DealPortal.tblSolutionBy);

			for (int i = 0; i < allRows.size(); i++) {
				List<WebElement> allCols = allRows.get(i).findElements(By.xpath("//td"));

				String s2 = allCols.get(7).getText();
				System.out.println(s2);
				new Actions(driver).moveToElement(allCols.get(7)).build().perform();

				List<WebElement> eles = getElements(DealPortal.toolTipCredit, DealPortal.toolTipCreditBy);

				for (int j = 0; j < eles.size(); j++) {
					System.out.println(eles.get(j).getText());
				}
				k++;
			}

			// Hover on Discount

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 2472
	public void verifyWaterfall(List<String> lstElementPillar) {
		try {

			if (isElementPresent(DealPortal.waterfall, DealPortal.waterfallBy)) {
				Reports.add("Pass", "Base Waterfall should arrive", "Base Waterfall is displaying properly",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element = getElement(DealPortal.waterfall, DealPortal.waterfallBy);
				objUtility.highlightElement(element, "yellow");
			}

			if (isElementPresent(DealPortal.optWaterfall, DealPortal.optWaterfallBy)) {
				Reports.add("Pass", "Waterfall option should arrive", "Waterfall option is displaying properly",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element = getElement(DealPortal.optWaterfall, DealPortal.optWaterfallBy);
				objUtility.highlightElement(element, "yellow");
			}

			if (isElementPresent(DealPortal.optTimeSeries, DealPortal.optTimeSeriesBy)) {
				Reports.add("Pass", "Time series option should arrive", "ime series option is displaying properly",
						LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				WebElement element = getElement(DealPortal.optTimeSeries, DealPortal.optTimeSeriesBy);
				objUtility.highlightElement(element, "yellow");
			}

			List<WebElement> waterfallPillarsAndElements = getElements(DealPortal.hightChartAllPillarsAndElements,
					DealPortal.hightChartAllPillarsAndElementsBy);

			for (int i = 0; i < waterfallPillarsAndElements.size(); i++) {

				objUtility.highlightElement(waterfallPillarsAndElements.get(i), "yellow");
				new Actions(driver).moveToElement(waterfallPillarsAndElements.get(i)).build().perform();
				Thread.sleep(1000);

				try {

					String hoverText = getElements(DealPortal.hightChartAllPillarsAndElementsHoverText,
							DealPortal.hightChartAllPillarsAndElementsHoverTextBy).get(0).getText();
					Reports.add("Log", "Pillar/Element name should display", "[" + hoverText + "] is displaying",
							LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					if (lstElementPillar.get(i).equalsIgnoreCase(hoverText)) {
						Reports.add("Pass", "Pillar/Element name should display as per list",
								"[" + hoverText + "] is displaying", LogAs.PASSED,
								new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					} else {
						Reports.add("Fail", "Pillar/Element name should display as per list",
								"[" + hoverText + "] is displaying", LogAs.FAILED,
								new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					}

					String hoverAbsoluteValue = getElements(DealPortal.hightChartAllPillarsAndElementsHoverText,
							DealPortal.hightChartAllPillarsAndElementsHoverTextBy).get(1).getText();
					Reports.add("Pass", "Absolute Value should display", "[" + hoverAbsoluteValue + "] is displaying",
							LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

					/*
					 * String
					 * hoverText=getElements(DealPortal.hightChartAllPillarsAndElementsHoverText,
					 * DealPortal.hightChartAllPillarsAndElementsHoverTextBy).get(0).getText();
					 * Reports.add("Pass","Line Item should be displayed","["+ hoverText +
					 * "] is displaying", LogAs.PASSED, new
					 * CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					 */

				} catch (Exception e) {
					System.out.println(e.toString());
				}

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 2836

	public void cacheWaterfall() {
		try {

			WebElement ele = getElement(DealPortal.lbl_FinancialStatement, DealPortal.lbl_FinancialStatementBy);

			moveToElement(ele);
			Thread.sleep(5000);

			clickButton(DealPortal.btnExpand_Solution, DealPortal.btnExpand_SolutionBy);
			Thread.sleep(5000);
			clickButton(DealPortal.btnExpand_Product, DealPortal.btnExpand_ProductBy);
			Thread.sleep(5000);

			WebElement ele1 = getElements(DealPortal.tblProductLevel, DealPortal.tblProductLevelBy).get(1)
					.findElements(By.xpath("//tr")).get(0).findElements(By.xpath("//td")).get(4)
					.findElement(By.xpath("//input"));

			ele1.sendKeys("0");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	final static String btnExpand = "//*[@id=\"deal-income\"]/div[1]/div/div/div[1]/div/p-dropdown/div";
	final static String dropDownList = "//*[@id=\"deal-income\"]/div[1]/div/div/div[1]/div/p-dropdown/div/div[1]";
	final static String btnOptionChange = "//*[@id=\"deal-income\"]/div[1]/div/div/div[1]/div/p-dropdown/div/div[1]/select/option[3]";
	public void dropdownVerification() {
		try {

			WebElement ele = getElement(DealPortal.lbl_FinancialStatement, DealPortal.lbl_FinancialStatementBy);
			
			moveToElement(ele);
			//Thread.sleep(5000);
			objUtility.highlightElement(ele,"yellow");
			clickButton(btnExpand, "xpath");
			//Thread.sleep(5000);
			
			
			//String drp = getSelectedListBoxText(dropDownList, "xpath");
			WebElement dropD = getElement(dropDownList, "xpath");
			/*System.out.println(dropD.getText());
			System.out.println(dropD.getTagName());
			System.out.println(dropD.getLocation());
			System.out.println(dropD.getSize());*/
			WebElement drp = driver.findElement(By.xpath("//*[@id=\"deal-income\"]/div[1]/div/div/div[1]/div/p-dropdown/div/div[1]/select"));
			System.out.println(drp.getText());
			//clickButton(btnOptionChange, "xpath");
			Select select = new Select(drp);
			System.out.println(select.getAllSelectedOptions());
			System.out.println(select.getFirstSelectedOption());
			System.out.println(select.getOptions());
			List<WebElement> selOps = select.getOptions();
			int i = 0;
			for(WebElement e : selOps) {
				selOps.get(i++).getText();
			}
			select.selectByVisibleText("Wireline/Mobility Vi vew");
			select.selectByIndex(3);
			select.selectByValue("wrwl");
			Thread.sleep(5000);

//			WebElement ele1 = getElements(DealPortal.tblProductLevel, DealPortal.tblProductLevelBy).get(1)
//					.findElements(By.xpath("//tr")).get(0).findElements(By.xpath("//td")).get(4)
//					.findElement(By.xpath("//input"));
//
//			ele1.sendKeys("0");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
