
public class ArraysDemo {
	
	public static void main(String[] args) {
		
		//An array is a container which stores multiple values of same data type.
		
		//Here we will see how to declare an array & allocate memory for the values of an array.
		 //Allocates memory using new keyword for 5 values which is of integer type.
		int a[] = new int[5];
		
		a[0]=3;
		a[1]=6;
		a[2]=9;
		a[3]=12;
		a[4]=15; //Initialized 5 values of an array.
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
