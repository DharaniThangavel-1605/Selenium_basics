package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] input = new int[] { 5, 2, 1 };
		int rev[] = new int[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				rev[j] = input[i];
				System.out.println(rev[j]);
				if(input.equals(rev[j]))
				{
					System.out.println("palindrome");
				}
				break;
				
			}
		}*/
		
		int reversedNum = 0, remainder;
		Scanner p=new Scanner(System.in);
	    System.out.println("Enter any number:");
	    int num=p.nextInt();
	    // store the number to originalNum
	    int originalNum = num;
	    //212
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	}
}
