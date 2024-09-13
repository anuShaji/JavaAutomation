package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownLocator extends Base{
public void dropDownLoc() {
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	WebElement selInp=driver.findElement(By.xpath("//a[@href='select-input.php']"));
	selInp.click();
	WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select=new Select(dropDown);
	//select.selectByVisibleText("Red");
	//select.selectByIndex(1);
	select.selectByValue("Yellow");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDownLocator dl=new DropDownLocator();
dl.launchBrowser();
dl.dropDownLoc();
	}

}
