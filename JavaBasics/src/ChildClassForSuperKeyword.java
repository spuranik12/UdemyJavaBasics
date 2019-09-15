
public class ChildClassForSuperKeyword extends ParentClassForSuperKeyword{

	//Here we extend parent clas to access it's properties and how to use SUPER keyword
	
	String name = "Ruturaj"; //--Decalre same variable name
	
	public ChildClassForSuperKeyword()
	{
		super();
		System.out.println("Child class constructor");
	}
	public void getStringData()
	{
		System.out.println(name); //This line calls local variable with names
		System.out.println(super.name); //This line calls the parent class name variable present in it.
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassForSuperKeyword c = new ChildClassForSuperKeyword();
		c.getStringData();
		c.getData();
	}

}
