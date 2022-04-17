import java.util.Scanner;
public class Average{
	public static void main (String[]args)
	{
		float n1,n2,n3,n4,n5;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter 5 Float Values:");
		n1=S.nextInt();n2=S.nextInt();n3=S.nextInt();n4=S.nextInt();n5=S.nextInt();
		float ans=(n1+n2+n3+n4+n5)/5;
		System.out.println("Addition is:"+ans);
	}
}