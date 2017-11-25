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
public class eBayLoginpage {

	/**
	 * @param args
	 */
		private static Logger log = 
				LogManager.getLogger(eBayLoginpage.class.getName());
		WebDriver driver;
		public eBayLoginpage(WebDriver driver){
			this.driver = driver;
		}
		//driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=");
		//log.info("open the login page success");
		By username = By.xpath("//input[@id='userid']");
		By password = By.xpath("//input[@id='pass']");
		By submit = By.xpath("//input[@id='sgnBt']");
		By home = By.id("gh-la");
		//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("abc");;
		//driver.close();
		public  WebElement Emailid(){
			return driver.findElement(username);
		}
		public WebElement password(){
			return driver.findElement(password);
		}
		public WebElement submit(){
			return driver.findElement(submit);
		}
		public WebElement home(){
			return driver.findElement(home);
		}
		
	}


