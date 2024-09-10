package elementrepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
public void idLocators() {
	WebElement idMsg=driver.findElement(By.id("single-input-field"));//to identify unique values 
	WebElement idBtn=driver.findElement(By.id("button-one"));
	WebElement idTxt=driver.findElement(By.id("message-one"));
	WebElement idVal=driver.findElement(By.id("value-a"));
	WebElement idNext=driver.findElement(By.id("value-b"));
}
public void locatorClass() {
	WebElement clsLoc=driver.findElement(By.className("mt-5"));//try 3 next day
	WebElement divCls=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
	WebElement liCls=driver.findElement(By.className("list-group list-group-flush"));
	WebElement conCls=driver.findElement(By.className("container page"));
}
public void locName() {
	WebElement nameLoc=driver.findElement(By.name("description"));//try 4
	WebElement nameLocOne=driver.findElement(By.name("viewport"));
	WebElement nameLocTwo=driver.findElement(By.name("keywords"));
	WebElement nameLocThre=driver.findElement(By.name("author"));
}
public void linkTxt() {
	WebElement linkLoc=driver.findElement(By.linkText("simple-form-demo.php"));//try 4
	WebElement linkOne=driver.findElement(By.linkText("check-box-demo.php"));
	WebElement linkTwo=driver.findElement(By.linkText("jquery-select.php"));
	WebElement linkThre=driver.findElement(By.linkText("radio-button-demo.php"));
	WebElement linkFr=driver.findElement(By.linkText("ajax-form-submit.php"));
	
}
public void parLnkText() {
	WebElement parText=driver.findElement(By.partialLinkText("simple-form"));
	WebElement parTextOne=driver.findElement(By.partialLinkText("check-box"));
	WebElement parTextTwo=driver.findElement(By.partialLinkText("jquery-sel"));
	WebElement parTextThr=driver.findElement(By.partialLinkText("radio-button"));
	WebElement parTextFr=driver.findElement(By.partialLinkText("ajax-form"));
}
public void tagIdCssLocator() {
	WebElement tagLoc=driver.findElement(By.cssSelector("input#single-input-field"));//try 4 tagname#id
	WebElement tagLocOne=driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagLocTwo=driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagLocThree=driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagLocFour=driver.findElement(By.cssSelector("button#button-two"));
}
public void tagCls() {
	WebElement tagCls=driver.findElement(By.cssSelector("input.form-control"));//try 4 tag.class
	WebElement tagClsOne=driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement tagClsTwo=driver.findElement(By.cssSelector("footer.mt-5"));
	WebElement tagClsThr=driver.findElement(By.cssSelector("section.clearfix"));
	WebElement tagClsFr=driver.findElement(By.cssSelector("a.navbar-brand"));
}
public void tagAttribute() {
	WebElement tagAttr=driver.findElement(By.cssSelector("input[id=single-input-field]"));//tagname[attribute type=value]
	WebElement tagAttrOne=driver.findElement(By.cssSelector("button[class=navbar-toggler]"));
	WebElement tagAttrTwo=driver.findElement(By.cssSelector("div[id=collapsibleNavbar]"));
	WebElement tagAttrthree=driver.findElement(By.cssSelector("input[id=single-input-field]"));
}
public void tagClsAttribute() {
	WebElement tga=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));//try min 3  tagname.classname[attribute type=value]
	WebElement tgaOne=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	WebElement tgaTwo=driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
	WebElement tgaThr=driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
}
public void relXPath() {
	WebElement relX=driver.findElement(By.xpath("//input[@id='single-input-field']"));//try imp   //tagname[@attribute='value']
	WebElement relXOne=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement relXTwo=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement relXThr=driver.findElement(By.xpath("//input[@id='value-b']"));
	WebElement relXFr=driver.findElement(By.xpath("//button[@id='button-two']"));
	}
public void absXPath() {
	WebElement abs=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	WebElement absOne=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
	}

}
