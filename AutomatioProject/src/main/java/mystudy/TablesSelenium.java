package mystudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import elementrepository.Base;

public class TablesSelenium extends Base {
	public void gettingFullTextFromTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tabledata = driver.findElement(By.id("dtBasicExample"));
		System.out.println(tabledata.getText() + "\n*********************************************************");

	}

	public void gettingTableARowData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tablerow = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[8]"));
		for (WebElement tr : tablerow) {
			System.out.println(tr.getText());
		}
		System.out.println("\n*********************************************************");

	}

	public void locatingACellValue() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tabledata = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[7]/td[2]"));
		System.out.println(tabledata.getText() + "\n*********************************************************");

	}

	public void whetherAvalueIsPresentInTableOrNot() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String str = "Software Engineer";
		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for (WebElement td : tabledata) {
			if (td.getText().equals(str)) {
				System.out.println(str + (" is present in table"));
			} 

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TablesSelenium ts = new TablesSelenium();
		ts.launchBrowser();
		ts.gettingFullTextFromTable();
		ts.gettingTableARowData();
		ts.locatingACellValue();
		ts.whetherAvalueIsPresentInTableOrNot();
	}

}
