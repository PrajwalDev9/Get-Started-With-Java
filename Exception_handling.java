import java.util.*;					//Import Java Utility
import java.util.Scanner.*;
public class DivisionException{						//Public Class Created
	static int Divide (int x, int y ){			//Divide Function With Exception Handling
		try {							//try block
			int r = x/y;
			return r;
		} 									
		catch (ArithmeticException e)			//catch block 
		{		
			System.out.println ( "Division by zero\nResult of a/b is:Infinity" );		//Exception Check if b is non-zero
		}
		return 0;
	}

	public static void main (String args[]) 
	{
		Scanner input=new Scanner(System.in);			//Scanner Intialized
		int a,b, result;							//Variable Declaration
		System.out.println("Enter Value of a:");
		a=input.nextInt();							//Take Int Input
		System.out.println("Enter Value of b:");
		b=input.nextInt();								//Take Int Input
		try{								//Exception Check if a&b is non-zero
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.print("Value of a and b =  "+a+"  "+b);
		}catch(Exception e){}				//catch block	
		result  = Divide (a, b);		//Function Call
		if(a==0 && b==0) 
			System.out.println ( "\nDivision is Not Possible\nResult of a/b is:Undefined ");		
		if(b!=0)																				//Check if b is not zero
		System.out.println ( "\nDivision is Possible\nResult of a/b is: " + result);		
	}
}