package assignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="We learn Java basics as part of java sessions in java week1";
		String output="";
		String[] eachWord=input.split(" ");
		for (int i = 0; i < eachWord.length; i++)
		{
			for (int j = i+1; j < eachWord.length ; j++)
			{
					if(eachWord[i].equals(eachWord[j]))
					{
						eachWord[i]="";
						eachWord[j]="";
					}
			}
		}
		for(String word: eachWord) {
				output = output + word + " ";
		}
		System.out.println("\nSentence after removing duplicate words: " + output);
	}
}
