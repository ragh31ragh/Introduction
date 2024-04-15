package javaStreams;
//118.Build Custom Selenium methods using Streams Mapper
//Printing price of Beans or Banana which is present in first page.
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class priceOfVeggie_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Navigate to home page.
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// 1.Click on column xpath //tr/th[1]-Sorting 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Print the price of Beans 
		// 2.Capture all Web elements values in list[Veggies]
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> price = elementList.stream().filter( s -> s.getText().contains("Banana")).map( s-> getPriceVeggie(s)).collect(Collectors.toList());
		System.out.println("Price of Banana");
		price.forEach(a -> System.out.println(a) );

		/*
		 * Get the Price of Rice from the table. 
		 * Scan the column with get text .-Rice
		 * print the price of Rice
		 * There is no custom method. We will create one.
		 *   * 
		 * Here if an item is present in any other page , we will not be able to scan.
		 * 
		 */
		

	}
//class to find price of specific item
	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}