package client2;

import java.util.List;

import org.openqa.selenium.WebElement;

import client2.ObjectRepository.jAdminDashboard;
import client2.ObjectRepository.jMasterData;
import testng.AUTBaseTest;
import testng.CaptureScreen;
import testng.LogAs;
import testng.Reports;
import testng.CaptureScreen.ScreenshotOf;
import utilities.Common_Actions;

public class Admin_MasterData extends AUTBaseTest implements ObjectRepository {

	public void goToMasterData(String dash_tiles)
	{
		try
		{
			Common_Actions objCa = new Common_Actions();
			objCa.checkpointElement("Admin Dashboard Tiles",jAdminDashboard.dashTiles,jAdminDashboard.dashTilesBy);
		    
			List<WebElement> opts = getElements(jAdminDashboard.dashTiles,jAdminDashboard.dashTilesBy);  
				
			for(int i=0;i<opts.size();i++) {
					
			  if (opts.get(i).getText().equalsIgnoreCase(dash_tiles)) {
				  Reports.add("Pass","Master Data tile should be displayed", "Master Data tile is displayed.", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	              moveToElement(opts.get(i)); 
	              opts.get(i).click();
	              //Thread.sleep(7000);
				  break;
			  } 		   
	    	  //Reports.add("Failed","Master Data tile should be displayed", "Master Data tile is NOT displayed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			
			
			objCa.checkpointElement("Product Manager",jMasterData.productMgr,jMasterData.productMgrBy);
			Thread.sleep(10000);
			
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public void default_method2()
	{
		try
		{
           //Code to Paste here
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public void default_method3()
	{
		try
		{
           //Code to Paste here
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	public void default_method4()
	{
		try
		{
           //Code to Paste here
		}
		catch(Exception e) 	{System.out.println(e.toString());}
	}
	
	
	
}
