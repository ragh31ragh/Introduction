package Assignments;
//After 104 Lecture 
//Assignment 7 :Web tables assignment 


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class after104_WebTablesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print Number of rows 
		 * Print Number of columns 
		 * Print 2nd Row of data
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Print Number of rows 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.Scrollby(0,500)");
		js.executeScript("window.scrollBy(0,600)");
		int rowsNumber = driver.findElements(By.xpath("//table[@class='table-display']//tr")).size();
		System.out.println(rowsNumber);
		/*
		 * .table-display
		 * table id product
		 * //table[@id='product']
		 * //table[@class='table-display']
		 * //table[@class='table-display']//tr
		 * List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		 * List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		 */
		
		 //Print Number of columns 
		////table[@class='table-display']//tr[2]/td
		int colNumber = driver.findElements(By.xpath("//table[@class='table-display']//tr[2]/td")).size();
		System.out.println(colNumber);
		
		 //Print 2nd Row of data
		//table[@class='table-display']//tr[2]/td
		//Put for loop and iterate over each
		//after104_AutocompleteDropdown
		int cols = driver.findElements(By.xpath("//table[@class='table-display']//tr[2]/td")).size();
		for (int i = 0; i < cols ;i++) {
			//table[@class='table-display']//tr[2]/td[1]
			System.out.println(driver.findElements(By.xpath("//table[@class='table-display']//tr[2]/td")).get(i).getText());
		}

	}

}
