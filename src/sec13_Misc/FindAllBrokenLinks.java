package sec13_Misc;
//112.Iterate over all links in the page to validate broken links  mechanism 
//113.Importance of Soft Assertions in Selenium WebDriver

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FindAllBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// String url =
		// driver.findElement(By.cssSelector("a[href*='soapui'")).getAttribute("href");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for ( WebElement link : links ) {
			String url = link.getAttribute("href");
			System.out.println(url);
			  HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
			  conn.setRequestMethod("HEAD");
			  conn.connect();
			  int respCode = conn.getResponseCode();
			  System.out.println(respCode);
			  if(respCode > 400) {
				  Assert.assertTrue(false, url);
			  }
		}
		
		System.out.println("end");
		//gf-li
		//String url = driver.findElement(By.cssSelector("a[href*='brokenlink'")).getAttribute("href");
		//System.out.println(url);
		/*
		 * li[class='gf-li'] a List<webelement> links = find element by cssl selector
		 * 
		 * iterate using for lookp
		 * 
		 * for ( WebElement link : links ) 
		 * { String url = link.getattribute.href -- --
		 * if (respCode > 400)
		 *  { print (link.gettext()+ respcode
		 * Assert.assertTrue(false); { }
		 * 
		 */

	}

}
