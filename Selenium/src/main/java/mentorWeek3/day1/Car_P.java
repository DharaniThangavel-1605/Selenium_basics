package mentorWeek3.day1;

public class Car_P extends Vehicle_GP {

	
	public void gear() {
		System.out.println("Car_P  : Gear");
	}
	
	
	//object for child and call the parent class properties
	
	public static void main(String[] args) {
		Car_P c=new Car_P();
		
		//object.method()
		c.horn();
		c.gear();
	}
	
}
