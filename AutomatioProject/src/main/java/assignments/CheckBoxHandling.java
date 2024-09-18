package assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import elementrepository.Base;

public class CheckBoxHandling extends Base {

	public void checkBoxhandling() {

		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		WebElement chkbox2 = driver.findElement(By.xpath("//input[@value='option-4']"));
		System.out.println(chkbox2.isSelected());

	}
	public void radioButtons() {
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='green']"));
		radiobutton.click();
		System.out.println(radiobutton.isDisplayed());
		System.out.println(radiobutton.isSelected());


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckBoxHandling ch = new CheckBoxHandling();
		ch.launchBrowzerForAssignment();
		//ch.checkBoxhandling();
		ch.radioButtons();
		
		
	}

}
