package Assignments;
//Assignment 3 : Synchornization with Explicit wait assignment 
//After 82 lecture

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndAddItemsToCart {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//String[] vegNames = { "iphone X", "Samsung Note 8", "Beetroot", "Potato", "Mushroom" };
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		//https://rahulshettyacademy.com/loginpagePractise/
		//input[@id='username']
		//input[@id='password']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		WebElement staticDropdown = driver.findElement(By.xpath("//body/div[@id='login']/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("consult");
		//dropdown.selectByIndex(1)
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		//w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("nav-link btn btn-primary")));
		w.until(ExpectedConditions.titleContains("ProtoCommerce"));
		//https://rahulshettyacademy.com/angularpractice/shop
		//driver.getTitle()
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		for (int i = 0; i < products.size(); i++) {
			
			System.out.println(products.get(i).getText());
			//driver.findElement(By.cssSelector("zmdi zmdi-shopping-cart")).click();
			//driver.findElements(By.cssSelector("zmdi zmdi-shopping-cart")).get(i+1).click();
			driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
			//button[contains(text(),'Add')][1].
			//driver.
			System.out.println("Added");
			
			
		}
		//nav-link btn btn-primary
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Checkout")).click();
		//driver.findElement(By.cssSelector("nav-link btn btn-primary")).click();
		//nav-link btn btn-primary
		
		
		
	}

}
