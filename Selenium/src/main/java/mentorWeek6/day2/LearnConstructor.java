package mentorWeek6.day2;

public class LearnConstructor {

	int age;
	String name;

	// default constructor
	public LearnConstructor() {
		System.out.println("This is Default constructor" + (5 + 5));
	}

	// parametrized constructor
	public LearnConstructor(int age, String name) {
		this();
		System.out.println("This is Parameter constructor:" + age + " " + name);
	}

	public LearnConstructor(int a) {
		this(20, "Dilip");
		System.out.println(a);

	}

	public static void main(String[] args) {

		
//		LearnConstructor lc = new LearnConstructor();
//		 System.out.println("Default constructor: "+lc.age);
//		 System.out.println("Default constructor: "+lc.name); 
//		 LearnConstructor lc2=new LearnConstructor(27,"Dilip");
		 

		// use one constructor call -it will execute 2 constructor
//this-keyword-its refer current class -variable,method,constructor

		
		 LearnConstructor lc = new LearnConstructor(5);
		 

	}

}
