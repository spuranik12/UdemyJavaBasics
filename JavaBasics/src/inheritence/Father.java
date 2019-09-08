package inheritence;

public class Father extends GrandFather{

	//We want to use grandfather class properties in father class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f = new Father();
		//Directly from father object we can access grandfather properties.
		f.city();
		f.country();
		f.job();
		System.out.println(f.i);
	}
	
	public void job()
	{
		System.out.println("Job 2");
	}

}
