package sec11_RealTimeExamples;
//93.Print the link counts in the page 
//94.Exercise 1.1. Limiting Webdriver scope.
//95.How to open links in separate tabs.-optimized solution
//96.Getting the Titles of child tabs with optimised while loop


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Get count of links on the page.
		// a - any link will have a tag
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Get count of link present in footer section
		// Footer section inspect
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//Get the count of links present in left columen only.
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		//Click Browser back button and click on the link again.
		//Ctrl + click link - opens in separate tab
		//Get title of pages.

		for (int i = 1 ; i < columnDriver.findElements(By.tagName("a")).size() ; i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			System.out.println(i);
			Thread.sleep(5000);
			}//opens all tabs
		//Print title of all opened pages.
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while ( it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
