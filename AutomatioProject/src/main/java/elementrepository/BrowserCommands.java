package elementrepository;

public class BrowserCommands extends Base{
public void brwzerCommands() {
	String title=driver.getTitle();//storing the title to a string variable
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browzer=new BrowserCommands();
browzer.launchBrowser();
browzer.brwzerCommands();
	}

}
