package assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 6, 3, 5, 2, 8, 7 };
		Arrays.sort(a);
		//1,2,3,4,6,7,8
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
