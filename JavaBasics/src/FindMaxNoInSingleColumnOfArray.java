
public class FindMaxNoInSingleColumnOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Get max no. of that particular column where min number of an array exists.!!
		  >> We will break into steps:-
			- Step 1: Find minimum number of an entire array.
			- Step 2: Identify the column of minimum number in an array.
			- Step 3: Get maximum number from identified column where minimum no. of an array exists.*/
		
		/*Array considered is as shown in matric structure
		2 7 3
		1 9 0
		4 4 11*/
		
		//Get one multidimensional array
		int abc[][] = {{2,7,3},{1,9,8},{4,4,11}};
		int minNum = abc[0][0]; //Consider first value of an array is small & compare with each value of array.
		int minColumnNum=0; //This variable to identify the column in which min number is present as Step 2
		
		/** Step 1- Find minimum number in an array */
		for(int i=0; i<abc.length; i++)
		{
			for(int j=0; j<abc.length; j++)
			{
				if(abc[i][j]<minNum)
				{
					minNum=abc[i][j];
					
					/** Step 2- Identify the column of minimum number in an array.*/
					//Here i is row, j is column. So just pass column value in the variable declared above.
					minColumnNum=j;
				}
			}
		}
		System.out.println("Minimum number is- "+minNum);
		System.out.println("Column number in which minimum number present is- "+minColumnNum);
		
		/** Step 3- Get maximum number from identified column where minimum no. of an array exists.*/
		
		//We have got column, in which we have to iterate and find max number. For single iteration we should while() loop
		
		int maxNumFromColumn=abc[0][minColumnNum]; 
		//-- As min number declared as first value of an array for refernce, similarly we have to set max value to compare in while loop
		int k=0;
		while(k<3) //Here 3 because, we have 3 rows
		{
			
			if(abc[k][minColumnNum] > maxNumFromColumn)
			{
				maxNumFromColumn=abc[k][minColumnNum];
			}
			k++;
		}
		System.out.println("Maximum number in an identified column is- " +maxNumFromColumn);
	}

}
