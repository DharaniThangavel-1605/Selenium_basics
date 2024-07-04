package mentorWeek1.day2;

import java.util.Arrays;

public class PrintDuplicateValue2 {

	public static void main(String[] args) {

		int[] age= {23,25,45,23,66,12,56,34,12,18};
	
		//{12,12,18,23,23,25,34,45,56,66}
		
		Arrays.sort(age);
		
		for (int i = 0; i < age.length-1; i++) {
			
			//[1]=12 == [1+1][2]=18
			if(age[i]==age[i+1]) {//10==10+1
				System.out.println(age[i+1]);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
