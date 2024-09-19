package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends Base{
public void inputFormClick() {
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	List<WebElement> inpForm=driver.findElements(By.xpath("//input[@type='text']"));
	for(WebElement obj1:inpForm) {
		obj1.sendKeys("Hello");
	}

}
public void inpformclick2() {
	driver.get("https://selenium.qabible.in/check-box-demo.php");
	List<WebElement> checkBoxList=driver.findElements(By.xpath("//input[@class='check-box-list']"));
	for(WebElement chk:checkBoxList) {
		chk.click();
	}
//	WebElement button=driver.findElement(By.id("button-two"));
//	button.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindElementsExample findElement=new FindElementsExample();
findElement.launchBrowser();
//findElement.inputFormClick();
findElement.inpformclick2();
	}

}
