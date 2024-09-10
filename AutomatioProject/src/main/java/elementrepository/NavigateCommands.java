package elementrepository;

public class NavigateCommands extends Base{
public void navigationCommands() {
driver.navigate().to("https://www.amazon.in/");
driver.navigate().back();//goes back to the previous url
driver.navigate().forward();
driver.navigate().refresh();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NavigateCommands nc=new NavigateCommands();
nc.launchBrowser();
nc.navigationCommands();
	}

}
