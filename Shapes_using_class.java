import java.util.Scanner;				//importing Scanner utility 
class AreaOfRectangle {					//Public class declared
   public static void main (String[] args)
   {
   		int ch;										//variable declaration
	   Scanner scanner = new Scanner(System.in);			//Scanner Object Intialized
	   do
	   {
	   System.out.println("Enter your Choice:1.Area of Circle\n2.Area of Square\n3.Area of Triangle\n4.Area of Rectangle\n5.Exit");
	   ch=scanner.nextInt();			//Taking Input
	   switch(ch)							//Switch case statement
	   {
	   case 1:														//Calculate Area of Circle
	   {	
	   	System.out.println("Enter the Radius of Circle:");
	   	double r=scanner.nextDouble();							//Taking Input
	   	System.out.println("Area of Circle is:"+3.142*r*r+"sq units");
	   }
	   break;
	   case 2:														//Calculate Area of Square
	   {
	   	System.out.println("Enter the Side of Square:");
	   	double y=scanner.nextDouble();								//Taking Input
	   	System.out.println("Area of Square is:"+y*y+"sq units");
	   }
	   break;
	   case 3:													//Calculate Area of Triangle
	   {
	   System.out.println("Enter the Base of Triangle:");
	   double base = scanner.nextDouble();										//Taking Input
	   System.out.println("Enter the Height of Triangle:");
	   double height = scanner.nextDouble();								//Taking Input
	   //Area = 0.5*length*width;
	   System.out.println("Area of Triangle is:"+0.5*base*height+" sq units");	   	
	   }
	   break;
	   case 4:													//Calculate Area of Rectangle
	   {
	   System.out.println("Enter the length of Rectangle:");
	   double length = scanner.nextDouble();									//Taking Input
	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();										//Taking Input
	   //Area = length*width;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
   	   }
   	   break;
   	   case 5:								//Exit Statement
   	   break;
   	   }
   	  }while(ch!=5);    	
   }
}
