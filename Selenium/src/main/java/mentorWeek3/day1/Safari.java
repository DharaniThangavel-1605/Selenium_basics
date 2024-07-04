package mentorWeek3.day1;

public class Safari extends Edge {
	public void readerMode()
	{
	System.out.println("Safari readerMode");
	}
	public void fullScreenMode()
	{
		System.out.println("Safari fullScreenMode");
	}
	public static void main(String[] args) {
		Safari s=new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		s.openIncognito();
		s.navigateBack();
		s.clearCookies();
		s.clearCache();
		s.takeSnap();
		s.fullScreenMode();
	}
}
