package tests;
//53.Updated lecture on latest Dropdown looping UI (for and while loop example)

//13_Jan-2024
//64.Validating UI elements are disabled or enabled with Attribute
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		//Code to select 5 Adult Passengers
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		//Example of while loop
		/*//int i = 1 ;
		//while (i < 5)
		//{
			//driver.findElement(By.id("hrefIncAdt")).click();
			//i++ ;
		//}
		 
		 */
		
		//Example of For loop
		for ( int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
				
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//System.out.println("Before");
		//driver.findElement(By.id("Div1")).getAttribute("style").contains("1");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("To date is selected");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println("After");
		//<div id="Div1" class="picker-second" style="display: block; opacity: 0.5;" xpath="1">
		
		//driver.close();
	}

}
