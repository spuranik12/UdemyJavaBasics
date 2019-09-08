
public class Methods {
	
	//Create one method which can be used in parent class
	public String ValidateHeader()
	{
		//Consider here we have all code for validating header
		System.out.println("Validated all headers");
		
		//Once all is done, if we want to say that its pass, so use return statement which returns in this method
		return "Pass";
		
		//When ever retrun is used, returnType of that method should be same data type what we are returning.
		//In this case, we are returning string.
		
	}
	
}
