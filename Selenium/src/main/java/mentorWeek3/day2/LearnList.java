package mentorWeek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

List<String> mentors=new ArrayList<String>();
//m1-add
mentors.add("Muthu");
mentors.add("Vinoth");
mentors.add("Aathi");
mentors.add("Mukesh");
mentors.add("Gokul");
mentors.add("Vinoth");
mentors.add("Mukesh");
 

System.out.println(mentors);

//m2-remove index start from '0'
mentors.remove(1);

System.out.println("after remove name : "+mentors);

//m3-add new name in postion 2
mentors.add(2, "Dilip");

System.out.println("after adding new  name : "+mentors);


//m4-size
int size = mentors.size();
System.out.println("size of the list :" + size);

//list sort value -collections.sort()
Collections.sort(mentors);

//all the name print 
//if i want print data   m5-get()
for (int i = 0; i < mentors.size(); i++) {
	System.out.println(mentors.get(i));	
}
//m6-clear
mentors.clear();
System.out.println("after clear list : "+mentors);		
	}
}
