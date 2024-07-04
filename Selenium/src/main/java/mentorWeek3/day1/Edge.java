package mentorWeek3.day1;

public class Edge extends Chrome{
	public void takeSnap()
	{
		System.out.println("Edge takeSnap");
	}
	public void clearCookies()
	{
		System.out.println("Edge clearCookies");
	}
	public static void main(String[] args) {
		Edge e=new Edge();
		e.navigateBack();
		e.clearCache();
		e.clearCookies();
	}
		
}
