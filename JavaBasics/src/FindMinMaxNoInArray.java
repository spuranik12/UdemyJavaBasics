
public class FindMinMaxNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*2 4 7
		 5 3 9
		 6 1 8
		 
		 Question: Print minimum number from above matrix?*/
		
		int a[][] = {{2,4,7},{5,3,9},{6,1,8}};
		int min = a[0][0]; //To compare each value need to set for first value.
		int max = a[0][0]; //To find max no.
		
		/** Req 1: To find smallest no in an array. **/
		for(int i=0; i<a.length; i++) //for rows
		{
			for(int j=0; j<a.length; j++) //for columns
			{
				//We have to iterate for each & every element of an array to check which is small. 
				//But for that we need one ref point to compare with each value of any array. So consider one variable min, first it is
				//set to 0. But when u set for 0, then all other values will be always bigger than it. So instead of 0 set to 1st value
				//of an array, whether it is small or greater no matter.
				
				if(a[i][j]<min)
				{
					min=a[i][j]; //If smaller then store it in max variable.
				}
			}
			
		}
		
		System.out.println("Smallest number is " +min);
		
		/** Req 2: To find greatest no in an array. **/
		for(int i=0; i<a.length; i++) //for rows
		{
			for(int j=0; j<a.length; j++) //for columns
			{
				//We have to iterate for each & every element of an array to check which is small. 
				//But for that we need one ref point to compare with each value of any array. So consider one variable min, first it is
				//set to 0. But when u set for 0, then all other values will be always bigger than it. So instead of 0 set to 1st value
				//of an array, whether it is small or greater no matter.
				
				if(a[i][j]>max)
				{
					max=a[i][j]; //If greater then store it in max variable.
				}
			}
			
		}
		
		System.out.println("Greatest number is " +max);
	}
}
	
	


