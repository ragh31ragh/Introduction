package AjaxCalls;
//86.Handling Ajax or Mouse Interactions 
//87.Actions class -real time example.

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//#nav-link-accountList-nav-line-1
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		a.moveToElement(move).build().perform();
		//a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
		//twotabsearchtextbox
		//Enter HELLO text in searchbox and select it.
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("heLLo").build().perform();
		//Right click simulation
		a.moveToElement(move).contextClick().build().perform();
		System.out.println("TestCompleted");
	}

}
