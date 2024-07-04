package mentorWeek3.day2;

public abstract class Sbi_Abstract implements Rbi {

	//abstract is 0 to 100%  Abstract methods
	//it will have both implement and unimplement methods
	//need have one abstract method
	public int withdrawal() {
		return 1000000;
	}

	public String kyc() {
		return "pan";
	}
	public abstract void fd();
	//we can create object for Interface- no
	//we can create object for Abstract class -no
	
	public static void main(String[] args) {
	//	Rbi rbi=new Rbi();
   //   Sbi_Abstract sbi=new Sbi_Abstract();

	}
}
