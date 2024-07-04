package mentorWeek3.day2;

public class Sbi implements Rbi {

	
	public int withdrawal() {
		return 1000000;
	}

	
	public String kyc() {
		// TODO Auto-generated method stub
		return "pan";
	}

	public void minBalance() {
		System.out.println("minBalance in account is 5000");
	}
	
	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		int withdrawal = s.withdrawal();
		System.out.println("Withdrawal Limit is :"+withdrawal);
		String kyc = s.kyc();
		System.out.println("Kyc :"+kyc);

		s.minBalance();
	}


	@Override
	public void personloan() {
		// TODO Auto-generated method stub
		
	}
}
