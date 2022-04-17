public class Details{								//Declare Public class
	public static void main (String[] args)
	{
		Student students[]=new Student[5];			//Array of Objects declared

		students[0]=new Student();					//Student 1 array intialized
		students[0].name="Akash";
		students[0].rollno=1;
		students[0].marks=90;

		students[1]=new Student();					//Student 2 array intialized
		students[1].name="Sanjay";
		students[1].rollno=2;
		students[1].marks=88;

		students[2]=new Student();						//Student 3 array intialized
		students[2].name="Sujit";
		students[2].rollno=3;
		students[2].marks=85;

		students[3]=new Student();						//Student 4 array intialized
		students[3].name="Prakash";
		students[3].rollno=4;
		students[3].marks=89;

		students[4]=new Student();					//Student 5 array intialized
		students[4].name="Kunal";
		students[4].rollno=5;
		students[4].marks=87;

		for(int i=0;i<students.length;i++)			//For loop intialzed
		{
			System.out.println(students[i].name+" has Roll No:"+students[i].rollno+" got "+students[i].marks+" marks");	//Display output
		}
	}
}
class Student{			//Student Class
	String name;			//Variable Declaration
	int marks,rollno;
}