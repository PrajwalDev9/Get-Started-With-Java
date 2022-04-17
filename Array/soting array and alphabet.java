import java.util.Arrays;			//Import Array class
public class Sort{					//Declare Public class
	public static void main (String[] args){
		int array_list[]={100,45,99,55,22,15,33};			//Array list of Numbers Declared
		String alp_list[]={"Data Structures","Algebra","Computer Graphics","Java","Prototype"};		//Array List of Strings Declared
		System.out.println("Unsorted Array List:"+Arrays.toString(array_list));
		Arrays.sort(array_list);															//Sorting Array List
		System.out.println("Sorted Array List:"+Arrays.toString(array_list));				//Print Output
		System.out.println("\nUnsorted Alphabetical List:"+Arrays.toString(alp_list));		
		Arrays.sort(alp_list);																//Sorting String List
		System.out.println("Sorted Alphabetical List:"+Arrays.toString(alp_list));			//Print Output
	}
}