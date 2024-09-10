package mystudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
//	Invoke Chrome Browser
//	Open URL: https://www.google.co.in/
//	Get Page Title name and Title length
//	Print Page Title and Title length on the Eclipse Console
//	Get page URL and verify whether it is the desired page or not
//	Get page Source and Page Source length
//	Print page Length on Eclipse Console.
//	Close the Browser

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		String title = driver.getTitle();
		System.out.println(title);
		int lng = title.length();
		System.out.println(lng);
		String url = driver.getCurrentUrl();
		
		if (url.equals("https://www.javatpoint.com/")) {
			System.out.println("url is matching");
		} else {

			System.out.println("not matching");
		}

		String pgSrc=driver.getPageSource();
		System.out.println("Page source length = "+pgSrc.length());
		driver.close();
		}
}
