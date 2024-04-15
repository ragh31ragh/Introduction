package AutomationTestStore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Open the Landing Page
		driver.get("https://automationteststore.com/");
		// Click on Login or Register
		// Find 'Login or Register' element by xpath and click on it
		driver.findElement(By.xpath("//a[contains(text(),'Login or register')]")).click();
		// Find 'Coninue' button and click on it
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
		// AccountFrm_firstname,AccountFrm_lastname
		driver.findElement(By.id("AccountFrm_firstname")).sendKeys("FirstNameOne");
		driver.findElement(By.id("AccountFrm_lastname")).sendKeys("LastNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_email")).sendKeys("FirstNameOne@Ggmail.com");
		//Entering Address now
		driver.findElement(By.cssSelector("#AccountFrm_address_1")).sendKeys("999");
		driver.findElement(By.cssSelector("#AccountFrm_city")).sendKeys("ABCDCity");
		WebElement regionDropdown = driver.findElement(By.cssSelector("#AccountFrm_zone_id"));
		Select dropdownSelection = new Select(regionDropdown);
		//dropdownSelection.selectByIndex(2);
		dropdownSelection.selectByVisibleText("Somerset");
		//Enter postcode ,login , password and confirm password
		driver.findElement(By.cssSelector("#AccountFrm_postcode")).sendKeys("44444");
		driver.findElement(By.cssSelector("#AccountFrm_loginname")).sendKeys("FirstNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_password")).sendKeys("FirstNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_confirm")).sendKeys("FirstNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_agree")).click();
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
		
		/*
		 * #AccountFrm_postcode
44444

#AccountFrm_loginname
FirstNameOne@Ggmail.com


#AccountFrm_password
FirstNameOne@Ggmail.com

#AccountFrm_confirm
FirstNameOne@Ggmail.com
		 */

		
	}

}
