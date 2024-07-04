package mentorWeek3.day2;

public class Countcharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String input="Test Leaf";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println("Number of 'e' present:"+count);
	}

}
