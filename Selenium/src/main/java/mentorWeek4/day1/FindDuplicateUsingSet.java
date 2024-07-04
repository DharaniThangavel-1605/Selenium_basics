package mentorWeek4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateUsingSet {

	public static void main(String[] args) {

		int[] number= {5,8,3,6,5,8,2,9,10};
		
		Set<Integer> uniq=new LinkedHashSet<Integer>();
		
		Set<Integer> dup= new LinkedHashSet<Integer>();
		
		for (Integer i : number) {
		
			if(!uniq.add(i)) {
				dup.add(i);
			}
		}
		System.out.println(uniq);
		System.out.println(dup);
		

        String companyName = "google";
        // l, e

        char[] ch = companyName.toCharArray();

        // set - syntax

        Set<Character> unique = new LinkedHashSet<>();

        // for each loop

        for (Character character : ch) {
            unique.add(character);
        }

        // Iterate through the LinkedHashSet and print each character
        for (Character character : unique) {
            System.out.print(character);
        }
	}

}
