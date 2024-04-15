package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class after104_AutocompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(1000);
		List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		/*for(WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				System.out.println("India Selected");
				break;
				
			}
			
		*/
		for (int i = 0; i < options.size();i++) {
			String country = options.get(i).getText();
			if (country.equalsIgnoreCase("India")) {
				options.get(i).click();
				System.out.println("India Selected");
				break ;
			}
		}

	}

}
