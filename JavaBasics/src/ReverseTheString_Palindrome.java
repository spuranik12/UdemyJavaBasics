
public class ReverseTheString_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Req : Print the reverse of the string.*/
		
		String s = "madam";
		String actual = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			//System.out.println(s.charAt(i));
			actual = actual + s.charAt(i);
		}
		
		//System.out.println(actual);
		
		if(s.equalsIgnoreCase(actual))
		{
			System.out.println("String " + " ' " +actual+ " ' " + " is palindrome");
		}
		else
			System.out.println("String " + " ' " +actual+ " ' " + " is not a palindrome");
	}

}
