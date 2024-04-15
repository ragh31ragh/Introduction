package AutomationTestStore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Open the Landing Page
		driver.get("https://automationteststore.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Login or register')]")).click();
		//id-loginFrm_loginname
		//id-loginFrm_password
		//xpath -//button[@title='Login']
		driver.findElement(By.id("loginFrm_loginname")).sendKeys("FirstNameOne");
		driver.findElement(By.id("loginFrm_password")).sendKeys("FirstNameOne");
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		Actions a = new Actions(driver);
		//WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		//a.moveToElement(move).build().perform();
		//WebElement move = driver.findElement(By.linkText("Apparel & accessories"));
		//nav[@class='subnav']/ul/li[2]
		WebElement move = driver.findElement(By.xpath("//nav[@class='subnav']/ul/li[2]"));
		a.moveToElement(move).build().perform();
		//div[@class='subcategories']/ul/li/a[contains(text(),'Shoes')]
		driver.findElement(By.xpath("//div[@class='subcategories']/ul/li/a[contains(text(),'Shoes')]")).click();
		//div[@class='thumbnail']//i[1]
		driver.findElement(By.xpath("//div[@class='thumbnail']//i[1]")).click();
		//option344747
		driver.findElement(By.id("option344747")).click();
		//a[@class='cart']
		driver.findElement(By.xpath("//a[@class='cart']")).click();
		//cart_checkout1
		driver.findElement(By.id("cart_checkout1")).click();
		driver.findElement(By.id("checkout_btn")).click();

	}

}
