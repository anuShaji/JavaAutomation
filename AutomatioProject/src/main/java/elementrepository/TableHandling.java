package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	public void getFullTableValues() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.id("dtBasicExample"));
		System.out.println(table.getText());
	}

	public void selectTableParticularRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));// //xpath/tbody/tablerow[particular
																										// row]
		System.out.println(tableRow.getText());
	}

	public void selectParticularElementFromTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableData = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[3]"));// //xpath/tbody/tr[particular
																												// row]/td[particularcloumn]
		System.out.println(tableData.getText());
	}

	public void selectTableList() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tableList = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for (WebElement tb : tableList) {
			System.out.println(tb.getText());
		}
	}
	public void searchForAnElementInTable() {
		String input="Senior Javascript Developer";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tableList2=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement tb2:tableList2) {
			if(tb2.getText().equals(input)) {
				System.out.println(tb2.getText());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling th = new TableHandling();
		th.launchBrowser();
		th.getFullTableValues();
		System.out.println("\n*********************************************");
		th.selectTableParticularRow();
		System.out.println("\n*********************************************");
		th.selectParticularElementFromTable();
		System.out.println("\n*********************************************");
		th.selectTableList();
		System.out.println("\n*********************************************");
		th.searchForAnElementInTable();
	}

}
