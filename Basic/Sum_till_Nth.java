import java.util.*;
public class Sum{				//Declare Public class
	public static void main(String[] args)	
	{
		int n,i,sum=0;			//Declare variables
		Scanner input=new Scanner(System.in);	//Scanner Input 
		System.out.println("Enter Nth Value:");
		n=input.nextInt();
		for(i=1;i<=n;i++)		//Intialize For Loop
			sum=sum+i;
		System.out.println("Sum till Nth value is:"+sum);		//Display Output
	}
}