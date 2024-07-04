package mentorWeek3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {

		//String literal
		String companyName="Test Leaf";
		
	//String object
		String comName=new String("Test Leaf");
		
		//m-1 length()
		
		int cnLength = companyName.length();
		
		System.out.println(" total number of chars :"+ cnLength);
	
		//m-2 equals()
		
		if(companyName.equals(comName)) {
			System.out.println(comName +" : Data is matched  .eq()");
		}else {
			System.out.println(comName + " : Data is not matched .eq()");
		}
	
		//what is different b/w .equals() (check string value) & ==(check memory address)
		
		if(companyName==(comName)) {
			System.out.println(comName +" : Data is matched ==");
		}else {
			System.out.println(comName + " : Data is not matched ==");
		}
		
		//m3-equalignorecase
		
		String data="Test";
		String data1="test";
		
		if(data.equalsIgnoreCase(data1)) {
			System.out.println("Data is matched .eqic()");
		}else {
			System.out.println("Data is not  matched .eqic()");

		}
		
		
		//m4-contains
		
		boolean contains = comName.contains("Test   : contains()");
		System.out.println(contains);
		
		
		//m5-tocharArray 
		//String data if we need use for loop we need convert data in to tocharArray
		
		String mentor="Dilip";
			//[]-array
		//index will be start from '0'
		
		char[] ch = mentor.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		//m6-charAt()
		
		char charAt = mentor.charAt(0);
		System.out.println(charAt+"  .charAt()");
		
		
	}

}
