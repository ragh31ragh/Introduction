import java.time.Duration;

//46.Identify locators using Siblings with Xpath traverse - Example 
//47.How to traverse from child element to parent element with xpath - Example
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//header/div/button[1]/following-sibling::button[1]
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//47.How to traverse from child element to parent element with xpath - Example
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		//header/div/button[1]/parent::div/button[2]
		
	}

}
