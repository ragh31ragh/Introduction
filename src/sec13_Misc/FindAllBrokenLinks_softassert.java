package sec13_Misc;
//113.Importance of Soft Assertions in Selenium WebDriver

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FindAllBrokenLinks_softassert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// String url =
		// driver.findElement(By.cssSelector("a[href*='soapui'")).getAttribute("href");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode < 400 , "link with text "+ link.getText()+ " broken with code "+ respCode );
		}
		a.assertAll();

		System.out.println("end");
		/*
		 * Before for loop create soft assert class. SoftAssert a = new SoftAssert();
		 * 
		 * Asset. ( this is hard assertion ) a.assertTrue(respcode < 400,message),link
		 * with text + link.gettext+ broken with + "code")
		 * 
		 * out of for loop. a.Assertall - we need to use this to report all failures.
		 * 
		 */

	}

}
