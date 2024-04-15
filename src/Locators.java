//Section 32.33.34.35.36.37.38.39
//we will open website
//("https://rahulshettyacademy.com/locatorspractice/");
//Enter wrong username and password
//then will open forget password
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Invoking Browser 
		//Lot of concepts is there
		//ChromeDriver driver = new ChromeDriver() ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//https://sso.teachable.com/secure/9521/identity/login/password
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//id="inputUsername"
		driver.findElement(By.id("inputUsername")).sendKeys("selenium@gmail.com");
		//name="inputPassword"
		driver.findElement(By.name("inputPassword")).sendKeys("dafdadsf");
		//class="submit signInBtn"
		//driver.findElement(By.class("signInBtn")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@xyz.com");
		//driver.findElement(By.xpath("//form/input[2]")).clear();
		//form/input[3]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9234403030");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println("completed");
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//39
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//div/strong
		//System.out.println(driver.findElement(By.xpath("//div/strong")).getText());
		//System.out.println("End");
		//driver.close();
	}

}

