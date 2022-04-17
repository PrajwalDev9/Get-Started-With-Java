import java.util.*;								//Import Scanner class
public class grid{								//Declare Public class
	public static void main (String[] args){
		int a[][]=new int [20][20];				//Array Variable Declaration
		int n;
		Scanner S=new Scanner(System.in);			//Scanner Input 
		System.out.println("Enter Grid Line Value:");
		n=S.nextInt();								
		for(int i=0;i<n;i++)						//For loop intialized
		{
			for(int j=0;j<n;j++)					//Inner For loop intialized
			{
				System.out.printf("-",a[i][j]);		// Print Output
			}
			System.out.println();
		}
	}
}