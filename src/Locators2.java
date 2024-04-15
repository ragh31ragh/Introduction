import java.time.Duration;

//41[10-jan-24]
//42.Generating xpaths based on the button texts on the page with the example.
//43.Parse the string with Java methods to get the password dynamically from the page.
//44.Code Download
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "rahul" ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String extractedPassword = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		//getPassword(driver);
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys(extractedPassword);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println("Sleep Done");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//System.out.println("Executed");
		//42.Generating xpaths based on the button texts on the page with the example.
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Clicked on Logout");
		//driver.close();
		driver.quit();
	}
	
	//43.Parse the string with Java methods to get the password dynamically from the page.
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Complete String 
		System.out.println("passwordText");
		System.out.println(passwordText);
		String[] passwordSplitOne = passwordText.split("'");
		int splitlength = passwordSplitOne.length;
		System.out.println(splitlength);
		System.out.println("passwordText");
		System.out.println(passwordSplitOne[1]);
		//driver.close();
		return passwordSplitOne[1] ;
			
		
		
	}

}
