package mentorWeek3.day1;

public class BMW_C extends Car_P {

	public void sensor() {
		System.out.println("BMW_C  : Sensor");
	}
	
	public void drivingMode() {
		System.out.println("BMW_C : Mode");
	}
	
	
	//method overriding
	
	public void applybreak(int a) {
		System.out.println("ABS Break From Child class");
	}
	
	
	public static void main(String[] args) {
		BMW_C b=new BMW_C();
		
		b.applybreak(4);
		b.horn();
		b.gear();
		b.sensor();
		b.drivingMode();
	}
}
