package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public void frames() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement ifrmae = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(ifrmae);
		WebElement hlink=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		hlink.click();
		driver.switchTo().defaultContent();
//try examples
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FramesHandling fram = new FramesHandling();
		fram.frames();
	}

}
