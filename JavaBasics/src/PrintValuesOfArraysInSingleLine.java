
public class PrintValuesOfArraysInSingleLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(" " + abc[i][j] + " ");
			}
			
		}
	}

}
