package practice;
//71.Problem - Adding items into Cart for Ecommerce App
//72.Sending array of products to cart for checkout.
//73.Building Programming Logic to process items in array of Cart 
//74.Debugging the code to understand how flows is being built 
//75. Fixing the problem of inconsistent locators and making tests clean 
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		int j = 0 ;
		
		String[] vegNames = {"Cucumber","Brocolli","Beetroot","Potato","Mushroom"};
		List<String> vegNamesList = Arrays.asList(vegNames);
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for ( int i = 0; i < products.size(); i++) {
			String[] vegName = products.get(i).getText().split("-");
			//Brocolli - 1 Kg
			//convert Brocolli - 1 Kg to Brocolli
			String formattedName = vegName[0].trim();
			
			System.out.println(formattedName);
					
			if (vegNamesList.contains(formattedName)){
				j++ ;
				//System.out.println(vegNamesList.get(i));
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				////div[@class='product-action']/button
				System.out.println("i");
				System.out.println(i);
				//**Do not depend on text when u want to build locators "
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if ( j == vegNames.length ) {
					break ;
				}
				
			}
		
			//if (vegName.contains("Cucumber")) {
			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			//}
		}

	}

}
