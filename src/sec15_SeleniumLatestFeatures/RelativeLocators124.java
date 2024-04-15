package sec15_SeleniumLatestFeatures;
//Below,Left of Right of

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Navigate to home page.
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// input[@name='name']
		WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
		// driver.findElement(withTagname("label").above(nameEditBox )).gett
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		System.out.println("end of above ");
		//label[contains(text(),'Date of Birth')]
		WebElement dateOfBirth = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		System.out.println("end of below ");
		//Above and below is completed now
		//label[contains(text(),'Check me out if you Love IceCreams!')]
		WebElement iceCreams = driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreams)).click();
		System.out.println("To the left of");
		//label[contains(text(),'Student')]
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioBtn )).getText());
		System.out.println("To the right of");
	

		/*
		 * -Idetifyin the element below dataof birth text -it will identify submit
		 * button -As date of birth field is of 'flex' type. - we aill click on submit
		 * button . Find element of date of birth and pass for below locator.
		 * 
		 * Above and below is completed now
		 * 
		 * -Click the checkbox next to description [Check me out if you Love IceCreams!]
		 * find element by xpath for this . icecream lable
		 * 
		 * 
		 * - to rightof - Find label of first radio button which is student.
		 * radioButton. Print in outbut.
		 * 
		 * We have covered all Releative locators selenium support.
		 * 
		 */

	}

}
