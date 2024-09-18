package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {
//	Invoke Google Chrome Browser
//	Open URL: https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
//	Select the option "Python" from the drop-down menu
//	Close the browser
	public WebDriver driver;

	public void launchBrowzerAndWebPageforDropDown1() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropDown);
		// select.selectByVisibleText("Python");//selects by text
		// select.selectByValue("python");//slects by value attribute
		select.selectByIndex(2);

	}

	public void dropDown2() {
		WebElement Dropdown2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select dd2 = new Select(Dropdown2);
		dd2.selectByIndex(2);
	}
	public void dropDown3() {
		WebElement dropdown3=driver.findElement(By.id("dropdowm-menu-3"));
		Select dd3=new Select(dropdown3);
		dd3.selectByVisibleText("JavaScript");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDownAssignment assg = new DropDownAssignment();
		assg.launchBrowzerAndWebPageforDropDown1();
		assg.dropDown2();
		assg.dropDown3();
		
	}

}
