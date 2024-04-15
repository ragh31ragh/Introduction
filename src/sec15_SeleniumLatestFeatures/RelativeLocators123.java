package sec15_SeleniumLatestFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators123 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Navigate to home page.
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//input[@name='name']
		WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
		//driver.findElement(withTagname("label").above(nameEditBox )).gett
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		System.out.println("end");
		/*
		 * Selenium Relative Locators | Friendly Locators -above():element located above
		 * w.r.t. specific element -below():element located below w.r.t. specific
		 * element -toLeftOf() : element located to the left of specific element
		 * -toRightOf() : element located to the right of specific element
		 * 
		 * Syntax : driver.fineElement(withTagName("").above(WebElement)
		 * 
		 * Using below url
		 * 
		 * URL used : https://rahulshettyacademy.com/angularpractice/
		 * 
		 * we will find the label above the Name Edit box. Which is Name. and print it.
		 * 
		 * Finding name labels here .
		 * 
		 * Name the class RelativeLocator
		 * //input[@name='name']
		 * WebElement nameEditBoz = driver.findelement(); 
		 * static packages will not be
		 * auto suggested. .gettext of name
		 * 
		 * import static org.openqa.selenium.support.locators.RelativeLocator.*;
		 * 
		 * Another example is below .
		 * 
		 */

	}

}
