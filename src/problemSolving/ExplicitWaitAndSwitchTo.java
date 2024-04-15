package problemSolving;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAndSwitchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// a[contains(text(),'Top Deals')]
		// span[contains(text(),'2')]
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		Set<String> it = driver.getWindowHandles();
		Iterator<String> it1 = it.iterator();
		//while (it1.hasNext()) {
		// System.out.println(it1.next());
		//}
		String parentWindow = it1.next();
		System.out.println(parentWindow);
		String TopDealsWindow = it1.next();
		System.out.println(TopDealsWindow );
		driver.switchTo().window(TopDealsWindow);
		System.out.println("#########################");
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Flight Booking')]")).click();

		Set<String> windows2 = driver.getWindowHandles();
		Iterator<String> it2 = windows2.iterator();
		//while (it2.hasNext()) {
		//	System.out.println(it2.next());
		//}
		//String parentWindow2 = it2.next();
		//String TopDealsWindow1 = it2.next();
		//String TopFlightssWindow1 = it2.next();
		it2.next();
		it2.next();
		String TopFlightsWindow = it2.next();
		driver.switchTo().window(TopFlightsWindow);
		System.out.println("Expected Flights window");
		System.out.println(driver.getTitle());
		//<button class="" type="button" xpath="1">ADD TO CART</button>
		//button[contains(text(),'ADD TO CART')]
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		
		

		// a[contains(text(),'Flight Booking')]
		
		//span[contains(text(),'Rewards')]
		
		
	}

}
