package mystudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {
	public void draganddropstudy() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practice.expandtesting.com/drag-and-drop");
		driver.manage().window().maximize();
		WebElement draggable1 = driver.findElement(By.id("column-b"));
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable1).click();
		actions.doubleClick(draggable1).perform();
		WebElement dest = driver.findElement(By.id("column-a"));
		actions.dragAndDrop(draggable1, dest).build().perform();

	}

	public void dragdrop2() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement draggable2 = driver.findElement(By.xpath("//div[text()='Drag me']"));
		Actions action = new Actions(driver);
		action.moveToElement(draggable2).click();
		action.doubleClick(draggable2).perform();
		WebElement dest2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]"));
		action.dragAndDrop(draggable2, dest2).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDropStudy ds = new DragAndDropStudy();
		//ds.draganddropstudy();
		ds.dragdrop2();
	}

}
