package week1Dharu.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b1=new Browser();
		String launchBrowser = b1.launchBrowser("chrome");
		System.out.println(launchBrowser);
		b1.loadURL();
	}

}
