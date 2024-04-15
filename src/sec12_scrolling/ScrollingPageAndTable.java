package sec12_scrolling;
//102.How to perform scrolling within Table and Window level using 
//103.How to handle table grids in webpage 
//104.Parsing String and comparing with Generated sum value - Exercise

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingPageAndTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.Scrollby(0,500)");
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		
		/*
		 * JavaScript Executorby

JavascriptExecutor js = (javascriptExecutor) driver;
js.executescript

in console.
windwow.scrollby(0,500)

js.executeScript ( "window.Scrollby(0,500)) 

Scenario : When we need to scroll inside table .

similar to css selector

document.querySelector(".tableFixHead").scrollTop=5000;

thread.sleep(3000)

js.executeScript(document.querySelector(".tableFixHead").scrollTop=5000;)


		 */
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for (int i = 0;i < values.size();i++) {
			//values.get(i).getText();
			System.out.println(values.get(i).getText());
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println("total sum");
		
		System.out.println(sum);
		/*
		 * .tableFixHead td:nth-child(4)
List<WebElement> values =driver.findelements.cssselector

int sum = 0;
Now iterated and find the sum

for (int i=0;{
values.get(i)gettext ()
INterger.parseInt(---)
---u  can run and print now 

sum = sum + values.get(i)gettext ()
INterger.parseInt(---)

}
print sum now.

		 */
		System.out.println("Print sum in the Browser" );
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
		
		/*
		 * 104.Parsing String and comparing with Generated sum value - Exercise
totalAmount
driver.find.cssselecter 
of total displayed string .gettext ..split(":")[1].trim().

Extract 296 .
int total = Interger.parseint.(driver.find.cssselecter 
of total displayed string .gettext ..split(":")[1].trim().)

Asset.assertequals(sum,total)

		 */
		
		

	}
}