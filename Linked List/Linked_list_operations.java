import java.util.LinkedList;
class Linkedlist{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		
		l1.add("10");
		l1.add("20");

		l1.addFirst("50");

		l1.addLast("100");

		l1.set(1,15);
		l1.remove();
		l1.removeLast();

		System.out.println("Linked List is:"+l1);

		LinkedList l2=new LinkedList();
		l2.add("15");
		l2.add("40");
		l2.add("100");
		l2.remove();
		System.out.println("Linked List is:"+l2);

		LinkedList l3=new LinkedList();
		for(String e:l1)
			l3.add(l2.contains(e)?"Equal":"Unequal");
		System.out.println(l3);
	}
}


import java.util.*;   
  public class LINKED{                        //Declaring Public Class
  public static void main(String[] args) {

   LinkedList<String> l1= new LinkedList<String>();         //Linked List creation
  
          /*Add(String Element)for adding the elements to the linked list*/ 
          l1.add("Red");   
          l1.add("Green");

          /*Add First and Last Element*/
          l1.addFirst("White");   
          l1.addLast("Pink");

          
          /*Set Values to add element to LinkedList*/
          l1.set(1,"Black");

          /*Remove first and last element*/
          l1.remove();
          l1.removeLast();

          System.out.println("Linked List 1:"+l1);    //Displaying Output

          LinkedList<String> l2= new LinkedList<String>();      //Linked List creation
          l2.add("Red");
          l2.add("Green");
          l2.add("Black");
          l2.add("Orange");

          System.out.println("Linked List 2:"+l2);                                    //Linked List creation
          System.out.println("Elements of Linked List 1 present in Linked List 2");

          //Comparing Linked List 1 Elements with Linked List 2 Elements
          LinkedList<String> c3 = new LinkedList<String>();
          for (String e : l1)
             c3.add(l2.contains(e) ? "Found" : "Not Found");
          System.out.println(c3);         
     }
}



White,Black,Green,Pink
