package sec13_Misc;
//105.Handling HTTPS certifications in Automated browsers 

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class https_certs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println("end");
		
		/*SSL certifications 
		 *

		ChromeOptions options = new ChromeOptions();
		options.acceptinsecurtecerts (True)
		Webdrier driver= ChromeDriver(options)
		https://expired.badssl.com/

		Print title.

		Setting Behaviour for browser .

		Same in firefox and edge.
		*/


	}

}
