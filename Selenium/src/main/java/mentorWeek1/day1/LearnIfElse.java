package mentorWeek1.day1;

public class LearnIfElse {

	public static void main(String[] args) {
		
		int num=0;
		
		//if condition if-> ctrl+space
		
		if (num>0) {
			System.out.println("positive number :" +num);
		} else {
System.out.println("negative number: "+ num);
		}
		
		
		if(num>0) {
			System.out.println("positive number :" +num);
		}else if(num==0) {
			System.out.println("neutral number :"+num);
		}else {
			System.out.println("negative number: "+ num);

		}

	}

}
