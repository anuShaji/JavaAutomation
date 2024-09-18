package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import elementrepository.Base;

public class RadioAndDropDown extends Base{
public void radioDropSelectedDisabled() {
	WebElement radio=driver.findElement(By.xpath("//input[@value='lettuce']"));
	radio.click();
	System.out.println("Lettuce is enabled or not : "+radio.isEnabled());
	WebElement radio2=driver.findElement(By.xpath("//input[@value='cabbage']"));
	boolean radio2val=radio2.isEnabled();
	String radioStr=Boolean.toString(radio2val);
	if(radioStr.equals("true")) {
		System.out.println("Enabled");
	}
	else {
		System.out.println("Disabled");
	}
	
	WebElement dropdown=driver.findElement(By.id("fruit-selects"));
	Select select=new Select(dropdown);
	select.selectByValue("pear");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RadioAndDropDown rd=new RadioAndDropDown();
rd.launchBrowzerForAssignment();
rd.radioDropSelectedDisabled();
	}

}
