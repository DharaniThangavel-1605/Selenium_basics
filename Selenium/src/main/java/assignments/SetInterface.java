package assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="google";
		char[] eachLetter=input.toCharArray();
		Set<Character> output=new LinkedHashSet<>();
		for (int i = 0; i < eachLetter.length; i++)
		{
			output.add(eachLetter[i]);
		}
		System.out.println(output);
	}

}
