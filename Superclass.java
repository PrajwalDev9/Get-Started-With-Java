class SuperClass							//Main Superclass Declared
{
public static void main(String args[]){  
   Programmer p=new Programmer();				//Programmer object Intialized
   Tester t=new Tester();  						//Tester object Intialized
   System.out.println("<----------Employee Relation using Inheritance----------> ");    
   System.out.println("Programmer salary is:"+p.salary1+" Rs");  								//Class Call using object
   System.out.println("A Programmer is an Developer\nBonus Amount for Programmer:"+p.bonus1+" Rs");
   System.out.println("\nNetwork Engineer salary is:"+t.salary2+" Rs");  				//Class Call using object
   System.out.println("A Tester is an Network Engineer\nBonus Amount for Programmer:"+t.bonus2+" Rs");   
}  
}

class Developer					//Class Developer Intialized
{  
 	float salary1=40000;  
}  
class Programmer extends Developer{  		//Extended Programmer Class using Inhertiance
 	int bonus1=10000;  
}

class Network 				//Class Developer Intialized
{  
 	float salary2=30000;  
}  
class Tester extends Network{  			//Extended Tester Class using Inhertiance
 	int bonus2=5000;  
}