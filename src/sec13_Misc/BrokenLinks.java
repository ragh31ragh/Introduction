package sec13_Misc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//110.Strategy to automate the broken Links with Selenium
//111.Open connection method to identify status codes of the links
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url = driver.findElement(By.cssSelector("a[href*='soapui'")).getAttribute("href");
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink'")).getAttribute("href");
		System.out.println(url);

		/*
		 * //brokenURL https://rahulshettyacademy.com/AutomationPractice/ //Java methods
		 * will call url and get u the status code.
		 * 
		 * //Land on page //Scan all links. //Get all links. //if status code > 400 that
		 * link not working.
		 * 
		 * //Lets try with Soap UI only //a[href='soapui] String url = driver.findby
		 * css.getattribute("href")
		 * 
		 */
		  HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
		  conn.setRequestMethod("HEAD");
		  conn.connect();
		  int respCode = conn.getResponseCode();
		  System.out.println(respCode);
		  

		/*
		 * HttpURLConnection conn = (HTTPURLConnection)new URL(url).openconnection();
		 * 
		 * conn.setRequestMethod("HEAD"); conn.connect(); int respCode =
		 * conn.getResponseCode(); print it ()
		 * 
		 * Run the program status code will be 200
		 * 
		 * 
		 * Now we will test with a broken link. a[href*
		 * 
		 */
	}

}
