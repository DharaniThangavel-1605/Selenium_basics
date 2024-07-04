package selenium;

import java.util.LinkedHashSet;
import java.util.Set;

public class HandlingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="google";
		char[] ch = companyName.toCharArray();
		Set<Character> unique= new LinkedHashSet<Character>();
		for (Character character : ch) {
			
			unique.add(character);
		}
		System.out.print(unique);
	}

}
