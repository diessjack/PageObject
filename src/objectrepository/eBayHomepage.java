/**
 * 
 */
package objectrepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Oct 23, 2017 12:57:24 AM 
 */
public class eBayHomepage {

	/**
	 * @param args
	 */
		private static Logger log = 
				LogManager.getLogger(eBayHomepage.class.getName());
		WebDriver driver;
		public eBayHomepage(WebDriver driver){
			this.driver = driver;
		}
		By text =By.xpath("//input[@id='gh-ac']");
		By search = By.xpath("html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input");
		public  WebElement text(){
			return driver.findElement(text);
		}
		public  WebElement search(){
			return driver.findElement(search);
		}

		
	}


