public class compare{							
	public static void main (String[] args){
		String no1="Mahatma Gandhi";
		String no2="Elon Musk";
		String no3="mahatma gandhi";

		boolean value1= no1.equalsIgnoreCase(no2);
		boolean value2=no1.equalsIgnoreCase(no3);

		System.out.println(no1+" and "+no2+" are equal?"+value1);
		System.out.println(no1+" and "+no3+" are equal?"+value2);
	}
}