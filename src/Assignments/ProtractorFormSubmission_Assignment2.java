package Assignments;
//Assignment2 AfterLecture : 
//64.Validating UI elements are disabled or enabled with Attribute

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProtractorFormSubmission_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("abc");
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("abc@xyz.com");
		//#exampleInputPassword1
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("abc123");
		//exampleCheck1
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(0);
		//dropdown.selectByValue("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//inlineRadio1
		driver.findElement(By.id("inlineRadio1")).click();
		//div/input[@name='bday']
		driver.findElement(By.xpath("//div/input[@name='bday']")).sendKeys("31/10/2001");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		//input[@value='Submit']
		System.out.println(driver.findElement(By.xpath("//div/strong")).getText());
		//.alert-success
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		//System.out.println("End");
		System.out.println("End");
		//driver.close();

	}

}
