
public class ConstructorsExamples {

	//Constructor dont have return type & will have same as className
	public ConstructorsExamples()
	{
		System.out.println("I am in the constructor...");
	}

	public void getMethod()
	{
		System.out.println("I am in method..");
	}

	//PARAMTERIZED
	public ConstructorsExamples(int a, int b)
	{
		System.out.println("I am in the parameterized constructor..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If object is created, first constructor of that class is executed. No need to call explicitly.
		ConstructorsExamples ce = new ConstructorsExamples(); //--This for non paramterized constructor.
		ConstructorsExamples ce1 = new ConstructorsExamples(5, 2); //--This for  paramterized constructor.

	}

}
