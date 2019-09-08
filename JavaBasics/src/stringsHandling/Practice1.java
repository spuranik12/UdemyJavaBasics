package stringsHandling;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Consider the scenario that we have to validate text i.e., Payments $100 paid.
		//Using String class object
		
		String str = "Payment $100 paid"; //Here we can create object of String class directly without using new operator.
		
		//Use string class methods to perform actions to validate text
		//1- Get index of char '$' in text given
		System.out.println(str.charAt(8));
		
		//2- We came to know at which letter exists in given index. Now we can also get index of letter/character needed
		System.out.println(str.indexOf("$"));
		
		//3- IF we want to get text from middle of sentence
		System.out.println(str.substring(8));
			/* --OR-- */
		System.out.println(str.substring(str.indexOf("$")));
	}

}
