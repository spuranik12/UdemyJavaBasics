
public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		//We can declare also:-
		//int b[][] = {{1,2,3},{4,5,6}};
		
		//Req: Print second row first column value. i.e., a[1][0] as array index start from 0;
		//System.out.println(a[1][0]);s
		
		//Sec Req: Print all values of multi dimentiosnal array
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}
