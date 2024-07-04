package week7.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
		try {
			System.out.println(a/b+": division value");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("inside catch block :"+a/2);
		}
		
		System.out.println("code is executed");
		
		System.out.println("************************************");
		int[] rollNo= {101,103,102,109,108,111,123};
		
		try {
			System.out.println(rollNo[2]);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(rollNo[6]);
		}finally {
			System.out.println("finally block executed : "+rollNo[5]);
		}
		
	}

}
