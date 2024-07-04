package mentorWeek3.day2;

public class FindNoCharacters {

	public static void main(String[] args) {
		String data="Chennai";
		//n=3
		int count=0;
		
		for (int i = 0; i < data.length(); i++) {
			if(data.charAt(i)=='n') {
				count++;
			}
		}

		System.out.println("number of 'n' is present :" +count );
	}

}
