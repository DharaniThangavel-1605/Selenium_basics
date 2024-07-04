package week1Dharu.day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		
		//array literal
		
		//int[] rollNo= {35,45,36,49,50};
		String[] mentors= {"Raj","Riya","Priya","Ram","Sita"};
		
		//to find length - use length property
		int length = mentors.length; 		
		
		System.out.println(length);
		
		//to print Ram
		
		String string = mentors[3];
		System.out.println(string);
		
		
		System.out.println(mentors[2]);
		
		//to print last data
		
		System.out.println(mentors[length-1]);
		
	//sort
		
		Arrays.sort(mentors);
		System.out.println("After sorting "+mentors[2]);
		
//for loop
		
		for(int i=0;i<=mentors.length-1;i++)
		{
			System.out.println(mentors[i]);
		}
		
		
	}

}
