package inheritence;

public class Son extends Father{

	//Here when we extends/inherit father class, grandfather & father both class properties can be accessed.
	//This is multilevel inheritance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		s.city();
		s.job();
	}

}
