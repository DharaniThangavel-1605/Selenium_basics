package mentorWeek4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class LearnSET {

	public static void main(String[] args) {
		
		Set<String>mentors= new TreeSet<String>();
		
	//	Set<String>mentors= new HashSet<String>();

   //   Set<String>mentors= new LinkedHashSet<String>();

		mentors.add("Vinoth");
		mentors.add("Ranjini");
		mentors.add("Gokul");
		mentors.add("Ranjini");
		mentors.add("Dilip");
		mentors.add("Vinoth");
		
		System.out.println(mentors);
		
		//set - will not use collections.sort()- we having Tree set(doing same actions)
//set- will not use get()
		
		
		//foreach-when to use this one 
		//while in the collections programs
		
		//for(datatype variable:condition)
		for (String name : mentors) {
			System.out.println(name);
		}
		
	//data one value form the set
		//convert set into list
		
		//convert list into set
		
		List<String> mentor=new ArrayList<String>(mentors);
		
		String name = mentor.get(3);
		
		System.out.println("its convert set in to list -i used get() :"+name);
		
	}

}
