package mentorWeek3.day1;

public class Chrome extends Browser {
	public void openURL()
	{
		System.out.println("Chrome class openURL");
	}
	public void openURL(String URL)
	{
		System.out.println(URL);
	}
	public void openIncognito()
	{
	System.out.println("Chrome- openIncognito");
	}
	public void clearCache()
	{
		System.out.println("Chrome- clearCache");
	}
	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.closeBrowser();
		c.clearCache();
		c.openURL();
	}
}
