package assignments;

public class LoginTestData extends TestData{
	public void enterUserName()
	{
		System.out.println("Username method");
	}
	public void enterPassWord()
	{
		System.out.println("Password method");
	}
	public static void main(String[] args) {
		LoginTestData l=new LoginTestData();
		l.enterCredentials();
		l.navigateToHomepage();
		l.enterUserName();
		l.enterPassWord();
		TestData t=new TestData();
		t.enterCredentials();
		t.navigateToHomepage();
	}
}
