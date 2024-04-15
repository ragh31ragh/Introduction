package practice;
//81.Practical examples of Explicit waits
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OptimizedGreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		

		String[] vegNames = { "Cucumber", "Brocolli", "Beetroot", "Potato", "Mushroom" };
		AddItems(driver,vegNames);
		//click on add cart button
		//proceed to checkout 
		//add promo code 
		//img[alt='Cart']//.promoCode
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoBtn")));
		driver.findElement(By.cssSelector(".promoBtn")).click();
		


}

public static void  AddItems(WebDriver driver,String[] vegNames) {
	int j = 0;
	
	List<String> vegNamesList = Arrays.asList(vegNames);
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i = 0; i < products.size(); i++) {
		String[] vegName = products.get(i).getText().split("-");
		// Brocolli - 1 Kg
		// convert Brocolli - 1 Kg to Brocolli
		String formattedName = vegName[0].trim();

		System.out.println(formattedName);

		if (vegNamesList.contains(formattedName)) {
			j++;
			// System.out.println(vegNamesList.get(i));
			// driver.findElements(By.xpath("//button[text()='ADD TO
			// CART']")).get(i).click();
			//// div[@class='product-action']/button
			System.out.println("i");
			System.out.println(i);
			// **Do not depend on text when u want to build locators "
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			

			if (j == vegNames.length) {
				break;
			}

		}

		// if (vegName.contains("Cucumber")) {
		// driver.findElements(By.xpath("//button[text()='ADD TO
		// CART']")).get(i).click();
		// }
	}

}
}
	
