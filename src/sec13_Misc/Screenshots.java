package sec13_Misc;
//109.How to take screenshot in selenium.

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://google.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File ("I:\\Learnings\\Raghavendra\\2023\\Screenshots\\test1.png"));
		System.out.println("end");
		/*
		 * File src = ((TakesScreenshot)driver).getScreenshots(OutputType,FILE);
		 * 
		 * Now screenshot in source object. We need to copy that to local machine.
		 * 
		 * FileUtils.copyfile(src,new File ("C://Screenshot.png);
		 * 
		 * Download common io packages. common.apache.org project -props-java build
		 * path- add ext jar -import all files.(This can be removed using maven dependency)
		 * 
		 * -Run the program.
		 * 
		 * 
		 */

	}

}
