package Assignments;
/*Navigate to :
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
1.Select any checkbox
2.Grab the label of textbox//put in the variable.
3.Select the dropdown.it should be of the same name as the selected checkbox.
4.enter the step 2 grabbed label text in Edit Box
5.Click alert and then verify if the text grabbed from step2 is present in the pop up message.
//do not hardcode the label part.
*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class after97_checkbox_dropbox_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\letskodeit\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// #checkBoxOption1
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		// div[@id='checkbox-example']/fieldset/label[2]
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText());
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println("end");
		System.out.println(option);
		// 3.Select the dropdown.it should be of the same name as the selected checkbox.
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		//4.enter the step 2 grabbed label text in Edit Box
		//5.Click alert and then verify if the text grabbed from step2 is present in the pop up message.
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Printing Alert Text");
		System.out.println(alertText);
		String[] firstSentence = alertText.split(",");
		String[] requiredString = firstSentence[0].split(" ");
		String finalString = requiredString[1];
		System.out.println("finalString");
		System.out.println(finalString);
		driver.switchTo().alert().accept();
		Assert.assertEquals(finalString, option);
	

	}

}
