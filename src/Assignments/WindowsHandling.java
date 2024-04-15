package Assignments;
//After section 90 : Assignment 4 : Window Handling Assignment 
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*https://the-internet.herukuapp.com/
https://the-internet.herokuapp.com/
click on Multiple Windows
click here 
Print NewWindow Text 
Click opening a new window 
First line new window
Next Opening a new window 
*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/");
		 //Clicking on link Multiple Windows
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		//After Click here new window will open 
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]]")).getText());
		//System.out.println(driver.getTitle());
		//Print the New Window text 
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(parentId);
		//h3[contains(text(),'Opening a new window')]
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());	
		
		

	}

}
