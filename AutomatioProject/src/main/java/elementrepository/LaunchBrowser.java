package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//WebDriver driver=new EdgeDriver();//Edge
//WebDriver driver=new FirefoxDriver();//firefox
		
		WebDriver driver=new ChromeDriver();//--->chrome
		driver.get("https://selenium.qabible.in/index.php");//launching url
		
	}

}
