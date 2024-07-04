package mentorWeek1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//array literal
		
		int[] rollNo= {89,87,12,45,67,99,43,21};
		
		String[] mentors= {"Muthu","Aathi","Gokul","Vinoth","Mukesh"};
		//A,G,M,M,V
	
	//what is length of mentors -length
		//length- property  ,variable.length
		
		int length = mentors.length;
		System.out.println("number data present in the array :"+length);
		
		//vinoth name -index value[3]
		//index value start'0'
		
		System.out.println(mentors[3]);
		
		// 1-5
		// array index -0,1,2,3,4
		//print the last data
		System.out.println(mentors[length-1]);
		
		System.out.println(mentors[length-3]);
		
		//sort
		Arrays.sort(mentors);
		System.out.println("after sorting the data : "+mentors[3]);
	
		//for loop
		//0-4
		//0,1,2,3,4
	//	java.lang.ArrayIndexOutOfBoundsException {'=', or length-1}
		for (int i = 0; i <=mentors.length-1; i++) {
			System.out.println(mentors[i]);
		}
		
	}

}
