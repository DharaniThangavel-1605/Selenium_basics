package mentorWeek3.day2;

public class ExecutionClass extends Sbi_Abstract {

	public static void main(String[] args) {
		ExecutionClass ec=new ExecutionClass();
		ec.fd();
		System.out.println(ec.kyc());
		ec.personloan();
		System.out.println(ec.withdrawal());

	}

	@Override
	public void personloan() {
System.out.println("personloan");		
	}

	@Override
	public void fd() {
		System.out.println("fd");		
		
	}

}
