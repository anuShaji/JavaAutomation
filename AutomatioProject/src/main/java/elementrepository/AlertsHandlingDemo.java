package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsHandlingDemo extends Base {
	public void alertsHandling() {

//		WebElement clickme1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
//		clickme1.click();
//		driver.switchTo().alert().accept();

//		WebElement cliclme2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
//		cliclme2.click();
//		driver.switchTo().alert().dismiss();// for cancelling dismiss() is used
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		WebElement clikme3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clikme3.click();
//		Alert alert=driver.switchTo().alert();//created object for alert
//		alert.sendKeys("Anupama");
//		alert.accept();
		
		
		driver.switchTo().alert().sendKeys("Anupama"); // Pass the value to the prompt
		driver.switchTo().alert().accept(); // Accept the prompt (click "OK")

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertsHandlingDemo ad = new AlertsHandlingDemo();
		ad.launchBrowser();
		ad.alertsHandling();
	}

}
