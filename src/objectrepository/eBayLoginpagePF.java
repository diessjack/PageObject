/**
 * 
 */
package objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Oct 23, 2017 12:57:24 AM 
 */
public class eBayLoginpagePF {

	/**
	 * @param args
	 */
		WebDriver driver;
		public eBayLoginpagePF(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		//driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=");
		//log.info("open the login page success");
		/*By username = By.xpath("//input[@id='userid']");
		By password = By.xpath("//input[@id='pass']");
		By submit = By.xpath("//input[@id='sgnBt']");
		By home = By.id("gh-la");
		//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("abc");;
		//driver.close();*/
		
		@FindBy(xpath="//input[@id='userid']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='pass']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='sgnBt']")
		WebElement submit;
		
		@FindBy(id="gh-la")
		WebElement home;
		
		public  WebElement Emailid(){
			return username;
		}
		public WebElement password(){
			return password;
		}
		public WebElement submit(){
			return submit;
		}
		public WebElement home(){
			return home;
		}
		
	}


