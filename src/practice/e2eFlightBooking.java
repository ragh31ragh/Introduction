package practice;
//66.End to End automation using all UI elements with selenium
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eFlightBooking {

	public static void main(String[] args) throws InterruptedException {
				/*
				 * e2eFlightBooking class 
				-open browser 
				-hit url 
				-Select One way radio button.
				-From to option del to mumbai also 

				 */
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//a[@value='BLR']")).click();
				driver.findElement(By.xpath("//a[@value='DEL']")).click();
				System.out.println("Clicked on  DEL");
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();
				driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='BOM']")).click();
				System.out.println("Clicked on  Mumbai");
				/*
				 * -select current date 
				-Make sure return date is disabled .
				-Family and freinds
				-5 Adults 
				-And click on Search Button 
				 */
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();				
				//System.out.println("Selected Current date ");
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				//#spclearDate
				driver.findElement(By.cssSelector("#spclearDate")).click();
				if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
				{
					System.out.println("To date is not selected");
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertFalse(false);
				}
				//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(1000);
				//Example of For loop
				for ( int i=1;i<5;i++) {
					driver.findElement(By.id("hrefIncAdt")).click();
				}
						
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				driver.findElement(By.id("btnclosepaxoption")).click();
				//Senior citizen and click on search
				WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticDropdown);
				dropdown.selectByValue("INR");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
				////input[@name='ctl00$mainContent$btn_FindFlights']
				driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
				System.out.println("End of code ");
				//driver.close();


	}

}
