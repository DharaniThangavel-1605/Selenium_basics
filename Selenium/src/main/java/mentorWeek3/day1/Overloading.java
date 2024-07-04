package mentorWeek3.day1;

public class Overloading {
public void reportStep(String message,String status)
{
	System.out.println(message+"\t"+status);
}
public void reportStep(String message,String status,boolean parameter)
{
	System.out.println(message+"\t"+status+"\t"+parameter);
}
public static void main(String[] args) 
{
	Overloading o=new Overloading();
	o.reportStep("HI", "active");
	o.reportStep("HI", "active", false);
}
}
