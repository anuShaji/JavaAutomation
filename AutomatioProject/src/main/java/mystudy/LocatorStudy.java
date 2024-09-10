package mystudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.obsqurazone.com/");
		driver.manage().window().maximize();
		//Name locator
		//driver.findElement(By.name("course")).sendKeys("Automation");
		//id
		//boolean isDisplayedStatus=driver.findElement(By.id("header-search")).isDisplayed();
		//System.out.println(isDisplayedStatus);
		//Link Text
		List<WebElement> footerNavBar=driver.findElements(By.tagName("img"));
		
		System.out.println("footer links "+footerNavBar.size());
		driver.close();
		}

}
