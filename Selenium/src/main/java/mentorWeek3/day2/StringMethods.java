package mentorWeek3.day2;

public class StringMethods {

	public static void main(String[] args) {

		String comName="Test Leaf is Testing Company";
		//T st L af is T sting Company
		//output : TestLeafisTestingCompany
		
		//m7-split
		String[] split = comName.split(" ");
		//Test
		//Leaf
		//is
		//Testing
		//Company
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println(" ");
		//m8-Replace()
		String data="Dilip";
		String replace = data.replace('p', '1');
		System.out.println(replace);
		
		
		//m-9 replaceAll
		//amazon 10000 product live sales
		//amazon @@@@@ product live sales
		//111111 10000 1111111 1111 11111
		
		String value="Amazon 10000 Product Live Sales";
		String replaceAll = value.replaceAll("[a,s]", "#");
		System.out.println(replaceAll);
		
		String replaceAll1 = value.replaceAll("[0-9]", "*");
        System.out.println(replaceAll1);

		String replaceAll2 = value.replaceAll("[^0-9]", "%");
		System.out.println(replaceAll2);
		
		//m10- substring-method overloading
		//same method name with different input agrs
		
		String com="TestLeaf";
		String substring = com.substring(3);
		System.out.println(substring+ ": SubString (being index)");
		//tLeaf
		
		String substring2 = com.substring(1, 6);
		System.out.println(substring2 +" : sunstring with start index and (end index -1)");
		
		//0
		//8=(0-7)(1,6)=(1,6-1)=estLe
		
		//m11-tolowercase & touppercase
		
		String product="sentEnCE";
		String lowerCase = product.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = product.toUpperCase();
		System.out.println(upperCase);
		
		//m-12 convert string value into int value 
		//Integer.parseInt()
String price="12500";
int parseInt = Integer.parseInt(price);
System.out.println(parseInt);
		
	}

}
