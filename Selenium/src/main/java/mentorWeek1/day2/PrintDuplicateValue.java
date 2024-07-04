package mentorWeek1.day2;

public class PrintDuplicateValue {

	public static void main(String[] args) {

		int[] age= {23,25,45,23,66,12,56,34,12,18};
		//for loop
		//if condition
		
		//output- 23,12
		
		//nested for loop -2 for loop
		
		//[0]=23,[1]=25
		for (int i = 0; i < age.length; i++) {
			
			//[i+1]=[0+1]=[1]=25 ,[1+1]=[2]=45
			for (int j = i+1; j < age.length; j++) {
				
				if(age[i]==age[j]) {
					
					System.out.println("duplicate value :"+ age[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
