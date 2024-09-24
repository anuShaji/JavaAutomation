package elementrepository;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public WebDriver driver;

	public void windowOne() {
		driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactUs = driver.findElement(By.xpath("//a[@href='Contact-Us/contactus.html']"));
		contactUs.click();
		WebElement loginPortal = driver.findElement(By.xpath("//a[@href='Login-Portal/index.html']"));
		loginPortal.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);//prints parent handle
		Set<String> allWindows = driver.getWindowHandles();//get all the associated window handles
		String title = "";
		for (String temp : allWindows) {
			if (!temp.equals(parent)) {// removes parent
				System.out.println(temp);
				driver.switchTo().window(temp);
				// System.out.println(driver.getTitle());
				title = driver.getTitle();//fetching the title
			}
			if (title.equals("WebDriver | Login Portal")) {//based on the retrieved tilte we are performing the actionss
				WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys("Anupama");
			}
			if (title.equals("WebDriver | Contact Us")) {
				WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				firstname.sendKeys("Selenium01");
			}
			driver.switchTo().window(parent);
		}
	}
//complete rest 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling mw = new MultipleWindowHandling();
		mw.windowOne();
	}

}
