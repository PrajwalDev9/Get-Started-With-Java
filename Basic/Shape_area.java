import java.util.Scanner;
class AreaOfShapes{
   public static void main (String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Radius of Circle:");
       r=s.nextDouble();
       System.out.println("Enter the Side of Square:");
       a=s.nextDouble();
       System.out.println("Enter the Base & Height of Triangle:");
       x=s.nextDouble();
       y=s.nextDouble();
       System.out.println("Enter the Length & Width of Rectangle:");
       double p = s.nextDouble();
       double q = s.nextDouble();
       //Area = length*width;

       double area1 = 3.142*r*r;
       System.out.println("Area of Circle is:"+area1+"sq units");
       double area2 = a*a;
       System.out.println("Area of Square is:"+area2+"sq units");
       double area3 = 0.5*x*y;
       System.out.println("Area of Triangle is:"+area3+"sq units");      
       double area4 = p*q;
       System.out.println("Area of Rectangle is:"+area4+" sq units");
   }
}