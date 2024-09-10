package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFormMessage extends Base{
public void test() {
	WebElement input=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	input.click();
	WebElement msg=driver.findElement(By.id("single-input-field"));
	msg.sendKeys("Hi Automation");
	WebElement showMsg=driver.findElement(By.xpath("//button[text()='Show Message']"));
	showMsg.click();
}
public void add() {
	WebElement a=driver.findElement(By.xpath("//input[@id='value-a']"));
	a.sendKeys("10");
	WebElement b=driver.findElement(By.xpath("//input[@id='value-b']"));
	b.sendKeys("20");
	WebElement getTotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
	getTotal.click();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InputFormMessage ipForm=new InputFormMessage();
ipForm.launchBrowser();
ipForm.test();
ipForm.add();
	}

}
