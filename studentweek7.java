import java.util.*;
import java.util.List;
class student
{
	String usn,name;
	int sem;
	void input(String u,String n,int s)
	{
		usn=u;
		name=n;
		sem=s;
	}
}
class test extends student
{
	 int cie[],credits[];
	void get_cie(int n)
	{
		Scanner sc=new Scanner(System.in);
		 cie=new int[n];
		 credits=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter cie marks with credits");
			cie[i]=sc.nextInt();
			credits[i]=sc.nextInt();
		}
	}
}
class exam extends test
{
	int see[];
	void get_see(int n)
	{
		Scanner sc=new Scanner(System.in);
		 see=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter see marks");
			see[i]=sc.nextInt();
		}
	}
}
class result extends exam
{
	float sgpa;
	void cal(int n)
	{
		int sum=0,cred=0;
		int c;
		int tot;
		for(int i=0;i<n;i++)
		{
			tot=cie[i]+see[i]/2;
			if(tot>=90)			
            c=10;
            else if(tot>=80)
            c=9;
            else if(tot>=70)
            c=8;
            else if(tot>=60)
            c=7;
            else if(tot>=50)
            c=6;
            else if(tot>=40)
			c=4;
		    else
			c=0;
		    sum=sum+c*credits[i];
			cred=cred+credits[i];
		}
		sgpa=(float)sum/(float)cred;
	}
	void display()
	{
		System.out.printf("%22s %22s %22d %22f \n",usn,name,sem,sgpa);
	}
}
class sgpa_students
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=sc.nextInt();
		//student []st=new student[n];
		//test []t=new test[n];
		//exam []ex=new exam[n];
		result []res=new result[n];
		String u,nam;
		int s;
		for(int i=0;i<n;i++)
		{
			System.out.println(" -----enter details of student "+(i+1)+"-----");
			System.out.println("enter usn and name  ");
			u=sc.next();
			nam=sc.nextLine();
			System.out.println("enter sem ");
			s=sc.nextInt();
			System.out.println("enter no of courses");
			int nn=sc.nextInt();
			res[i]=new result();
			res[i].input(u,nam,s);
			res[i].get_cie(nn);
			res[i].get_see(nn);
			res[i].cal(nn);
		}
		System.out.println("\t\t\t-----student details-----");
		System.out.printf("%22s %22s %22s %22s \n","usn","name","sem","sgpa");

		for(int i=0;i<n;i++)
			res[i].display();
	}
}

