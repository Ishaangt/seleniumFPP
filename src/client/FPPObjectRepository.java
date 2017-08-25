/**
 * This Class is a repository for all the required web elements. 
 *
 * @author  FPP QE Team, PwC 
 * @version 1.0
 * @since   2017-05-08 
 */

package client;

public interface FPPObjectRepository {

	public interface PricingManagerInbox {
		/*Description: web element locator for Completed Deals Field */
		//String lblCompletedDeals = "//*[@id='back-to-top']/div/div[1]/div/div/div[1]/div/div/h4";
		//String lblCompletedDeals = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[1]/div/div/h4";
	//	String lblCompletedDeals = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[1]/div/div/h4";
		
		String lblCompletedDeals="//*[text()='Completed Deals']";
		String lblCompletedDealsBy="xpath";
		
		
		
		
		
		
		/*Description: web element locator for Cycle Time Field */
		//String lblCycleTime = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[1]/div/div/p-selectbutton/div/div[1]/span";
		String lblCycleTime = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[1]/div/div/p-selectbutton/div/div[1]/span";
		/*Description: web element locator for Type Field */
		//String lblType = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[1]/div/div/p-selectbutton/div/div[2]/span";
		String lblType = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[1]/div/div/p-selectbutton/div/div[2]/span";

		/*Description: web element locator for Deal Alerts Field */
		//String lblDealAlerts = "/html/body/app-root/div/app-inbox/div/div/div[1]/div/div/div[2]/div/div/h4";
		//String lblDealAlerts = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[2]/div/div/h4";
		String lblDealAlerts = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[2]/div/div/h4";

		/*Description: web element locator for My Inbox Field */
		//String lblMyInbox = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[3]/div/div/h4";
		String lblMyInbox = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[3]/div/div/h4";

		/*Description: web element locator for My Dashboard Field */
		//String lblMyDashboard = "/html/body/app-root/div/app-inbox/div/div/h2";
		//String lblMyDashboard = "/html/body/app-root/div/app-inbox/div/div/div[1]/ul/li[1]";
		String lblMyDashboard = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[1]/ul/li[1]";
		//*[@id="back-to-top"]/div/h2/text()
		/*Description: web element locator for Date Field */
		//String lblDate = "/html/body/app-root/div/app-inbox/div/div/h2/span[2]";
		//String lblDate = "/html/body/app-root/div/app-inbox/div/div/div[1]/ul/li[3]";
		String lblDate = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[1]/ul/li[3]";
		
		//String lblDealInbox = "/html/body/app-root/div/app-inbox/div/div/div[2]/ul/li[1]";
		//String lblDealInbox = "/html/body/app-root/div/app-inbox/div/div/div[3]/ul/li[1]";
		String lblDealInbox = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[3]/ul/li[1]";
		//String lblTotDealCount = "/html/body/app-root/div/app-inbox/div/div/div[2]/ul/li[2]/div";
		//String lblTotDealCount = "/html/body/app-root/div/app-inbox/div/div/div[3]/ul/li[2]/div";
		String lblTotDealCount = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[3]/ul/li[2]/div";
		
		String lblCurrMonth = "g.highcharts-xaxis-labels > text:nth-child(4) > tspan:nth-child(1)";
		String lbllastMonth = "g.highcharts-xaxis-labels > text:nth-child(3) > tspan:nth-child(1)";
		String lbl2ndlastMonth = "g.highcharts-xaxis-labels > text:nth-child(2) > tspan:nth-child(1)";
		String lbl3rdlastMonth = "g.highcharts-xaxis-labels > text:nth-child(1) > tspan:nth-child(1)";		

		String lblCompletedDealsType1 = "g.highcharts-legend-item:nth-child(1) > text:nth-child(1) > tspan:nth-child(1)";
		String lblCompletedDealsType2 = "g.highcharts-legend-item:nth-child(2) > text:nth-child(1) > tspan:nth-child(1)";
		String lblCompletedDealsType3 = "g.highcharts-legend-item:nth-child(3) > text:nth-child(1) > tspan:nth-child(1)";
		String lblCompletedDealsType4 = "g.highcharts-legend-item:nth-child(4) > text:nth-child(1) > tspan:nth-child(1)";		

		//String lblMyInboxDealStatus1 = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[1]/div[2]";
		String lblMyInboxDealStatus1 = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div[1]/div[2]";
		//String lblMyInboxDealStatus2 = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div[2]";
		String lblMyInboxDealStatus2 = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div[2]";
		//String lblMyInboxDealStatus3 = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[3]/div/div[2]";
		String lblMyInboxDealStatus3 = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div[3]/div/div[2]";
		//String lblMyInboxDealStatus4 = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[3]/div/div/div/div[3]/div[1]/div[2]";
		String lblMyInboxDealStatus4 = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[3]/div/div/div/div[3]/div[1]/div[2]";
		//String lblMyInboxDealStatus5 = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/div/div[3]/div/div/div/div[3]/div[2]/div[2]";
		String lblMyInboxDealStatus5 = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[2]/div/div/div[3]/div/div/div/div[3]/div[2]/div[2]";
		
		/*Description: web element locator for Current Field */
		//String lblCurrent = "/html/body/app-root/div/app-inbox/div/div/div[4]/div/div/div[1]/p-selectbutton/div/div[1]/span";
		String lblCurrent = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[4]/div/div[1]/p-selectbutton/div/div[1]/span";
				
		//String lblScoreInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[1]/span[2]";
		String lblScoreInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[1]/span[2]";
		//String lblCustomerInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[2]/span[2]";
		String lblCustomerInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[2]/span[2]";
		//String lblDealNameInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[3]/span[2]";	
		String lblDealNameInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[3]/span[2]";
		//String lblDealVersionInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[4]/span[2]";
		String lblDealVersionInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[4]/span[2]";
		//String lblProductsInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[5]/span[2]";
		String lblProductsInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[5]/span[2]";
		//String lblDealNotesInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[6]/span[2]";
		String lblDealNotesInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[6]/span[2]";
		//String ddwMRCNRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[7]/span[2]/p-dropdown/div/div[3]/span";
		//String ddwMRCNRCInboxHeader = "div.ui-datatable-tablewrapper > table > thead > tr > th:nth-child(7) > span:nth-child(2) > p-dropdown > div > div:nth-child(4) > span";
		String ddwMRCNRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[7]/span[2]/p-dropdown/div/div[3]/span";
		String lblMRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[7]/span[2]/p-dropdown/div/div[4]/div/ul/li[1]/span";
		//String lblNRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[7]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";
		String lblNRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[7]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";
		//String ddwTCVEBITInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[3]/span";
		String ddwTCVEBITInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[3]/span";
		String lblTCVInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[4]/div/ul/li[1]/span";	
		//String lblEBITInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";	
		String lblEBITInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";
		//String lblApprovalLevelInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[9]/span[2]";
		String lblApprovalLevelInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[9]/span[2]";	
		//String ddwDCDDIInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[10]/span[2]/p-dropdown/div/div[3]/span";
		String ddwDCDDIInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[10]/span[2]/p-dropdown/div/div[3]/span";
		//String lblDateCreatedInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[10]/span[2]/p-dropdown/div/div[4]/div/ul/li[1]/span";	
		String lblDateCreatedInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[10]/span[2]/p-dropdown/div/div[4]/div/ul/li[1]/span";
		String lblDueDateInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[10]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";	

		String secPendingDeals ="svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(2)";
		String secReworkDeals ="svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(3)";
		String secPricingDeals ="svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(4)";
		String secAwApprovalDeals ="svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(5)";
		String secCompletedDeals ="svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(1)";
		
		String cntDoughnutChart = "div.flexbox > div:nth-child(3) > div > div > div > div > chart > div > svg > g:nth-child(10)> text > tspan:nth-child(2)";
				
		//String lblArchive = "/html/body/app-root/div/app-inbox/div/div/div[4]/div/div/div[1]/p-selectbutton/div/div[2]/span";
		String lblArchive = "/html/body/app-root/div/app-inbox/div/div/div[1]/div[4]/div/div[1]/p-selectbutton/div/div[2]/span";
		
		//String lblArchiveScoreInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[1]/span[2]";
		String lblArchiveScoreInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[1]/span[2]";
		//String lblArchiveDealTypeInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/table/thead/tr/th[2]/span[2]";
		String lblArchiveDealTypeInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[2]/span[2]";
		String lblArchiveCustomerInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[3]/span[2]";	
		String lblArchiveDealNameInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[4]/span[2]";	
		String lblArchiveDealVersionInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[5]/span[2]";	
		String lblArchiveProductsInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[6]/span[2]";
		String lblArchiveDealNotesInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[7]/span[2]";		
		String ddwArchiveMRCNRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[3]/span";
		String lblArchiveMRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[4]/div/ul/li[1]/span";
		String lblArchiveNRCInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[8]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";	
		String ddwArchiveTCVEBITInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[9]/span[2]/p-dropdown/div/div[3]/span";
		String lblArchiveTCVInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[9]/span[2]/p-dropdown/div/div[4]/div/ul/li[1]/span";	
		String lblArchiveEBITInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[9]/span[2]/p-dropdown/div/div[4]/div/ul/li[2]/span";	
		String lblArchiveApprovalLevelInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[10]/span[2]";	
		String lblArchiveDateCompletedInboxHeader = "/html/body/app-root/div/app-inbox/div/div/div[2]/div/p-datatable/div/div[1]/div/div[1]/div/table/thead/tr/th[11]/span[2]";	
				
	}

	public interface Login {
		
		//String tbxUserid = "/html/body/form/table[3]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/input";
		//String tbxPassword = "/html/body/form/table[3]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/input";		
		String lblUserid = "//*[@id='lblUserID']";	
		//String btnOK = "/html/body/form/table[3]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[3]/td/input";	
		
		String tbxUserid="//input[@name='username']";
		String tbxUseridBy="xpath";
		
		String tbxPassword="//input[@name='password']";
		String tbxPasswordBy="xpath";
		
		String btnOk="//input[@type='submit']";
		String btnOkBy="xpath";
		
		
		
		
		
		
		
	}
}
