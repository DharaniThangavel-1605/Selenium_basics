package week1Dharu.day2;

public class PrintDuplicates {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age[]= {25,23,32,23,45,25,37,45,65};
    //Arrays.sort(age); 
    for(int i=0;i<age.length;i++)
    {
    	for(int j=i+1;j<age.length;j++)
    	{
    		if(age[i]==age[j])
    		{
    			System.out.println(age[j]);
    		}
    	}
    }

	}

}
