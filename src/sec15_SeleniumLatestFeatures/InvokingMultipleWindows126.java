package sec15_SeleniumLatestFeatures;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scenario :
		 * 
		 * Navigate to ("https://rahulshettyacademy.com/angularpractice/"); 
		 * Fill the  "Name " field with the first course name available at
		 * 
		 * ("https://rahulshettyacademy.com/");
		 * 
		 * driver.switchto.newwindow or new tab .(Window Type.TAB) -
		 * Run and check .
		 *  Get  * window handle driver.swithcto.windowhandle(string)
		 * 
		 * How to get the id of new window we opened. 
		 * Set<string> handles =  * driver.getWindowHandles() 
		 * handles.iterator 
		 * Iterator<String> it=
		 * handles.iterator String parentwindowid = it(next); String childwindowid =
		 * it(next); 
		 * driver.swithcto.windowhandle(string) 
		 * now hit new url
		 * 
		 * css to find first element css reg exp. a[href* = 'rahul/p']
		 * 
		 * String Course = driver.find elements.get[1] .get text again 
		 * swithc to parent
		 * Enter the text in name box send keys RUn the test. driver.quit();
		 * 
		 * Try with new window as well [driver.switchto.newwindow or new tab .(Window
		 * Type.WINDOW)
		 * 
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Navigate to home page.
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//it.next();
		String parentWindowId = it.next();
		String childtWindowId = it.next();
		driver.switchTo().window(childtWindowId);
		//System.out.println(driver.findElements(By.cssSelector("a[href*='/p/']")).get(0).getText());
		//.course-listing-title
		System.out.println(driver.findElements(By.cssSelector(".course-listing-title")).get(0).getText());
		String course = driver.findElements(By.cssSelector(".course-listing-title")).get(0).getText() ;
		//input[name=name]
		driver.switchTo().window(parentWindowId );
		WebElement nameEditBox = driver.findElement(By.cssSelector("input[name=name]"));
		nameEditBox.sendKeys(course);
		System.out.println("End");
		
		

	}

}
