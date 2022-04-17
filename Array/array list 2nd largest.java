import java.util.ArrayList;
import java.util.Collections;

class Array{
	public static void main(String[] args)
	{
		int total;
		ArrayList l1=new ArrayList();
		l1.add(1);		//Using Add() method
		l1.add(10);

		l1.add(2,20);		//Using Index Add() number method
		l1.add(3,50);

		l1.set(2,40);	//Update Array Elements from the list using set()
		l1.set(1,25);

		l1.remove(2);	//remove Array Elements by Index() Position
		
		Collections.sort(l1);	//Sorting Array Elements using Sort()
		System.out.println("ArrayList:"+l1);		//Display Array List
		for(int i=0;i<l1.size();i++)			//For Loop
		{
			System.out.println("Second Largest Number:");		//Display Second Largest Element
			int secondnumber=l1.get(1);
		}
}
}





		


