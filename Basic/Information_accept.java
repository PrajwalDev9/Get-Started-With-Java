import java.util.*;
public class Detail
{
	public static void main(String[] args)
	{
		String name,address,city;
		int age,post;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		name=input.nextLine();
		System.out.println("Enter Your Address:");
		address=input.nextLine();
		System.out.println("Enter Your City:");
		city=input.nextLine();
		System.out.println("Enter Age:");
		age=input.nextInt();
		System.out.println("Enter PostalCode:");
		post=input.nextInt();
		System.out.println("Details are:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("City:"+city);
		System.out.println("Postal Code:"+post);
	}
}