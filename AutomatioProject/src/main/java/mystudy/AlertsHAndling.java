package mystudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHAndling {
//	Invoke Firefox Browser
//	Open URL: https://www.testandquiz.com/selenium/testing.html
//	Click on the "Generate Alert box" button
//	Click on the "Generate Confirm box" button
//	Close the browser
	public void alert1() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement tryIt=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Anupama");
		alert.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertsHAndling al = new AlertsHAndling();
		al.alert1();
	}

}
