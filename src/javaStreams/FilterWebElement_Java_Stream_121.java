package javaStreams;
//121.Filter the WebElement using Selenium Java Streams

//122.Code Download

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebElement_Java_Stream_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Navigate to home page.
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// 1.Click on column xpath //tr/th[1]-Sorting
		// search-field
		driver.findElement(By.id("search-field")).sendKeys("pple");
		/*
		 * find all elements in the rowCount
		 *  List<WebElement> allVeggies = find elements
		 * //tr/td[1] 
		 * 
		 * Check if every element has rice. 
		 * List filteredList =
		 * veggies.stream().filter(Veggie->veggie.gettext()contains("Rice").collect.(
		 * collectors.toList)
		 * 
		 * //Above Assert.assertequals(veggies.size.filteredlist(size))
		 * 
		 * After sendkeys . put debug point . resume.
		 * 
		 */
		List<WebElement> allVeggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement>  filteredList = allVeggies.stream().filter(veggie -> veggie.getText().contains("pple")).collect(Collectors.toList());
		Assert.assertEquals(allVeggies.size(), filteredList.size());
		
		

	}

}
