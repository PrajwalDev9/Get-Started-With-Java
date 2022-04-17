import java.util.*;									//Import Scanner class
public class Compare{								//Declare Public class
	public static void main (String[] args){
		String a,b;									//String Declaration
		Scanner S=new Scanner(System.in);			//Scanner Input
		System.out.println("Enter Value of String1:");
		a=S.nextLine();
		System.out.println("Enter Value of String2:");
		b=S.nextLine();
		boolean value1=a.equalsIgnoreCase(b);		//String comparison using boolean
		if(value1==true)							//If Else Statement
		{
			System.out.println(a+" and "+b+" "+"are Equal strings");
		}
		else
			System.out.println(a+" and "+b+" "+"are Unequal strings");
	}
}