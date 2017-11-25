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

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Oct 23, 2017 8:18:45 PM 
 */
public class homepageapplication {
	private static Logger log = LogManager.getLogger(homepageapplication.class.getName());
	

	/**
	 * @param args
	 */
	@BeforeClass
	public void testBegin(){
		log.info("Login Test Begin");
	}
	@Test
	public void Login(){
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		eBayHomepage rd = new eBayHomepage(driver);
		rd.text().sendKeys("apple");
		log.info("text apple Done.");
		rd.search().click();
		log.info("search for apple Done.");
		driver.close();
		
		
		
		
		
	}
}
