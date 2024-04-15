package Assignments;
/*Assignment 1 : Checkboxes Exercise

1.Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

2.How to get the Count of number of check boxes present in the page*/


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesExcercize {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
				driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
				Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
				System.out.println("No of checkboxes");
				System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				System.out.println("End");
				driver.close();

	}

}
