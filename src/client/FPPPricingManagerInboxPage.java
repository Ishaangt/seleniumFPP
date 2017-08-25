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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import jxl.read.biff.BiffException;
import testng.AUTBaseTest;
import utilities.Utility;

public class FPPPricingManagerInboxPage extends AUTBaseTest implements FPPObjectRepository{

	public static String lblCompletedDealsValue = null;
	public static String lblCycleTimeValue = null;
	public static String lblTypeValue = null;
	public static String lblDealAlertsValue = null;
	public static String lblMyInboxValue = null;
	public static String lblMyDashboardValue = null;
	public static String lblDateValue = null;
	public static String lblDealInboxValue = null;
	public static String lblTotDealCountValue = null;

	public static String lblCycleTimeTypesValue=null;
	public static String lblCycleTimeMonthsValue=null;
	public static String lblTypeTypesValue=null;
	public static String lblMonths=null;
	public static String lblDisplayedMonths=null;
	public static String lblDisplayedCategories=null;
	public static String lblMyInboxDealStatuses=null;
	public static String lblDealInboxDisplayedHeaders=null;	

	public static String lblPendingDealsCountFromDC=null;
	public static String lblReworkDealsCountFromDC=null;
	public static String lblPricingDealsCountFromDC=null;
	public static String lblAwApprovalCountFromDC=null;
	public static String lblCompletedDealsCountFromDC=null;
	

	Utility objUtility=new Utility();
	Calendar c = new GregorianCalendar();

	/*Description : verifying Completed Deals Module */
	public void verifyCompletedDealsModule() throws BiffException, IOException {
		try {
			Thread.sleep(2000);
			/* Description : Verify if "Completed Deals" is displayed */
			lblCompletedDealsValue=getDisplayedText(PricingManagerInbox.lblCompletedDeals,PricingManagerInbox.lblCompletedDealsBy );
			if (!verifySuccessMessageBoolean("COMPLETED DEALS",lblCompletedDealsValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblCompletedDeals,"xpath"),"yellow");
				System.out.println("COMPLETED DEALS section header is not coming");
			}

			/* Description : Verify if "Cycle Time" is displayed */
			lblCycleTimeValue=getDisplayedText(PricingManagerInbox.lblCycleTime, "xpath");
			if (!verifySuccessMessageBoolean("Cycle time",lblCycleTimeValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblCycleTime,"xpath"),"yellow");
				System.out.println("Cycle time section header is not coming");
			}
			else{
				clickButton(PricingManagerInbox.lblCycleTime, "xpath");
				Thread.sleep(2000);
				
				c.setTime(new Date());
				SimpleDateFormat sdf = new SimpleDateFormat("MMM");
				lblMonths = sdf.format(c.getTime()).toString();
				for (int i=1; i<4; i++){
					c.add(Calendar.MONTH, -1);
					lblMonths += ","+sdf.format(c.getTime()).toString();				
				}

				lblDisplayedMonths = getDisplayedText(PricingManagerInbox.lblCurrMonth, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lbllastMonth, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lbl2ndlastMonth, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lbl3rdlastMonth, "cssSelector");

				if (!verifySuccessMessageBoolean(lblMonths,lblDisplayedMonths)) {
					System.out.println("Displayed Months  - "+lblDisplayedMonths+" should be similar with "+lblMonths);
				}

				lblDisplayedCategories = getDisplayedText(PricingManagerInbox.lblCompletedDealsType1, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lblCompletedDealsType2, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lblCompletedDealsType3, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lblCompletedDealsType4, "cssSelector");

				if (!verifySuccessMessageBoolean("1-2 days,3-4 days,4-5 days,5+days",lblDisplayedCategories)) {
					System.out.println("Displayed Cycle Times  - "+lblDisplayedCategories+" should be similar with 1-2 days,3-4 days,4-5 days,5+days");
				}

			}

			/* Description : Verify if "Type" is displayed */
			lblTypeValue=getDisplayedText(PricingManagerInbox.lblType, "xpath");
			if (!verifySuccessMessageBoolean("Type",lblTypeValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblType,"xpath"),"yellow");
				System.out.println("Type section header is not coming");
			}
			else{
				clickButton(PricingManagerInbox.lblType, "xpath");

				lblDisplayedCategories = getDisplayedText(PricingManagerInbox.lblCompletedDealsType1, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lblCompletedDealsType2, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lblCompletedDealsType3, "cssSelector")+","
						+getDisplayedText(PricingManagerInbox.lblCompletedDealsType4, "cssSelector");

				if (!verifySuccessMessageBoolean("Renewal,Extension,Acquisition,First Time",lblDisplayedCategories)) {
					System.out.println("Displayed Types  - "+lblDisplayedCategories+" should be similar with Renewal,Extension,Acquisition,First Time");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/*Description : verifying Deal Alerts Module */
	public void verifyDealAlertsModule() throws BiffException, IOException {
		try {
			Thread.sleep(2000);
			/* Description : Verify if "DEAL ALERTS" is displayed */
			lblDealAlertsValue=getDisplayedText(PricingManagerInbox.lblDealAlerts, "xpath");
			if (!verifySuccessMessageBoolean("DEAL ALERTS",lblDealAlertsValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblDealAlerts,"xpath"),"yellow");
				System.out.println("DEAL ALERTS section header is not coming");
			}			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/*Description : verifying My Inbox Module */
	public void verifyMyInboxModule() throws BiffException, IOException {
		try {
			Thread.sleep(2000);
			/* Description : Verify if "MY INBOX" is displayed */
			lblMyInboxValue=getDisplayedText(PricingManagerInbox.lblMyInbox, "xpath");
			if (!verifySuccessMessageBoolean("MY INBOX",lblMyInboxValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblMyInbox,"xpath"),"yellow");
				System.out.println("MY INBOX section header is not coming");
			}

			lblMyInboxDealStatuses = getDisplayedText(PricingManagerInbox.lblMyInboxDealStatus1, "xpath")+","
					+getDisplayedText(PricingManagerInbox.lblMyInboxDealStatus2, "xpath")+","
					+getDisplayedText(PricingManagerInbox.lblMyInboxDealStatus3, "xpath")+","
					+getDisplayedText(PricingManagerInbox.lblMyInboxDealStatus4, "xpath")+","
					+getDisplayedText(PricingManagerInbox.lblMyInboxDealStatus5, "xpath");

			if (!verifySuccessMessageBoolean("Pending,Awaiting Approval,Completed,Pricing,Rework",lblMyInboxDealStatuses)) {
				System.out.println("Displayed Deal Statuses  - "+lblMyInboxDealStatuses+" should be similar with Pending,Awaiting Approval,Completed,Pricing,Rework");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*Description : verifying Pricing Manager Portal Page */
	public void verifyPricingManagerPortalPage() throws BiffException, IOException {
		try {
			Thread.sleep(2000);

			/* Description : Verify if "Date" is properly displayed */
			lblDateValue=getDisplayedText(PricingManagerInbox.lblDate, "xpath");

			Date dateobj = new Date();
			String todayDate= objUtility.datefunc(dateobj, "EEEE, MMMM dxx, yyyy");

			if (!verifySuccessMessageBoolean(todayDate,lblDateValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblDate,"xpath"),"yellow");
				System.out.println("Date is not showing properly");
			}

			/* Description : Verify if "MY DASHBOARD" is displayed */
			lblMyDashboardValue=getDisplayedText(PricingManagerInbox.lblMyDashboard, "xpath");
			if (!verifySuccessMessageBoolean("MY DASHBOARD",lblMyDashboardValue)) {
				objUtility.highlightElement(getElement(PricingManagerInbox.lblMyDashboard,"xpath"),"yellow");
				System.out.println("MY DASHBOARD section header is not coming");
			}

			/* Description : Verify if "DEAL INBOX" is displayed properly with proper counts*/
			lblDealInboxValue = getDisplayedText(PricingManagerInbox.lblDealInbox, "xpath");
			if (!verifySuccessMessageBoolean("DEAL INBOX",lblDealInboxValue)) {
				System.out.println("DEAL INBOX section header is not coming");
			}
			lblTotDealCountValue = getDisplayedText(PricingManagerInbox.lblTotDealCount, "xpath");
			//	DatabaseAction("oracle","Select count(*) from DEAL where state = 'LIV'","select","10.31.101.112:1521:ORCL","ERECB","ERECB");
			//System.out.println(executeDatabaseAction("oracle","Select count(*) As CompletedDealsCount from DEAL where state = 'LIV'","select","10.31.101.112:1521:ORCL","ERECB","ERECB"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*Description : verifying Deal Inbox Module */
	public void verifyDealInbox() throws BiffException, IOException {
		try {
			Thread.sleep(2000);

			/* Description : Verify if "Current" is displayed */
			if (!verifySuccessMessageBoolean("Current",getDisplayedText(PricingManagerInbox.lblCurrent, "xpath"))) {
				System.out.println("Current button is not coming");
			}
			else{
				
				//clickButton(PricingManagerInbox.lblMyInbox, "xpath");
				//clickButton(PricingManagerInbox.secPendingDeals, "cssSelector");
				Thread.sleep(2000);
				//clickButton(PricingManagerInbox.secPendingDeals, "cssSelector");
				moveToElement(getElement(PricingManagerInbox.secPendingDeals, "cssSelector"));
				lblPendingDealsCountFromDC = getDisplayedText(PricingManagerInbox.cntDoughnutChart, "cssSelector");
				clickButton(PricingManagerInbox.lblMyInbox, "xpath");
				Thread.sleep(2000);
				//clickButton(PricingManagerInbox.secReworkDeals, "cssSelector");
				moveToElement(getElement(PricingManagerInbox.secReworkDeals, "cssSelector"));
				lblReworkDealsCountFromDC = getDisplayedText(PricingManagerInbox.cntDoughnutChart, "cssSelector");
				clickButton(PricingManagerInbox.lblMyInbox, "xpath");
				Thread.sleep(2000);
				//clickButton(PricingManagerInbox.secPricingDeals, "cssSelector");
				moveToElement(getElement(PricingManagerInbox.secPricingDeals, "cssSelector"));
				lblPricingDealsCountFromDC = getDisplayedText(PricingManagerInbox.cntDoughnutChart, "cssSelector");
				clickButton(PricingManagerInbox.lblMyInbox, "xpath");
				Thread.sleep(2000);
				//clickButton(PricingManagerInbox.secAwApprovalDeals, "cssSelector");
				moveToElement(getElement(PricingManagerInbox.secAwApprovalDeals, "cssSelector"));
				lblAwApprovalCountFromDC = getDisplayedText(PricingManagerInbox.cntDoughnutChart, "cssSelector");
				clickButton(PricingManagerInbox.lblMyInbox, "xpath");
				Thread.sleep(2000);
				//clickButton(PricingManagerInbox.secCompletedDeals, "cssSelector");
				moveToElement(getElement(PricingManagerInbox.secCompletedDeals, "cssSelector"));
				lblCompletedDealsCountFromDC = getDisplayedText(PricingManagerInbox.cntDoughnutChart, "cssSelector");
				
				System.out.println(lblPendingDealsCountFromDC +" "+lblReworkDealsCountFromDC +" "+ lblPricingDealsCountFromDC+" "+ lblAwApprovalCountFromDC+" "+ lblCompletedDealsCountFromDC);
				
				clickButton(PricingManagerInbox.lblCurrent, "xpath");

				lblDealInboxDisplayedHeaders = getDisplayedText(PricingManagerInbox.lblScoreInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblCustomerInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblDealNameInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblDealVersionInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblProductsInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblDealNotesInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblApprovalLevelInboxHeader, "xpath")+",";

				clickButton(PricingManagerInbox.ddwMRCNRCInboxHeader, "xpath");
				Thread.sleep(2000);
				lblDealInboxDisplayedHeaders += getDisplayedText(PricingManagerInbox.lblMRCInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblNRCInboxHeader, "xpath")+",";				


				clickButton(PricingManagerInbox.ddwTCVEBITInboxHeader, "xpath");
				Thread.sleep(2000);
				lblDealInboxDisplayedHeaders += getDisplayedText(PricingManagerInbox.lblTCVInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblEBITInboxHeader, "xpath")+",";


				clickButton(PricingManagerInbox.ddwDCDDIInboxHeader, "xpath");
				Thread.sleep(2000);
				lblDealInboxDisplayedHeaders += getDisplayedText(PricingManagerInbox.lblDateCreatedInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblDueDateInboxHeader, "xpath");

				if (!verifySuccessMessageBoolean("SCORE,CUSTOMER,DEAL NAME,DEAL #- VERSION,PRODUCTS (ITEMS),DEAL NOTES,APPROVAL LEVEL,MRC,NRC,TCV,EBIT,DATE CREATED,DUE DATE",lblDealInboxDisplayedHeaders)) {
					System.out.println("Displayed Deal Inbox Headers  - "+lblDealInboxDisplayedHeaders+" should be similar with SCORE,CUSTOMER,DEAL NAME,DEAL #- VERSION,PRODUCTS (ITEMS),DEAL NOTES,APPROVAL LEVEL,MRC,NRC,TCV,EBIT,DATE CREATED,DUE DATE");
				}

			}

			/* Description : Verify if "Archive" is displayed */
			if (!verifySuccessMessageBoolean("Archive",getDisplayedText(PricingManagerInbox.lblArchive, "xpath"))) {
				System.out.println("Archive button is not coming");
			}
			else{
				clickButton(PricingManagerInbox.lblArchive, "xpath");

				lblDealInboxDisplayedHeaders = getDisplayedText(PricingManagerInbox.lblArchiveScoreInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveDealTypeInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveCustomerInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveDealNameInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveDealVersionInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveProductsInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveDealNotesInboxHeader, "xpath")+","						
						+getDisplayedText(PricingManagerInbox.lblArchiveApprovalLevelInboxHeader, "xpath")+","				
								+getDisplayedText(PricingManagerInbox.lblArchiveDateCompletedInboxHeader, "xpath")+",";

				clickButton(PricingManagerInbox.ddwArchiveMRCNRCInboxHeader, "xpath");
				//clickButton(PricingManagerInbox.ddwArchiveMRCNRCInboxHeader, "cssSelector");
				Thread.sleep(2000);
				lblDealInboxDisplayedHeaders += getDisplayedText(PricingManagerInbox.lblArchiveMRCInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveNRCInboxHeader, "xpath")+",";				


				clickButton(PricingManagerInbox.ddwArchiveTCVEBITInboxHeader, "xpath");
				Thread.sleep(2000);
				lblDealInboxDisplayedHeaders += getDisplayedText(PricingManagerInbox.lblArchiveTCVInboxHeader, "xpath")+","
						+getDisplayedText(PricingManagerInbox.lblArchiveEBITInboxHeader, "xpath");

				if (!verifySuccessMessageBoolean("SCORE,DEAL TYPE,CUSTOMER,DEAL NAME,DEAL #- VERSION,PRODUCTS (ITEMS),DEAL NOTES,APPROVAL LEVEL,DATE COMPLETED,MRC,NRC,TCV,EBIT",lblDealInboxDisplayedHeaders)) {
					System.out.println("Displayed Deal Inbox Headers  - "+lblDealInboxDisplayedHeaders+" should be similar with SCORE,DEAL TYPE,CUSTOMER,DEAL NAME,DEAL #- VERSION,PRODUCTS (ITEMS),DEAL NOTES,APPROVAL LEVEL,DATE COMPLETED,MRC,NRC,TCV,EBIT");
				}

			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
