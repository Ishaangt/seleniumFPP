package client2;

public interface ObjectRepository {


	public interface jAdminDashboard {
		
		String dashTiles ="//app-dashboard-tiles//*[@class='sub-title']"; String dashTilesBy="xpath";
		
	}
	
    public interface jMasterData {
		
    	//General
		String productMgr ="//div[@class='admin-navigation']//li/a[text()='Product Manager']"; 	String productMgrBy="xpath";
		String categoryMgr ="//div[@class='admin-navigation']//li/a[text()='Category Manager']"; String categoryMgrBy="xpath";
		String lineItemMgr ="//div[@class='admin-navigation']//li/a[text()='Line Item Manager']"; String lineItemMgrBy="xpath";
		String attributeMgr ="//div[@class='admin-navigation']//li/a[text()='Attribute Manager']"; String attributeMgrBy="xpath";
		String inboxHeadTitle ="//div[@class='row inboxhead']//p"; String inboxHeadTitleBy="xpath";
		
		String itemSearchBox = "//*[@class='search-area']/input"; String itemSearchBoxBy = "xpath";
		String performSearch = "//*[@class='search-area']/button[1]"; String performSearchBy = "xpath";
		String cancelSearch = "//*[@class='search-area']/button[2]"; String cancelSearchBy = "xpath";
		
		String searchItemID = "//table[@class='undefined']/tbody//td[1]/span/p"; String searchItemIDBy = "xpath";
		String searchItemName = "//table[@class='undefined']/tbody//td[2]/span/p"; String searchItemNameBy = "xpath";
		
		
		//Data Table
		String dataTable = "//table[@class='undefined']"; String dataTableBy = "xpath"; 
		String columnTitles = "//table[@class='undefined']//span[@class='ui-column-title']"; String columnTitlesBy = "xpath";
		
				
		String createNewPrd = "//*[text()='CREATE NEW PRODUCT']/parent::button"; String createNewPrdBy = "xpath";
		String createNewCat = "//*[text()='CREATE NEW CATEGORY']/parent::button"; String createNewCatBy = "xpath"; 
		String createNewLi = "//*[text()='CREATE NEW LINEITEM']/parent::button"; String createNewLiBy = "xpath";
		String createNewAtt = "//*[text()='CREATE NEW ATTRIBUTE']/parent::button"; String createNewAttBy = "xpath";
				
		
		String createPrdHeader = "//div[@class='row inboxhead']//p[text()='Product Manager - CREATE']"; String createPrdHeaderBy = "xpath";
		String createCatHeader = "//div[@class='row inboxhead']//p[text()='Category Builder - CREATE']"; String createCatHeaderBy = "xpath";
		String createliHeader = "//*[text()='LINE ITEM BUILDER - DRAFT']/parent::button"; String createliHeaderBy = "xpath";
		String createAttHeader = "//div[@class='row inboxhead']//p[text()='Attribute Builder - CREATE']"; String createAttHeaderBy = "xpath";
		
		
		//Edit Product Page
		
		String prodStatusTitle = "//p[contains(text(),'Product Manager')]"; String prodStatusTitleBy = "xpath";
		
		String lblProdID = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product ID')]"; String lblProdIDBy = "xpath";
		String lblProdName = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product Name')]"; String lblProdNameBy = "xpath";
		String lblProdGroup = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product Group')]"; String lblProdGroupBy = "xpath";
		String lblProdType = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product Type')]"; String lblProdTypeBy = "xpath";
		String lblProdVersion = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Version')]"; String lblProdVersionBy = "xpath";
		String lblProdCreatedBy = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Created By')]"; String lblProdCreatedByBy = "xpath";
		String lblProdDateRange = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Effective Date Range')]"; String lblProdDateRangeBy = "xpath";
		String lblProdLastModifiedBy = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Last Modified')]"; String lblProdLastModifiedByBy = "xpath";
		//String lblProdCategory = "//p[@class='category-head' and contains(text(),'Product Categories')]"; String lblProdCategoryBy = "xpath";
		
		String tbProdID = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product ID')]/following-sibling::div/input"; String tbProdIDBy = "xpath";
		String tbProdName = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product Name')]/following-sibling::div/input"; String tbProdNameBy = "xpath";
		String tbProdVersion = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Version')]/following-sibling::div/input"; String tbProdVersionBy = "xpath";
		String tbProdCreatedBy = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Created By')]/following-sibling::div/input"; String tbProdCreatedByBy = "xpath";
		String tbProdLastModifiedBy = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Last Modified')]/following-sibling::div/input"; String tbProdLastModifiedByBy = "xpath";
		
		String selectProdType = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product Type')]/following::p-dropdown[1]//select";String selectProdTypeBy = "xpath"; 
		String selectProdGroup = "//p[@class='col-lg-7 builder-label text-uppercase' and contains(text(),'Product Group')]/following::p-dropdown[1]//select";String selectProdGroupBy = "xpath";
		
		String buttonProdNotes = "//button/*[@class='ui-button-text ui-c' and contains(text(),'Notes')]"; String buttonProdNotesBy = "xpath";
		String buttonAddCategory = "//span[contains(text(),'Add Category')]"; String buttonAddCategoryBy="xpath";
		
		String buttonBack = "//*[@class='icon icon-back']/parent::button"; String buttonBackBy = "xpath";
		String buttonSave = "//*[@class='btn btn-blue-icon margin-l-3 line-item-font']"; String buttonSaveBy = "xpath";
		String buttonActivate = "//*[@class='btn btn-white-action btn-activated margin-l-3 text-uppercase']"; String buttonActivateBy = "xpath";
		
		
		//Effective Date Range - Calendar
		String startDateCalendar = "//p-calendar[1]//span[@class='ui-button-text ui-c']"; String startDateCalendarBy ="xpath";
		String endDateCalendar = "//p-calendar[2]//span[@class='ui-button-text ui-c']"; String endDateCalendarBy ="xpath";
		
		String startMonth = "//p-calendar[1]//span[@class='ui-datepicker-month']"; String startMonthBy = "xpath";
		String endMonth = "//p-calendar[2]//span[@class='ui-datepicker-month']"; String endMonthBy = "xpath";
		
		String startMonthPicker = "//p-calendar[1]//a[@class='ui-datepicker-prev ui-corner-all']"; String startMonthPickerBy = "xpath";
		String endMonthPicker = "//p-calendar[2]//a[@class='ui-datepicker-prev ui-corner-all']"; String endMonthPickerBy = "xpath";
		
		String startYearDropDown = "//p-calendar[1]//select[@class='ui-datepicker-year']"; String startYearDropDownBy = "xpath";
		String endYearDropDown = "//p-calendar[2]//select[@class='ui-datepicker-year']"; String endYearDropDownBy = "xpath";
		
		String startDatePicker = "//p-calendar[1]//table[@class='ui-datepicker-calendar']"; String startDatePickerBy ="xpath";
		String endDatePicker = "//p-calendar[2]//table[@class='ui-datepicker-calendar']"; String endDatePickerBy ="xpath";
		
		
		//Notes
		String buttonNotesAdd = "//div[@class='button-block']/button[text()='ADD']"; String buttonNotesAddBy="xpath";
		String buttonNotesCancel = "//div[@class='button-block']/button[text()='ADD']/preceding-sibling::button"; String buttonNotesCancelBy="xpath";
		String buttonNotesClose = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//h1[text()='Notes']/ancestor::p-dialog//span[@class='fa fa-fw fa-close']";String buttonNotesCloseBy = "xpath";
		
		String notesHeader = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//h1[text()='Notes']"; String notesHeaderBy = "xpath"; 
		String tbNotes = "//div[@class='instruction-comment']/preceding-sibling::textarea"; String tbNotesBy = "xpath";
		String lblNotesCount = "//div[@class='instruction-comment']"; String lblNotesCountBy = "xpath";
		
		
		//Add Categories
		String addCategoryHeader ="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p[text()='ADD CATEGORY']"; String addCategoryHeaderBy ="xpath";
				
		String addCategoryTbSearch = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p[text()='ADD CATEGORY']/..//child::div[@class='search-area']/input"; String addCategoryTbSearchBy="xpath";
		String addCategoryBttSearch ="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p[text()='ADD CATEGORY']/..//child::i[@class='fa fa-search']"; String addCategoryBttSearchBy ="xpath";
		String addCategoryBttClear ="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p[text()='ADD CATEGORY']/..//child::a[@class='clear-link']"; String addCategoryBttClearBy ="xpath";
		
		String addCategoryCheckBox = "//div[@class='ui-datatable-scrollable-body']//table//span[@class='ui-chkbox-icon ui-c']/.."; String addCategoryCheckBoxBy = "xpath";
		String addCategoryName = "//div[@class='ui-datatable-scrollable-body']//table//td[@class='text-left cell-width']/span[2]"; String addCategoryNameBy="xpath";
		String addCategoryID = "//div[@class='ui-datatable-scrollable-body']//table//td[@class='text-left']/span[2]"; String addCategoryIDBy="xpath";
			
		String addCategoryBttnAdd ="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p-footer[@class='product-manager-footer']//button[text()='Add']"; String addCategoryBttnAddBy ="xpath";
		String addCategoryBttCancel ="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p-footer[@class='product-manager-footer']//button[text()='Cancel']"; String addCategoryBttCancelBy ="xpath";
		String addCategoryBttnClose ="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//p[text()='ADD CATEGORY']/ancestor::span/following-sibling::a"; String addCategoryBttnCloseBy ="xpath";
		
		String addCategoryShowError = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//div[@class='showError' and text()='You cannot morethan 10 categories to this Product']"; String addCategoryShowErrorBy ="xpath"; 
		
		//Incomplete Fields
		String incompleteFieldsHeader = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//h1[text()='Incomplete Fields']"; String incompleteFieldsHeaderBy = "xpath";
		String incompleteFieldsText = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//div[@class='attribute-textarea']/p"; String incompleteFieldsTextBy = "xpath";
		
		String incompleteFieldsOk = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//button[text()='OK']"; String incompleteFieldsOkBy = "xpath";
		String incompleteFieldsClose = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow']//h1[text()='Incomplete Fields']/../../following-sibling::a/span[@class='fa fa-fw fa-close']"; String incompleteFieldsCloseBy = "xpath";
		
		
		//Unsaved pop up
		String unsavedPopupHeader = "//p-header[contains(text(),'YOU HAVE UNSAVED CHANGES')]"; String unsavedPopupHeaderBy ="xpath";
		
		String unsavedCloseButton = "//p-header[contains(text(),'YOU HAVE UNSAVED CHANGES')]/../following-sibling::a/span[@class='fa fa-fw fa-close']"; String unsavedCloseButtonBy = "xpath";
		String unsavedCancelButton = "//div[@class='attribute-details alert-details-button button-block']/button[text()='CANCEL']";String unsavedCancelButtonBy = "xpath";
		String unsavedExitUnsavedButton = "//div[@class='attribute-details alert-details-button button-block']/button[text()='EXIT W/O SAVING']";String unsavedExitUnsavedButtonBy = "xpath";
		String unsavedExitSavedButton = "//div[@class='attribute-details alert-details-button button-block']/button[text()='SAVE & EXIT']";String unsavedExitSavedButtonBy = "xpath";
    
    }
	
	
	
	public interface jDealInboxPage {
				
	 String dealNameLink = "//*[contains(text(),'0000004')]//preceding::td[1]/span/p[@class='cursor-pointer overlaylink pull-left marginleft30']"; String dealNameLinkBy = "xpath";
	//Previous xpath:	"//*[contains(text(),'0000004')]//preceding::td[1]/span/p[@class='cursor-pointer overlaylink']"
	 
	}
	 
	 public interface jGlobalNavigation {
	 
	 String globalNavigationPane = "//div[@class='row globemenu']"; String globalNavigationPaneBy = "xpath";
	 String logoAtnt = "//i[@class='icon icon-atnt']"; String logoAtntBy = "xpath";
	 String iconInternet = "//ul[@class='gl-menu']//i[@class='icon icon-internet']"; String iconInternetBy = "xpath";
	 String iconInbox = "//ul[@class='gl-menu']//i[@class='fa fa-envelope-open-o']"; String iconInboxBy = "xpath";
	 String iconChart = "//ul[@class='gl-menu']//i[@class='icon icon-chart']";	 String iconChartBy = "xpath";
	 String iconSearch = "//ul[@class='gl-menu']//i[@class='icon icon-search']"; String iconSearchBy = "xpath";
	 String iconProfitAnalyzer = "//ul[@class='gl-menu mfooter']//i[@class='fa fa-calculator']"; String iconProfitAnalyzerBy = "xpath";
	 String iconQuestion = "//ul[@class='gl-menu mfooter']//i[@class='icon icon-question']"; String iconQuestionBy = "xpath";
	 String iconProfile = "//ul[@class='gl-menu mfooter']//i[@class='icon icon-one_person']"; String iconProfileBy = "xpath"; 
	 String iconLogout = "//ul[@class='gl-menu mfooter']//div[@class='log-container-content']/a"; String iconLogoutBy = "xpath";
	 	 
	
	}

	public interface jDealPortalPage {
	
	String approverLink = "//*[text()='APPROVAL LEVEL']/following-sibling::div"; String approverLinkBy = "xpath";
	
	//String dealApprovers = "//div[@class='card-right-p ']//li//p[@class='name']/br/preceding-sibling::text()";
	String dealApprovers = "//*[text()='APPROVAL LEVEL']/following-sibling::div//li//p[@class='name']";  //to extract text part add this, /br/preceding-sibling::text()
	String dealApproversBy = "xpath";
		
	}

	public interface jDealPreviewPage {
	
	
	}

	public interface jLoginPage {
		
	String tb_uid = "username"; String tb_uid_by = "name"; 
	String tb_psw = "password"; String tb_psw_by = "name";
	String btn_submit = "btnSubmit"; String btn_submit_by = "name";
	
	}

	public interface DealPortal
		{
			String btnUpdateFinancial="//*[text()='Update Financials']";  String btnUpdateFinancialBy="xpath";
			String btnPreviewDeal="//*[text()='Preview DEAL']";	String btnPreviewDealBy="xpath";
			String dealName="//div[@class='pricing-relative']/div";	String dealNameBy="xpath";
			String lblDealWaterfall="//*[text()='Deal Waterfall']";	String lblDealWaterfallBy="xpath";
			String lblLineItemList="//*[text()='Line item  list']";	String lblLineItemListBy="xpath";
			String lblProductList="//*[contains(text(),'Product List')]"; String lblProductListBy="xpath";
			String lblFinancialStatementDealIncome="//*[text()='Financial Statement-Deal Income']"; String lblFinancialStatementDealIncomeBy="xpath";
			String lblFinancialStatementCashFlow="//*[text()='Financial Statement-Cash Flow']"; String lblFinancialStatementCashFlowBy="xpath";
			
			String lblBookOfBusiness="//*[contains(text(),'Book of business')]"; String lblBookOfBusinessBy="xpath";
			
			//Global Navigation
			
			String iconPerson="//*[@class='icon icon-one_person']"; String iconPersonBy="xpath";
			String btnLogout="//*[text()='LOGOUT']"; String btnLogoutBy="xpath";
			
			
			//Pricing Manager Solution,Products and Line Items table Header
	
			String lblScore="//*[text()='Score']"; String lblScoreBy="xpath";
			String lblSolutionProductListItem="//*[text()='Solution/Product/ line item']";String lblSolutionProductListItemBy="xpath";
			String lblVariable="//*[text()='Variable']"; String lblVariableBy="xpath";
			String lblQuantity="//*[text()='Quantity (New/Existing)']";	String lblQuantityBy="xpath";
			String lblListPrice="//*[text()='List Price']";	String lblListPriceBy="xpath";
			String lblDiscount="//*[text()='Discount (Discretionary / Total)']"; String lblDiscountBy="xpath";
			String lblCredits="//*[text()='RATE IMPACTING CREDITS']"; String lblCreditsBy="xpath";
			String lblProposedEffectiveRate="//*[text()='Proposed  Effective Rate']"; String lblProposedEffectiveRateBy="xpath";
			String lblTargetPrice="//*[text()='Target Price']";	String lblTargetPriceBy="xpath";
			String lblEbitMargin="//*[text()='EBIT Margin']"; String lblEbitMarginBy="xpath";
			
	//Expand and collapse button
			String btnExpand_Solution="//*[@class='ui-row-toggler icon fa-fw ui-c icon-pointer']";String btnExpand_SolutionBy="xpath";
			String btnExpand_Product="//*[@class='ui-row-toggler icon fa-fw ui-c icon-pointer']"; String btnExpand_ProductBy="xpath";
			String lbl_Line_Item1="//*[text()='LINE_ITEM1']"; String lbl_Line_Item1By="xpath";		
			String lbl_FinancialStatement="//*[text()='Financial Statement - Deal Income:']"; String lbl_FinancialStatementBy="xpath";
			String btnCollapse_ProductAndSolution="//*[@class='ui-row-toggler icon fa-fw ui-c icon-pointer_down']";	String btnCollapse_ProductAndSolutionBy="xpath";
			
			
	//	Solution table row
		String tblSolution="//*[@class='datatable dt-solution']//tbody[@class='ui-datatable-data ui-widget-content']/tr";	String tblSolutionBy="xpath";
	
	//Line Item table
		
		String tblProductLevel="//*[@class='dt-products inner-table']//*[@class='ui-datatable-data ui-widget-content']";
		String tblProductLevelBy="xpath";
		
		
		
	// Credit tool tip
		String toolTipCredit="//*[@class='row tooltip-box']//div[contains(@class,'col-md-7')]"; String toolTipCreditBy="xpath";
			
	//Waterfall
		String waterfall="//*[@class='waterfall-chart']/div/child::*"; String waterfallBy="xpath";
		
		
		
		
		
		String hightChartAllPillarsAndElements="//*[@class='waterfall-chart']/div/child::*/child::*[@class='highcharts-series-group']/child::*/child::*";
		String hightChartAllPillarsAndElementsBy="xpath";
		
		
		String hightChartAllPillarsAndElementsHoverText= "//*[@class='waterfall-chart']/div/child::*/child::*[@class='highcharts-label highcharts-tooltip highcharts-color-0']/child::*/child::*";
		String hightChartAllPillarsAndElementsHoverTextBy="xpath";
		
		String optWaterfall="//*[text()='Waterfall']";
		String optWaterfallBy="xpath";
		
		String optTimeSeries="//*[text()='Time Series']";
	    String optTimeSeriesBy="xpath";
		
		
			
			
			
			
			
		}

	public interface DealPreview
	
	{
		
	//Key Financial
		String lblKeyFinancial="//*[text()='KEY FINANCIALS']"; String lblKeyFinancialBy="xpath";
		String lblTVC="//*[contains(text(),'TVC')]"; String lblTVCBy="xpath";
		String lblTVC_Approver="//*[text()='TCV']";	String lblTVC_ApproverBy="xpath";
		String lblTotalRevenue="//*[text()='Total Revenue']"; String lblTotalRevenueBy="xpath";
		String lblEBITMargin="//*[text()='EBIT Margin']"; String lblEBITMarginBy="xpath";
		String lblIRR="//*[text()='IRR']";	String lblIRRBy="xpath";
		
	//Deal Note	
		String lblDEALNOTES="//*[text()='DEAL NOTES']"; String lblDEALNOTESBy="xpath";
		
	//Book of Business	
		String lblBOOKOFBUSINESS="//*[text()='BOOK OF BUSINESS']"; String lblBOOKOFBUSINESSBy="xpath";
		String lblAnnualSpend ="//*[contains(text(),'Annual Spend')]"; String lblAnnualSpendBy="xpath";
		String lblATTShareofWallet ="//*[contains(text(),'AT&T Share of Wallet')]"; String lblATTShareofWalletBy="xpath";
		
	//Deals Financial
		String lblDEALFINANCIALS ="//*[text()='DEAL FINANCIALS']";	String lblDEALFINANCIALSBy="xpath";
		String lblListPrice ="//*[text()='List Price']";	String lblListPriceBy="xpath";
		String lblVolumeDiscount  ="//*[contains(text(),'Volume Discount')]";	String lblVolumeDiscountBy="xpath";
		String lblCompetitiveDiscount ="//*[text()='Competitive Discount']"; String lblCompetitiveDiscountBy="xpath";
		String lblPromotion ="//*[contains(text(),'Promotion')]"; String lblPromotionBy="xpath";
		String lblOnVoiceCredit ="//*[text()='On Invoice Credit']"; String lblOnVoiceCreditBy="xpath";
		String lblOn_offCharges ="//*[text()='One off Charges']"; 	String lblOn_offChargesBy="xpath";
		
		String lblOnVoiceCredit_Approver ="//*[text()=' On Voice Credit']"; String lblOnVoiceCredit_ApproverBy="xpath";
		String lblOn_offCharges_Approver ="//*[text()=' On-off Charges']"; 	String lblOn_offCharges_ApproverBy="xpath";
		
		
		
		//Line Item
		String lblLINEITEMS ="//*[text()='LINE ITEMS']"; String lblLINEITEMSBy="xpath";
		String tblLineItem="//*[@class='col-lg-10 TableMarginLeft']//tr";String tblLineItemBy="xpath";
		
				
		
	}

	public interface Landing_Approver{
	
		String lblMyDashboard="//*[text()='My Dashboard']";	String lblMyDashboardBy="xpath";
		String lblDealAlert="//*[text()='Deal Alerts']";	String lblDealAlertBy="xpath";
		String lblDealInbox="//*[text()='Deal Inbox']"; String lblDealInboxBy="xpath";
		String tblDealInbox="//tbody[@class='ui-datatable-data ui-widget-content']"; String tblDealInboxBy="xpath";
	
	}

	public interface Landing_PricingManager{
	
		String lblMyDashboard="//*[text()='My Dashboard']";	String lblMyDashboardBy="xpath";
		String lblCmpltdDeals="//*[text()='Completed Deals']"; String lblCmpltdDealsBy="xpath";
		String lblMyInbox="//*[text()='My Inbox']";  String lblMyInboxBy="xpath";
		String lblDealAlert="//*[text()='Deal Alerts']"; String lblDealAlertBy="xpath";
		String lblDealInbox="//*[text()='Deal Inbox']";	String lblDealInboxBy="xpath";
		String tblDealInbox="//tbody[@class='ui-datatable-data ui-widget-content']"; String tblDealInboxBy="xpath";
		String tblHeaderDealInbox="//*[@class='ui-datatable-thead']/tr/th/span[3]"; String tblHeaderDealInboxBy="xpath";
		String tblHeaderScore="//*[text()='Score']"; String tblHeaderScoreBy="xpath";
		String btnCurrent="//*[text()='Current']"; String btnCurrentBy="xpath";
		String btnArchive="//*[text()='Archive']"; String btnArchiveBy="xpath";
		
		//COMPLETED DEALS
		String lblAllMonth_CompletedDeal="//*[contains(@class,'highcharts-axis-labels highcharts-xaxis')]/text/tspan"; String lblAllMonth_CompletedDealBy="xpath";
		
	}

	public interface Landing_Seller
	{
		String lblYouInClear="//p[@class='altmsg']"; String lblYouInClearBy="xpath";
		
		//Completed Deal -x label
		String lblAllMonth_CompletedDeal="//*[@class='highcharts-axis-labels highcharts-xaxis-labels ']/child::*/child::*"; String lblAllMonth_CompletedDealBy="xpath";
		
		//Completed DEal -y label
		String lblNumberofDeals_CompletedDeal="//*[@class='highcharts-axis-labels highcharts-yaxis-labels ']/text/tspan"; 	String lblNumberofDeals_CompletedDealBy="xpath";
		String currentMonthPillar_CompletedDeal="//*[@x='269'and @height>0]"; String currentMonthPillar_CompletedDealBy="xpath";
		String currentMonthLess1Pillar_CompletedDeal="//*[@x='186'and @height>0]"; 	String currentMonthLess1Pillar_CompletedDealBy="xpath";
		String currentMonthLess2Pillar_CompletedDeal="//*[@x='104'and @height>0]"; String currentMonthLess2Pillar_CompletedDealBy="xpath";
		String currentMonthLess3Pillar_CompletedDeal="//*[@x='21'and @height>0]"; String currentMonthLess3Pillar_CompletedDealBy="xpath";
		
		}

	public interface Login1 {
	
	
		String lblUserid = "//*[@id='lblUserID']";	
		String tbxUserid="//input[@name='username']"; String tbxUseridBy="xpath";
		String tbxPassword="//input[@name='password']"; String tbxPasswordBy="xpath";
		String btnOk="//input[@type='submit']";	String btnOkBy="xpath";
		String unauthorizedLoginMessage="//*[text()='Not a Valid User.']"; 	String unauthorizedLoginMessageBy="xpath";
	
	}
	
	


}
