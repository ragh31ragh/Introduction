package javaStreams;
//117.Perform WebTable sorting using Selenium Java Streams

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenkartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// 1.Click on column xpath //tr/th[1]
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// 2.Capture all Web elements values in list list webelements afdadfsa= fine
		// tr/td[1]
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		// tr/th[1]
		// * 3.Capture text of all web elements into new list (original) List<String>
		// * orignalList = elementList.stream().map( s ->
		// * s.getText())).collect(Collectors.toList());
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// 4.we will apply sort now -sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
