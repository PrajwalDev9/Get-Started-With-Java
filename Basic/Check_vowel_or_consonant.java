/*
import java.util.*;
public class Check{
	public static void main(String[] args)
	{
		String ch;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		ch=input.nextLine();
		if(ch=='a' or ch=='e' or ch=='i' or ch=='o' or ch=='u' or ch=='A' )
			System.out.println(ch+"is an Vowel");
		else
			System.out.println(ch+"is an Consonant");
	}
}
*/
import java.util.*;			
public class Check{				//Declare Public class
    public static void main(String[] args)
    {
        char ch;				//Declare variables
        Scanner input=new Scanner(System.in);	//Scanner Input
		
        System.out.println("Enter an Alphabet : ");
        ch=input.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')	//Intialize if else St
            System.out.print(ch+" is an Vowel");	//Display Output
        else
            System.out.print(ch+" is an Consonant");
        
    }
}