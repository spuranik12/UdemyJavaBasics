
public class tryCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =8;
		int b=0;

		try
		{
			int c = a/b;
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("I catch arithmetic execption.");
		}
		catch(Exception e)
		{
			System.out.println("I catched error / exception here..");
		}
		finally
		{
			System.out.println("I am in fianlly");
		}
	}

}
