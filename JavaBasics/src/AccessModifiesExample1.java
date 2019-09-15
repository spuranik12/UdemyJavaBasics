
public class AccessModifiesExample1 {

	public void publicMethod()
	{
		System.out.println("This is public");
	}
	
	void defaultMethod()
	{
		System.out.println("This is default");
	}
	
	private void privateMethod()
	{
		System.out.println("This is private");
	}
	
	protected void protectedMethod()
	{
		System.out.println("This is protected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*AccessModifiesExample1 ex1 = new AccessModifiesExample1();
		ex1.privateMethod();*/
	}

}
