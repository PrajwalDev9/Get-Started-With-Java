class Employee
    {  
    void relation()
        {
            System.out.println("Relation Using Inheritance\n");
        }  
    }  
class Programmer extends Employee
{  
    void developer()
    {
        System.out.println("A Programmer is an Developer\n");
    }  
}  
class Tester extends Programmer
{  
    void engineer()
    {
        System.out.println("A Network Engineer is an Tester\n");
    }  
}  
class Relation
{  
    public static void main(String args[])
    {  
      
        t.Tester();  
        t.developer();  
        t.Programmer();  
    }
}  