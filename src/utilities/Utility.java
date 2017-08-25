/**
 * This is the utilities class. All the utilities like highlighting fields are defined here. 
 *
 * @author  FPP QE Team, PwC 
 * @version 1.0
 * @since   2017-05-08 
 */

package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testng.AUTBaseTest;

public class Utility extends AUTBaseTest {

	public void highlightElement(WebElement element, String colour) throws InterruptedException {
		Thread.sleep(2000);
		for (int i = 0; i <2; i++) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: "+colour+"; border: 2px solid "+colour+";");
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		}			
	}
	
	
	
	public String datefunc (Date date, String format){
		String Date = null;
		if(format.contains("xx"))
		{
			String[] ss=format.split("xx");			
			for(int i=0;i<(ss.length-1);i++)		
			{
				DateFormat df1 = new SimpleDateFormat(ss[i]);
				ss[i]=(String)(df1.format(date));				
				String[] sss=ss[i].split(" ");
				int tenRemainder = (Integer.parseInt(sss[sss.length-1])) % 10;
				if((Integer.parseInt(sss[sss.length-1]))==11
						||(Integer.parseInt(sss[sss.length-1]))==12
						||(Integer.parseInt(sss[sss.length-1]))==13)
				{
					tenRemainder=0;
				}
				switch (tenRemainder) {
				case 1:
					ss[i]+="st";
					break;
				case 2:
					ss[i]+="nd";
					break;
				case 3:
					ss[i]+="rd";
					break;
				default:
					ss[i]+="th";
					break;
				}
			}
			DateFormat df2 = new SimpleDateFormat(ss[ss.length-1]);
			ss[ss.length-1]=(String)(df2.format(date));
			Date = ss[0];
			for(int i=1;i<ss.length;i++)
			{
				Date += ss[i];
			}
		}
		else
		{
			DateFormat df = new SimpleDateFormat(format);
			Date= (String)(df.format(date));
		}
		return Date;
	}

}
