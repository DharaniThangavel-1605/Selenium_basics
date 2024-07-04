package mentorWeek1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {

		//syntax
		//switch(condition) 
		//case "value": syso(); break;
		//break will come under jump stmts 
		
		
		String browser="ie";
		switch(browser) {
		
		case "edge": System.out.println("edge browser"); break;
		case "firefox": System.out.println("firefox browser"); break;
		case "chrome": System.out.println("chrome browser"); break;
		case "safari": System.out.println("safari browser"); break;
		
		default:System.out.println("no browser found");
		}
	}

}
