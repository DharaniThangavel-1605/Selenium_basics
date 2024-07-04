package week1Dharu.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	public void loadURL()
	{
		System.out.println("Application URL loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		String launchBrowser = b.launchBrowser("chrome");
		System.out.println(launchBrowser);
		b.loadURL();
		
	}

}
