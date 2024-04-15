package javaStreams;
//119.Automating Paging scenarios to search the data using do while loop.
//Finding the price of Wheat in Pagination
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_Search_RicePrice_119 {

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
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// Print the price of Beans
		// 2.Capture all Web elements values in list[Veggies]
		List<String> price;
		do {
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s -> s.getText().contains("Wheat"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		System.out.println("Price of Wheat");
		price.forEach(a -> System.out.println(a));
		if (price.size() < 1 ){
			driver.findElement(By.cssSelector("[aria-label='Next'")).click();
			
		}
		}while(price.size()<1);


		/*aria-label="Next"
		 * Get the Price of Rice from the table. Scan the column with get text .-Rice
		 * print the price of Rice There is no custom method. We will create one. * Here
		 * if an item is present in any other page , we will not be able to scan.
		 * 
		 */

		/*
		 * If desired, veggie is not present on the first page. 
		 * if (price.size <1) {
		 * click next button driver.scssp[aria-lable='Next']
		 * 
		 * List<String> price ;
		 *  remover from list . }
		 * 
		 * 
		 */

	}

//class to find price of specific item
	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
