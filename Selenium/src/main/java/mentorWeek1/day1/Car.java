package mentorWeek1.day1;

public class Car {

	//global variable
	int age=34;
	
	public static void main(String[] args) {
		
		//datatype variablename= value;
		
		// variable given inside main method -local variable(brown color)
		int wheel=4;
		String color="Green";
		boolean electricCar=true;
		float km=156.56f;
		//156.56 -double or float(156.56 f or F)
		char carLog='x';
		
		
		System.out.println("number of wheels :"+wheel);
		
		System.out.println(color+" : my car color");

		System.out.println(electricCar+"\n"+km+"\n"+carLog);
	}

}
