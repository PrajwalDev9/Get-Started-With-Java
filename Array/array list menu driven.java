import java.util.ArrayList;
import java.util.*;

class Array{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		Scanner n=new Scanner();
		System.out.println("For Array List Elements:\n\nEnter Choice:-\n1.Add\n2.Add By Index\n3.Update\n4.Remove\n5.Second Largest Element");
		int ch=n.nextInt();
		switch(ch)
		{
			if(ch==1):
			{
				System.out.println("Enter Element: \n");
				int e=n.nextInt();
				l1.add(e);
				break;
			}
			if(ch==2):
			{
				System.out.println("Enter Element: \n");
				int e=n.nextInt();
				System.out.println("Enter Position: \n");	
				int p=n.nextInt();
				l1.add(e,p);
				break;
			}
			if(ch==3):
			{
				System.out.println("Enter Updated Element: \n");
				int e=n.nextInt();
				System.out.println("Enter Position: \n");
				int p=n.nextInt();
				l.set(e,p);
				break;
			}
			if(ch==4):
			{
				System.out.println("Enter Element to be Deleted: \n");
				int e=n.nextInt();
				l1.remove(e);	
			}
		}
	}
}	

/*
		l1.add(1);		//using add() method
		l1.add(10);

		l1.add(2,20);		//using index number method
		l1.add(3,50);

		l1.remove(0);	//remove array list elements by index position

		l1.set(2,40);	//change array elements from the list
		





		System.out.println("ArrayList:"+l1);
	}
}
*/




/*
add
remove
add all
size*/
