package practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RdPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.println(driver.findElement(By.xpath("//a[@href='#/offers']")).getText());
		//System.out.println(hs.size());
		//img[@alt="Brocolli - 1 Kg"]
		System.out.println(driver.findElement(By.xpath("//img[@alt=\"Brocolli - 1 Kg\"]")).getText());
		//h4[@class='product-name']
		System.out.println(driver.findElement(By.xpath("//h4[@class='product-name']")).getText());
		System.out.println(driver.findElement(By.xpath("//a[@href='#/offers']")).isDisplayed());


}
		
		


}
