package mentorWeek3.day1;

public class LearnMethodOverLoading {

	public void add() {
		System.out.println(6+4 +" : without input agrs ");
	}
	
	public void add(int a,int b) {
		System.out.println(a+b +" : with 2 input agrs") ;
	}
	
	public void add(int c,int d,int a) {
		System.out.println(a+d+c +" : with 3 input agrs");
	}
	
	//browser(int,string)
	public void browser(int version,String name) {
		System.out.println(version +" "+ name);
	}
	
	//browser(string,int)
	public void browser(String name,int version) {
		System.out.println(version +" "+ name);
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		
		ol.add();
		ol.add(7, 8);
		ol.add(6, 7, 8);
		ol.browser(118, "Chrome");
		ol.browser("Edge", 119);
	}
	
}
