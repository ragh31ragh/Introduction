package AjaxCalls;
//88. Window handle concepts- Real time example.
//89.Live Example on working with Child windows.

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		//Capture email id from child window and paste it into parent window.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//a[class='blinkingText']
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println("end1");
		//Extract mail id , send to parent window 
		//im-para red
		//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];	
		System.out.println(emailId);
		driver.switchTo().window(parentId);
		//username
		driver.findElement(By.id("username")).sendKeys(emailId);
		

	}

}
