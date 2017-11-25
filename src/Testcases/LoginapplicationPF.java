/**
 * 
 */
package Testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.eBayHomepage;
import objectrepository.eBayLoginpagePF;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Oct 23, 2017 8:18:45 PM 
 */
public class LoginapplicationPF {
	private static Logger log = LogManager.getLogger(LoginapplicationPF.class.getName());
	

	/**
	 * @param args
	 */
	@BeforeClass
	public void testBegin(){
		if (log.isDebugEnabled()) {
			log.debug("entering testBegin()");
		}
		log.info("Login Test Begin");
		if (log.isDebugEnabled()) {
			log.debug("exiting testBegin()");
		}
	}
	@Test
	public void Login(){
		if (log.isDebugEnabled()) {
			log.debug("entering Login()");
		}
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=");
		eBayLoginpagePF rd = new eBayLoginpagePF(driver);
		rd.Emailid().sendKeys("fenghaoshu@gamil.com");
		log.info("SendEmailID success");
		rd.password().sendKeys("1a4830b");
		log.info("SendPassword success");
		rd.submit().click();
		log.info("clicked login button");
		rd.home().click();
		log.info("clicked icon back to homepage");
		eBayHomepage hp = new eBayHomepage(driver);
		hp.text().sendKeys("apple");
		log.info("text apple Done.");
		hp.search().click();
		log.info("search for apple Done.");
		driver.close();
		log.info("Test finish closed chrome.");
		if (log.isDebugEnabled()) {
			log.debug("exiting Login()");
		}
		
		
		
		
		
	}
}
