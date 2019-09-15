
public class thisKeywordDemo {

	int a=2;
	
	public void sum()
	{
		int a=3;
		
		System.out.println(a);
		System.out.println(this.a); //--Here this keyword is used to access global variable inside class.
		
		//Req: If we want to sum global & local variable which has same variable name
		int b = a+this.a;
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKeywordDemo td = new thisKeywordDemo();
		td.sum();
	}

}
