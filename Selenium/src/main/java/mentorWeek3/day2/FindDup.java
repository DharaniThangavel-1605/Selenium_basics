package mentorWeek3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindDup {

	public static void main(String[] args) {

		int[] num= {23,56,13,56,78,13};
		//how you will add in list
		
		List<Integer> removeDup=new ArrayList<Integer>();

		
		//for each loop-
		for (Integer dup : num) {
			removeDup.add(dup);	
		}
		System.out.println(removeDup);
		
		
		
		
//		for (int i = 0; i < num.length; i++) {
//			
//			removeDup.add(null)
//		}
	}

}
