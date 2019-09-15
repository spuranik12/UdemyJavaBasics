
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String actualString ="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			//System.out.println(s.charAt(i));
			actualString = actualString + s.charAt(i);
		}
		
		//System.out.println(actualString);
		if(actualString.equalsIgnoreCase(s))
		{
			System.out.println("Given string " + " ' " + actualString + " ' " + " is 'PALINDROME'.");
		}
		else
		{
			System.out.println("Given string " + " ' " + actualString + " ' " + " is not a 'PALINDROME'.");
		}
	}

}
