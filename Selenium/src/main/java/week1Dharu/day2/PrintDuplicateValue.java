package week1Dharu.day2;

public class PrintDuplicateValue {
public static void main(String[] args) {
	int age[]= {23,24,25,26,23,27,12,12};
	
	//for loop
	//if condition
	
	//nested for loop - have to use 2 for loops
	//[0]=23, [1]=24	
	for(int i=0; i<age.length;i++)
	{
		for(int j=i+1; j<age.length;j++)
		{
			if(age[i]==age[j])
			{
				System.out.println(age[j]);
			}
		}
	}
	
}
}
