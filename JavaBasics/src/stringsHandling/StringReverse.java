package stringsHandling;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*How to reverse the string / How to check if text is palindrome?*/
		
		String s = "madam"; //Take one string to check
		String actual = ""; //Anaother string to compare value after reversing
		
		//Using for loop
		for(int i=s.length()-1; i>=0; i--) 
		//s.lenght() gives total length of string, i>0 because we want to come from reverse & i--, so if we run we get outOfBounds
		//execption as it starts from reverse, length should be also reversed. So use "s.length()-1"
		// If we keep condition i>0, it comes upto index becomes 0, but at 0th index we have value as well so i>=0;
		{
			System.out.println(s.charAt(i));
			//get char at each index. As we know how to get each index value using inbuilf method charAt()
			//Now we know that it is printing same when reversing. But how to verify. So for that get blank string value & store in it.
			
			actual = actual + s.charAt(i);
			//Here we are adding actual value because, as we are checking each character waise, so data type of blank value is string
			// And we have concatenate with each character to form string. So we keep on storing at each iteration & again concatenate
			// with new value
		}
		
		System.out.println(actual);
		
		//Now we can compare
		if(s.equals(actual))
		{
			System.out.println("Given string " + "'" + actual + "'" + " is palindrome.");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
