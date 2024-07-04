package mentorWeek3.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String data="EdTech";
		
		//hceTdE
		//for loop -decre (i--)
		//tocharArray
		
		char[] ch = data.toCharArray();
		for (int i =ch.length-1 ; i >=0; i--) {
			System.out.print(ch[i]);
		}

	}

}
