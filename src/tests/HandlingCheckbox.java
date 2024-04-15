package tests;
//60.Handling checkbox and getting the size of them with Selenium 
//61.Importance of Assertion in Automation Testing and how to use them
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				//ctl00_mainContent_chk_SeniorCitizenDiscount
				//input[id*='SeniorCitizenDiscount']
				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				//input[type*='checkbox']
				
				//Find all the checkboxes available in page
				System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
				driver.close();
						

	}

}
