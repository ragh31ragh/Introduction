package sec15_SeleniumLatestFeatures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot127 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
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
		// it.next();
		String parentWindowId = it.next();
		String childtWindowId = it.next();
		driver.switchTo().window(childtWindowId);
		// System.out.println(driver.findElements(By.cssSelector("a[href*='/p/']")).get(0).getText());
		// .course-listing-title
		System.out.println(driver.findElements(By.cssSelector(".course-listing-title")).get(0).getText());
		String course = driver.findElements(By.cssSelector(".course-listing-title")).get(0).getText();
		// input[name=name]
		driver.switchTo().window(parentWindowId);
		WebElement nameEditBox = driver.findElement(By.cssSelector("input[name=name]"));
		nameEditBox.sendKeys(course);
		System.out.println("End");
		// To check if we have entered Course Name correct
		/*
		 * Capture WebElement Screenshot . Like capturing the name edit box after
		 * entering the course name. 
		 * Slight modif webelement name = name.sendkeys.
		 * name.getScreenshoAs.(outputType.FILE) File file =
		 * name.getScreenshoAs.(outputType.FILE) file is a file object . We need to get
		 * a physical screenshot now.
		 * 
		 * FileUtils.( By default we will not get this .We need to import.) -Common io
		 * FileUtils method will be enabled now.
		 * 
		 * FileUtils.copyfile(src.dest)
		 *  FileUtils.copyfile(src.new File logo.png )
		 * 
		 * Run this test now.
		 * 
		 * Name edit box will be captured.
		 * 
		 * 
		 */
		File file = nameEditBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));

	}

}
