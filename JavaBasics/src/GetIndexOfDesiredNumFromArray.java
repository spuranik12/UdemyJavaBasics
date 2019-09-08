
public class GetIndexOfDesiredNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Req: Print the index of desired value.
		
		//Consider one array which is of integer type
		int arr[] = {2,9,3,8,1,6};
				
		//Take one variable to store sum value
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i + " Index" + " - " + arr[i] + " value");
			if(arr[i]==8)
			{
				//Here 'i' is index because on each index we are iterating in for loop. So just get index when reaches desired value
				System.out.println("Desired value is " + i);
				break;
			}
			
		}
	}

}
