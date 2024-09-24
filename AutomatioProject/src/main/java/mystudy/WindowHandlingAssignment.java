package mystudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingAssignment {
	public WebDriver driver;

	public void windows() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();// Returns the handle of the current window.
		System.out.println("Parent window : " + parentWindow);
		WebElement contactUs = driver.findElement(By.xpath("//a[@href='Contact-Us/contactus.html']"));
		contactUs.click();
		WebElement loginPortal = driver.findElement(By.xpath("//a[@href='Login-Portal/index.html']"));
		loginPortal.click();
//		WebElement buttonclick = driver.findElement(By.xpath("//a[@href='Click-Buttons/index.html']"));
//		buttonclick.click();
//		WebElement toDoList = driver.findElement(By.xpath("//a[@href='To-Do-List/index.html']"));
//		toDoList.click();
//		WebElement pageObjectModel = driver.findElement(By.xpath("//a[@href='Page-Object-Model/index.html']"));
//		pageObjectModel.click();
//		WebElement accordionAndText = driver.findElement(By.xpath("//a[@href='Accordion/index.html']"));
//		accordionAndText.click();
//		WebElement dropdown = driver.findElement(By.xpath("//a[@href='Dropdown-Checkboxes-RadioButtons/index.html']"));
//		dropdown.click();
//		WebElement ajaxModel = driver.findElement(By.xpath("//a[@href='Ajax-Loader/index.html']"));
//		ajaxModel.click();
		WebElement actions = driver.findElement(By.xpath("//a[@href='Actions/index.html']"));
		actions.click();
//		WebElement scrollingArouns = driver.findElement(By.xpath("//a[@href='Scrolling/index.html']"));
//		scrollingArouns.click();
		Set<String> childWindows = driver.getWindowHandles();// get all the window handles
		String title = "";// variable to store tiles
		// driver.quit();
		for (String handles : childWindows) {// for each for iteration
			if (!handles.equals(parentWindow)) {// if the handle is not eqal to the parent window handle then perform
												// theactions
				System.out.println(handles);// ptints the handle
				driver.switchTo().window(handles);// switching to the handle
				title = driver.getTitle();// get the current diver title and store it in the title var
				System.out.println(title + "\n");// prints the title
			}
			if (title.equals("WebDriver | Login Portal")) {
				WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				uname.sendKeys("Anupama");
				WebElement psw = driver.findElement(By.xpath("//input[@placeholder='Password']"));
				psw.sendKeys("password1233");
				WebElement login = driver.findElement(By.id("login-button"));
				login.click();
				driver.switchTo().alert().accept();

			}
			if (title.equals("WebDriver | Contact Us")) {
				WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				fname.sendKeys("Anupama");
				WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lname.sendKeys("Shaji");
				WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
				email.sendKeys("vishnuanupama475@gmail.com");
				WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Comments']"));
				comments.sendKeys("This is just a test for testing");
				WebElement submit = driver.findElement(By.xpath("//input[@value='SUBMIT']"));
				submit.click();
				// WebElement reset = driver.findElement(By.xpath("//input[@value='RESET']"));
			}
			if (title.equals("WebDriver | Actions")) {
				WebElement draggable1 = driver
						.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
				Actions act = new Actions(driver);
				act.moveToElement(draggable1).click();
				act.doubleClick(draggable1).perform();
				WebElement droppable = driver.findElement(By.id("droppable"));
				// xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']"));
				act.dragAndDrop(draggable1, droppable).build().perform();
				WebElement dblClickMe = driver.findElement(By.id("double-click"));
				act.moveToElement(dblClickMe).doubleClick(dblClickMe).build().perform();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowHandlingAssignment wa = new WindowHandlingAssignment();
		wa.windows();
	}

}
