package assignments;

public class LengthOfLastWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="fly me   to   the moon";
		String[] split = s.split(" ");
		System.out.println(split[split.length-1]);
	}
}
