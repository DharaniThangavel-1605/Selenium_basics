package mentorWeek5.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	//default value=0
	//if priority not set , i execute in ascii order ced=cde
	//-ve(accept)-lower priority 
	@Test
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test(priority=-2)
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test(priority=2)
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	
	
}
