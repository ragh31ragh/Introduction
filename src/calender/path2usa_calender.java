package calender;
//98.Handling Calender UI in Travel Websites 
//99.Generic method to handle calender with month and date
//100.Solved Example on calender methods.
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class path2usa_calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Scroll the Page
		driver.get("https://www.path2usa.com/travel-companion/");		
		// Scroll the Page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		// Click on the Date field
		Thread.sleep(3000);
		WebElement Date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']"));
		// js.executeScript("arguments[0].scrollIntoView(true);", Date);
		Date.click();
		//div[@class='dayContainer']/span
		//List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day"));
		
		//Selecting the date of April 18 
		while (! driver.findElement(By.cssSelector(".cur-month")).getText().contains("March")) {
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dayContainer']/span"));
		int noOfDates  = dates.size();
		System.out.println("noOfDates");
		System.out.println(noOfDates);
		
		for (int i = 0;i < noOfDates; i++) {
			String day = dates.get(i).getText();
			System.out.println("day");
			System.out.println(day);
			System.out.println("for loop");
			if ( day.equalsIgnoreCase("18")) {
				//Thread.sleep(2000);
				System.out.println("Inside For Loop");
				System.out.println(dates.get(i).getText());
				dates.get(i).click();
				System.out.println(day);
				//Actions act =  new Actions(driver);
				//act.moveToElement(driver.findElement(By.xpath("//div[@class='dayContainer']/span")).click().perform());
				//act.moveToElement(driver.findElement(By.linkText("Scans"))).click().perform();
				break ;
			}
		}

		

	}

}
