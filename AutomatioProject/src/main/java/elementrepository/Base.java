package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void launchBrowser() {
	driver=new ChromeDriver();//launches the browser
	driver.get("https://selenium.qabible.in/index.php");//opens the particular url in the get method
	driver.manage().window().maximize();//To maximise the window
}
public void closeQuit() {
	driver.close();//closes the current webpage
	driver.quit();//closes all
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base bs=new Base();
bs.launchBrowser();
bs.closeQuit();
	}

}
