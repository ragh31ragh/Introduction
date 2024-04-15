package Assignments;
//After 93 : Assignment :Frames Assignment 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/");
		//a[contains(text(),'Nested Frames')]
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		////a[contains(text(),'Nested Frames')]
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		System.out.println("Top Frame");
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		//id=content

	}

}
