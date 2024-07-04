package assignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="I am a software tester";
		String[] eachWord=input.split(" ");
		String output="";
		for (int i = 0; i < eachWord.length; i++) 
		{
			//System.out.println(eachWord[i]);
			if(i%2!=0)
			{	
				String rev="";
				char[] eachChar=eachWord[i].toCharArray();
				for (int j = eachChar.length-1;j>=0;j--) 
				{
					rev=rev+eachChar[j];
				}
				output=output+rev+" ";
			}
			else
			{
				output=output+eachWord[i]+" ";
			}
		}
		System.out.println("Output is:"+output);

	}

}
