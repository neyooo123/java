//google

/*Define a class CricketPlayer(name,no_of_innings, no_of_times_notout, totatruns, bat_avg). Create an array of n player objects .Calculate the batting average for each player using static method avg(). Define a static sort method which sorts the array on the basis of average. Display the player details in sorted order.
*/

import java.io.*;
class Cricket
{
	String name;
	int inning,tofnotcot,totalruns;
	float batavg;
	public Cricket()
	{
		/*name=null;
		inning=0;
		tofnotcot=0;
		totalruns=0;
		batavg=0;*/
	}
	public void get()throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name,no of innings,no of times not out,total runs:");
		name=br.readLine();
		inning=Integer.parseInt(br.readLine());
		tofnotcot=Integer.parseInt(br.readLine());
		totalruns=Integer.parseInt(br.readLine());
	}
	public void put()throws IOException
	{
		System.out.println("Name "+name);
		System.out.println("No of innings "+inning);
		System.out.println("No times notout "+tofnotcot);
		System.out.println("Total runs"+totalruns);
		System.out.println("bat avg "+batavg);
	}
	static void avg(int n,Cricket c[])
	{
		try
		{
			for(int i=0;i<n;i++)
			{	
				c[i].batavg=c[i].totalruns/c[i].inning;
			}
		}catch(ArithmeticException e)
		{
			System.out.println("Invalid arg");
		}
	}
	static void sort(int n,Cricket c[])
	{
		String temp1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(c[i].batavg<c[j].batavg)
				{
					temp1=c[i].name;
					c[i].name=c[j].name;
					c[j].name=temp1;
					
					
				}
			}
		}
	}
}
public class cricketplayer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the limit:");
		int n=Integer.parseInt(br.readLine());
		Cricket c[]=new Cricket[n];
		for(int i=0;i<n;i++)
		{
			c[i]=new Cricket();
			c[i].get();
		}
		Cricket.avg(n,c);
		Cricket.sort(n,c);
		for(int i=0;i<n;i++)
		{
			c[i].put();
		}
       }
}