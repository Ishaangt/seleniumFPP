package client2;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import client2.ObjectRepository.jAdminDashboard;
import client2.ObjectRepository.jMasterData;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;
import utilities.Utility;

public class Admin_Product extends AUTBaseTest implements ObjectRepository {

	Common_Actions objCa = new Common_Actions(); Utility utl = new Utility();
	
	public void checkIfHighlighted()
	{
		try
		{
			//Code to add for checking whether the current selection is highlighted or not
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public void checkProductColumnHeaders()
	{
		try
		{
			getElement(jMasterData.productMgr,jMasterData.productMgrBy).findElement(By.xpath("..")).click();
			if (getElement(jMasterData.inboxHeadTitle,jMasterData.inboxHeadTitleBy).getText().equalsIgnoreCase("PRODUCT MANAGER")) {
				Reports.add("Pass","Product Manager page should be displayed", "Product Manager page is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			} else {
				Reports.add("Fail","Product Manager page should be displayed", "Product Manager page is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
					
			List <WebElement> colheads = getElements(jMasterData.columnTitles,jMasterData.columnTitlesBy);
			
			if (colheads.get(0).getText().equalsIgnoreCase("PRODUCT ID")) {
				Reports.add("Pass","Column [Product ID] should be displayed", "Column [Product ID] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}   else {
				Reports.add("Fail","Column [Product ID] should be displayed", "Column [Product ID] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			
			if (colheads.get(1).getText().equalsIgnoreCase("PRODUCT NAME")) {
				Reports.add("Pass","Column [Product NAME] should be displayed", "Column [Product NAME] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}   else {
				Reports.add("Fail","Column [Product NAME] should be displayed", "Column [Product NAME] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			
			if (colheads.get(2).getText().equalsIgnoreCase("PRODUCT STATUS")) {
				Reports.add("Pass","Column [Product STATUS] should be displayed", "Column [Product STATUS] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}   else {
				Reports.add("Fail","Column [Product STATUS] should be displayed", "Column [Product STATUS] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			
			if (colheads.get(3).getText().equalsIgnoreCase("CREATED BY")) {
				Reports.add("Pass","Column [CREATED BY] should be displayed", "Column [CREATED BY] is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}   else {
				Reports.add("Fail","Column [CREATED BY] should be displayed", "Column [CREATED BY] is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public void checkProductPageElements()
	{
		try
		{
			
			objCa.checkpointElement("Label - Product ID",jMasterData.lblProdID,"xpath");
			objCa.checkpointElement("Product ID Textbox",jMasterData.tbProdID,"xpath");
			
			objCa.checkpointElement("Label - Product Type",jMasterData.lblProdType,"xpath");
			objCa.checkpointElement("Product Type List",jMasterData.selectProdType,"xpath");
			
			objCa.checkpointElement("Label - Product Group",jMasterData.lblProdGroup,"xpath");
			objCa.checkpointElement("Product Group List",jMasterData.selectProdGroup,"xpath");
			
			objCa.checkpointElement("Label - Product Version",jMasterData.lblProdVersion,"xpath");
			objCa.checkpointElement("Product version Textbox",jMasterData.tbProdVersion,"xpath");
			
			objCa.checkpointElement("Add Category button",jMasterData.buttonAddCategory,"xpath");
			
			objCa.checkpointElement("Label - Effective Date Range",jMasterData.lblProdDateRange,"xpath");
			objCa.checkpointElement("Start Date Calendar",jMasterData.startDateCalendar,"xpath");
			objCa.checkpointElement("End Date Calendar",jMasterData.endDateCalendar,"xpath");
			
			
			objCa.checkpointElement("Product Status label",jMasterData.prodStatusTitle,"xpath");
			
			objCa.checkpointElement("Notes Button",jMasterData.buttonProdNotes,"xpath");
		
			objCa.checkpointElement("Label - Last Modified By",jMasterData.lblProdLastModifiedBy,"xpath");
			objCa.checkpointElement("Last Modified By - Textbox",jMasterData.tbProdLastModifiedBy,"xpath");		

			objCa.checkpointElement("Label - Created By",jMasterData.lblProdCreatedBy,"xpath");
			objCa.checkpointElement("Created By - Textbox",jMasterData.tbProdCreatedBy,"xpath");
			
			
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public void verifyIncompleteFields()
	{
		try
		{
			getElement(jMasterData.buttonSave,jMasterData.buttonSaveBy).click();
			Thread.sleep(3000);
			
			objCa.checkpointElement("Incomplete Fields Validation", jMasterData.incompleteFieldsHeader, jMasterData.incompleteFieldsHeaderBy);
			
			List<WebElement> opts = getElements(jMasterData.incompleteFieldsText,jMasterData.incompleteFieldsTextBy);  
			
			String msgStr = new String();
			for(int i=0;i<opts.size();i++) {
				msgStr = msgStr + opts.get(i).getText().toString() + System.lineSeparator();
	        }
			
			Reports.add("Pass","Incomplete Fields Message", msgStr, LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));		
			
			getElement(jMasterData.incompleteFieldsOk,jMasterData.incompleteFieldsOkBy).click();
			
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	
	
	public void verifyNewProductFieldsBehaviour(String noteStr)
	{
		try
		{
           objCa.readonlyTestSendKeys("Product ID",getElement(jMasterData.tbProdID,jMasterData.tbProdIDBy), "testing", "yes");
           objCa.readonlyTestSendKeys("Product Name",getElement(jMasterData.tbProdName,jMasterData.tbProdNameBy), "testing", "no");
           
           objCa.readonlyTestSendKeys("Product Version",getElement(jMasterData.tbProdVersion,jMasterData.tbProdVersionBy), "5", "no");
           objCa.readonlyTestSendKeys("Last Modified By",getElement(jMasterData.tbProdLastModifiedBy,jMasterData.tbProdLastModifiedByBy), "author 1", "yes");
           objCa.readonlyTestSendKeys("Created By",getElement(jMasterData.tbProdCreatedBy,jMasterData.tbProdCreatedByBy), "author 2", "yes");
           
          // objCa.dropdownSelect("Product Type", getElement(jMasterData.selectProdType,jMasterData.selectProdTypeBy), "Manual","value");
          // objCa.dropdownSelect("Product Group", getElement(jMasterData.selectProdGroup,jMasterData.selectProdGroupBy), "PRO_GP7","value");
          
           selectDropDownValueByType(jMasterData.selectProdType,jMasterData.selectProdTypeBy,"Manual","Visible Text");
           selectDropDownValueByType(jMasterData.selectProdGroup,jMasterData.selectProdGroupBy, "PRO_GP7","Visible Text");
           
           addNotes(noteStr);
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public String getProductStatus()
	{
	    String prodStatus = new String();
	    prodStatus = getElement(jMasterData.prodStatusTitle,jMasterData.prodStatusTitleBy).getText().toString();
	
	    List<String> lblStr = Arrays.asList(prodStatus.split("-"));
	    prodStatus = lblStr.get(1).trim();  

		return(prodStatus);
	}
	
	public void addNotes(String noteStr)
	{
		try {
			getElement(jMasterData.buttonProdNotes,jMasterData.buttonProdNotesBy).click();
			objCa.checkpointElement("Notes Popup", jMasterData.notesHeader,jMasterData.notesHeaderBy);
			
			getElement(jMasterData.tbNotes,jMasterData.tbNotesBy).sendKeys(noteStr);
			Reports.add("Check","Note remaining chanracter count",getElement(jMasterData.lblNotesCount,jMasterData.lblNotesCountBy).getText().toString(), LogAs.INFO, null);
			
			getElement(jMasterData.buttonNotesAdd,jMasterData.buttonNotesAddBy).click();
			Reports.add("Pass","Add Notes","Successfully added Notes," + System.lineSeparator() + noteStr, LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		catch(Exception e) 	{
			Reports.add("Fail","Add Notes","Failed to Add Notes", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
	}
	
	public void addProdCategory()
	{
		try {
		  
		}
		catch(Exception e) 	{
		
		}
	}
	
	
}