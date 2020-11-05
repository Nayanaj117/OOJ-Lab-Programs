import java.util.*;
import java.util.List;
class PLAYER
{
	String name;
	int matches_played;
	float average;
	void cal_average(String nam,int matches,int runs)
	{
		name=nam;
		matches_played=matches;
		average=(float)runs/(float)matches_played;
	}
}
class BATSMAN extends PLAYER
{
	int runs_scored;
	void batsman()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total runs scored by batsman");
		runs_scored=sc.nextInt();
	}
	void display1()
	{
		System.out.printf("%22s %22d %22d %22f \n",name,matches_played,runs_scored,average);
	}

	
}
class BOWLER extends PLAYER
{
	int runs_given;
	void bowler()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total runs given by bowler");
		runs_given=sc.nextInt();
	}
	void display2()
	{
		System.out.printf("%22s %22d %22d %22f \n",name,matches_played,runs_given,average);
	}
}
class general
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String nam;
		int matches;
		System.out.println("enter no of batsman");
		int m=sc.nextInt();
		BATSMAN []bm=new BATSMAN[m];
		System.out.println("enter no of bowlers");
		int n=sc.nextInt();
		BOWLER []bl=new BOWLER[n];
		for(int i=0;i<m;i++)
		{
			bm[i]=new BATSMAN();
			System.out.println("----enter details of batsman "+(i+1)+"----");
			bm[i].batsman();
			System.out.println("enter name of batsman and matches-played ");
			nam=sc.next();
			matches=sc.nextInt();
			bm[i].cal_average(nam,matches,bm[i].runs_scored);
		}
		for(int i=0;i<n;i++)
		{
			bl[i]=new BOWLER();
			System.out.println("----enter details of bowler "+(i+1)+"----");
			bl[i].bowler();
			System.out.println("enter name of bowler and matches-played ");
			nam=sc.next();
			matches=sc.nextInt();
			bl[i].cal_average(nam,matches,bl[i].runs_given);
		}
		System.out.println("\t\t\t-----batsman details-----");
		System.out.printf("%22s %22s %22s %22s\n","name","matches-played","runs scored","average");
		for(int i=0;i<m;i++)
			bm[i].display1();
		System.out.println("\t\t\t-----bowler details-----");
		System.out.printf("%22s %22s %22s %22s\n","name","matches-played","runs given","average");
		for(int i=0;i<n;i++)
			bl[i].display2();
	}
}
