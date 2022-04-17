public class Call		//Declaring Public Class	
{
	public static void main(String[] args)
	{
		Car Ford = new Car();		//Car Object Intialized
		String brand = Ford.getBrand();	// Object Called getBrand
		System.out.println(brand);		//Display Output
	}
}
class Car 									//Declaring Student Class
{	
	String brand;			//Variable Declaration
	public Car()			//Car Constructor decalred
	{
		this.brand="Ford";
	}
	public String getBrand()		//getBrand Constructor declared
	{
		return brand;			//return string 
	}
}