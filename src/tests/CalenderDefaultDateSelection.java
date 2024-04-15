package tests;
//63.Handling Calendar UI in travel websites using Selenium 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDefaultDateSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				//System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				Thread.sleep(1000);
				//input[@value='Chennai (MAA)']
				driver.findElement(By.xpath("//a[@value='BLR']")).click();
				System.out.println("Clicked on  BLR");
				Thread.sleep(1000);
				//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
				//56.Parent Child Relationship locatore to identify the objects uniquely 
				driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();
				System.out.println("Clicked on  Chennai");
				//.ui-state-default.ui-state-highlight
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();				
				System.out.println("Selected Current date ");
				//driver.close();

	}

}
