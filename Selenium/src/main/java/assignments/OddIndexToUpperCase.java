package assignments;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] input = test.toCharArray();
		for (int i = 0; i < input.length; i++) 
		{
			if(i%2!=0)
			{
				char modified = Character.toUpperCase(input[i]);
				System.out.print(modified);
			}
			else
			{
				char modified = Character.toLowerCase(input[i]);
				System.out.print(modified);
			}
			
		}
	}

}
