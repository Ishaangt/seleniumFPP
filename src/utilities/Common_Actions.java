package utilities;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.concurrent.TimeUnit;

import client2.ObjectRepository;
import client2.ObjectRepository.jMasterData;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;


public class Common_Actions extends AUTBaseTest implements ObjectRepository {

	public void login(String browser,String site,String uid,String psw) {
	 
		try {
			String url = "";
	        //PWC Local		
			/*switch(site) {
				case "pricer": url="http://10.31.101.14:7074/"; break;
				case "approver":url="http://10.31.101.14:7071/"; break;			
				case "seller":url="http://10.31.101.14:7072/"; break; 
				case "admin":url="http://10.31.101.14:7073/"; break;	
			}*/
			//ATT DEV ENVIRONMENT
			switch(site) {
			case "pricer": url="http://zlt16161.vci.att.com:32543/"; break;
			case "approver":url="http://zlt16161.vci.att.com:32544/"; break;
			case "seller":url="http://zlt16161.vci.att.com:32545/"; break;
			case "admin":url="http://zlt16161.vci.att.com:32546/"; break;
		}
			
			WebDriver driver = setupBrowserAbsDriverPath(browser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
						
			setTextboxValue(jLoginPage.tb_uid,jLoginPage.tb_uid_by,uid);
			setTextboxValue(jLoginPage.tb_psw,jLoginPage.tb_psw_by,psw);
			clickButton(jLoginPage.btn_submit,jLoginPage.btn_submit_by);
			} 
		
		catch(Exception e) {System.out.println(e.toString());}

}

	
public void checkpointElement(String eName, String eLocator,String eLocatorBy) {
	 
	try {
		 
		if(isElementPresent(eLocator,eLocatorBy)) {
			Reports.add("Pass","Checking presence of the element [" + eName + "]","Element [" + eName + "] found.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} 
		else { 
			Reports.add("Failed","Checking presence of the element [" + eName + "]","Element [" + eName + "] NOT found.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}

		} 
	
	catch(Exception e) {System.out.println(e.toString());}
}

public void SearchByItemName(String itemType, String itemVal) {
	 
	try {
		//Search for a specific Item in the search box
		getElement(jMasterData.cancelSearch,jMasterData.cancelSearchBy).click();
		Thread.sleep(5000);
		
		setTextboxValue(jMasterData.itemSearchBox,jMasterData.itemSearchBoxBy,itemVal);
		getElement(jMasterData.performSearch,jMasterData.performSearchBy).click();
		Thread.sleep(10000);
		
		List <WebElement> cellVals= getElements(jMasterData.searchItemName,jMasterData.searchItemNameBy);
		String matchFound = new String("No");
		
		if (cellVals.size()==0) {
			Reports.add("Fail", itemType + " Name [" + itemVal  + "] should be found", itemType + " Name [" + itemVal  + "] is NOT found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} 
		else {
		       for (int i = 0; i<cellVals.size();i++) {    	   
		    	   if (cellVals.get(i).getText().equalsIgnoreCase(itemVal)) {
		    		   Reports.add("Pass", itemType + " Name [" + itemVal  + "] should be found", itemType + " Name [" + itemVal  + "] is found", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		    		   matchFound = "Yes";
		    		   break;
		    	   }
		       }
		}
		
		if(matchFound.equalsIgnoreCase("No")) {
			 Reports.add("Fail",itemType + " Name [" + itemVal  + "] should be found", itemType + " Name [" + itemVal  + "] is NOT found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));	
		}
		
		getElement(jMasterData.cancelSearch,jMasterData.cancelSearchBy).click();
		Thread.sleep(10000);
		
		} 
	
	catch(Exception e) {System.out.println(e.toString());}
}





public void goToItemByNameValidatedByID(String itemType, String itemVal, String itemID) {
	 
	try {
		//Search for a specific Item in the search box
		getElement(jMasterData.cancelSearch,jMasterData.cancelSearchBy).click();
		Thread.sleep(5000);
		
		setTextboxValue(jMasterData.itemSearchBox,jMasterData.itemSearchBoxBy,itemVal);
		getElement(jMasterData.performSearch,jMasterData.performSearchBy).click();
		Thread.sleep(5000);
		
		List <WebElement> cellIDs= getElements(jMasterData.searchItemID,jMasterData.searchItemIDBy);
		List <WebElement> cellVals= getElements(jMasterData.searchItemName,jMasterData.searchItemNameBy);
		
		String matchFound = new String("No");
		
			if (cellVals.size()==0) {
				Reports.add("Fail", itemType + " Name [" + itemVal  + "] should be found", itemType + " Name [" + itemVal  + "] is NOT found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			} 
			else {
			       for (int i = 0; i<cellVals.size();i++) {    	   
			    	   if (cellVals.get(i).getText().equalsIgnoreCase(itemVal)) {
			    		   
			    		   if (cellIDs.get(i).getText().equalsIgnoreCase(itemID)) {
			    			   cellVals.get(i).click();
				    		   Thread.sleep(5000);
				    		   
				    		   Reports.add("Pass",itemType + " Name [" + itemVal  + "] should be found", itemType + " Name [" + itemVal  + "] is found", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				    		   matchFound = "Yes";
				    		   break;   
			    		   }
			    		   
			    	   }
			       }
			}
			
			if(matchFound.equalsIgnoreCase("No")) {
				 Reports.add("Fail",itemType + " Name [" + itemVal  + "] should be found", itemType + " Name [" + itemVal  + "] is NOT found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));	
				 getElement(jMasterData.cancelSearch,jMasterData.cancelSearchBy).click();
				 Thread.sleep(10000);
			}
			
		} 
	
	catch(Exception e) {System.out.println(e.toString());}
}



public String returnAttributes (WebElement wbl) {
		//ArrayList<String> attList = new ArrayList<String>();
	  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String attList = (String) js.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index){ items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", wbl).toString();
		
		//Dictionary<String, Object> attributes = (Dictionary<String, Object>) js.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;return items;", wbl);
		
		return (attList);

}


public void goToItemByID(String itemType, String itemID)
{
	try
	{
        String matchFound = new String(); matchFound = "No"; 
		
        switch(itemType) {
		case "Product": 
	    	getElement(jMasterData.productMgr,jMasterData.productMgrBy).click(); break;	
		case "Category":
			getElement(jMasterData.categoryMgr,jMasterData.categoryMgrBy).click(); break;			
		case "LineItem":
			getElement(jMasterData.lineItemMgr,jMasterData.lineItemMgrBy).click(); break; 
		case "Attribute":
			getElement(jMasterData.attributeMgr,jMasterData.attributeMgrBy).click(); break;
		case "Solution":
			//getElement(jMasterData.productMgr,jMasterData.productMgrBy).click(); break;
	    }
        
        Thread.sleep(5000);
        
        List <WebElement> cellIDs= getElements(jMasterData.searchItemID,jMasterData.searchItemIDBy);
		
		for (int i = 0; i<cellIDs.size();i++) {    	   
		    if (cellIDs.get(i).getText().equalsIgnoreCase(itemID)) {
	    	   cellIDs.get(i).click();
			   Thread.sleep(5000);
			   matchFound = "Yes";		   
		       Reports.add("Pass","ID [" + itemID  + "] should be found", "ID [" + itemID  + "] is found", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
    		   break;   
   		   }
			    		   
   	   }

	    if(matchFound.equalsIgnoreCase("No")) {
		  Reports.add("Fail","ID [" + itemID  + "] should be found", "ID [" + itemID  + "] is NOT found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));	
      	}
			
		
	}
	catch(Exception e) 	{System.out.println(e.toString());}
}


public void dropdownSelect(String element_name, WebElement dropdown, String dropdown_val, String selectBy) {

	try	{
		Select dd = new Select(dropdown); 
		
		switch(selectBy) {
		//case "index": dd.selectByIndex(dropdown_val); break;
		case "value":dd.selectByValue(dropdown_val); break;			
		case "visibleText":dd.selectByVisibleText(dropdown_val); break; 	
	    }
		
       	Reports.add("Pass", "Select Value [" + dropdown_val+ "] from the Dropdown list - " + element_name, "Value [" + dropdown_val+ "] is selected from the Dropdown list - " + element_name, LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	catch(Exception e) 	{
		Reports.add("Fail", "Select Value [" + dropdown_val+ "] from the Dropdown list - " + element_name, "Value [" + dropdown_val+ "] can NOT be selected from the Dropdown list - " + element_name, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	
}


public void  readonlyTestSendKeys(String element_name, WebElement wbl, String txt, String expectedReadonly_YesNo)
{
	Boolean enabled;
	
	try	{ enabled = true; wbl.sendKeys(txt);}
	catch(Exception e) 	{enabled = false;}
		
	if(expectedReadonly_YesNo.equalsIgnoreCase("yes")) {
		  if(enabled) {
			  Reports.add("Fail", element_name + " should be READONLY",element_name + " is NOT ReadOnly", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		  }	else {
			  Reports.add("Pass", element_name + " should be READONLY",element_name + " is ReadOnly", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
	} 
	else {
		if(enabled) {
			  Reports.add("Pass", element_name + " should NOT be READONLY",element_name + " is NOT ReadOnly", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		} else {
			  Reports.add("Fail", element_name + " should NOT be READONLY",element_name + " is ReadOnly", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));}
		  }
	}

}
