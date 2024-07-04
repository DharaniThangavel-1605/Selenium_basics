package mentorWeek5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {

	
	//default-value =true
	
	@Test(enabled = false)
	public void createLead() {
		System.out.println("createLead-bug");
	}
	
	@Test(enabled=false,priority=-1)
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	
}
