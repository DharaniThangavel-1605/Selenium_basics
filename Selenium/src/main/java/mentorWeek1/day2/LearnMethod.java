package mentorWeek1.day2;

public class LearnMethod {

	//normal method should under class level 
	
	//access modifier returntype methodname (input args)
	
	//return with void and no input args 
	//information
	public void add() {
		System.out.println("add");
	}
	
	//returntype with pdt
	//task completed 
	public int add(int a,int b) {
		return a+b;
		
	}
	
	public String browser(String bn) {
		System.out.println("");
		return bn;
		
	}
	
	public void data(int age,String name) {
		System.out.println("my age is :"+ age+ "my name :"+name);
	}
	
	//private
	private void browser() {
		System.out.println("chrome browser");
	}
	
	//default 
	void browserVersion() {
		System.out.println("116");
	}
	
	public static void main(String[] args) {
		
		//object syntax
		LearnMethod lm=new LearnMethod();
		
		//objname.methodname
		lm.add();
		
		//if you have used return type the datatype in method  
		//inside syso or you create loacl variable method 
		
		//ctrl+2->l --1 way
		int add = lm.add(7, 8);
		System.out.println(add);
		
		//way 2
		System.out.println(lm.add(7, 8));
		
		
		lm.data(28, "Dilip");
		
		lm.browser();
	}
}
