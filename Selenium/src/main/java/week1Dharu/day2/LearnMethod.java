package week1Dharu.day2;

public class LearnMethod {
//normal method should be under class level
	//return type with void and no put arguments
	public void add()
	{
		System.out.println("Add");
	}
	//return type with a primitive datatype
	public int add(int a,int b)
	{
		return a+b;
	}
	
	
	public void data(int age,String name)
	{
		System.out.println("My age is "+age+"\n"+"My name is "+name);
	}
	
	private void browser() 
	{
		System.out.println("chrome");
	}
	//default accessmodifier
	void browserVersion()
	{
		System.out.println("116");
	}
	
	public static void main(String[] args) {
		LearnMethod lm=new LearnMethod();
		lm.add();
		//shortcut to creat local variable ctrl+2
		int add = lm.add(7,8);
		System.out.println(add);
		System.out.println("7+ 8 is"+"\t"+lm.add(7, 8));
		lm.data(30,"Dharani");
		lm.browser();
		lm.browserVersion();
	}
}
