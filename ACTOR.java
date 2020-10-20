import java.util.Scanner;
class Actor
{
	String id,name;
	int no_of_movies,no_of_years_exp;
	float average;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-----Enter Actor's Details----- ");
		System.out.println("Enter ID ");
		id=sc.nextLine();
		System.out.println("Enter Name ");
		name=sc.nextLine();
		System.out.println("Enter no of movies done by actor");
		no_of_movies=sc.nextInt();
		System.out.println("Enter no of years of experience");
		no_of_years_exp=sc.nextInt();
	}
	void cal()
	{
		average=(float)no_of_movies/(float)no_of_years_exp;
	}
	void display()
	{
		System.out.println("-----Actor's details----- ");
		System.out.println("Actor ID :"+id);
		System.out.println("Actor Name :"+name);
		System.out.println("No of movies done by actor :"+no_of_movies);
		System.out.println("No of years of experience of actor :"+no_of_years_exp);
		System.out.println("Average performance of actor :"+average);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of actors");
		int n=sc.nextInt();
		Actor []obj=new Actor[n];
		float highest=0.0f;
		String highest_actor="";
		for(int i=0;i<n;i++)
		{
			obj[i]=new Actor();
			obj[i].accept();
			obj[i].cal();

			if(obj[i].average>highest)
			{
				highest=obj[i].average;
				highest_actor=obj[i].name;
			}
		}
		for(int i=0;i<n;i++)
			obj[i].display();
		System.out.println();
		System.out.println("Actor with highest average performance : "+highest_actor);
		
	}
}
