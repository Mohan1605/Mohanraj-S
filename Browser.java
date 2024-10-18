package weekday1;

public class Browser {

	public void launchBrowser(String browserName)
	{
		System.out.println("Browser was launched successfully");

	}
	
public void loadurl()
{
	System.out.println("Application url loaded successfully");
	
}


	public static void main(String[] args) {
		Browser a = new Browser();
		a.launchBrowser("chrome");
	
		a.loadurl();
		

	}

}
