
public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Consider one array which is of integer type
		int arr[] = {2,9,3,8,1};
		
		//Take one variable to store sum value
		int sum=0;
		
		//Req: We need to get sum of these objects present in array arr[] 
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
			sum=sum+arr[i];
		}
		
		System.out.println("Total sum of array is " + sum);
	}

}
