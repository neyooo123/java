
/* define an abstract class staff with protected member id and name .define a parameterrized constructor.define
 one sub class office staff with memeber department create n object of office staff and display all details*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
abstract class Staff
{
	protected int id;
	protected String name;
	String department;
	abstract public void display();
}
class OfficeStaff extends Staff
{
	String department;
	public void accept()throws IOException
	{
		System.out.println("Enter the id ,name and departemnt:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		id=Integer.parseInt(br.readLine());
		name=br.readLine();
		department=br.readLine();
	}
	public void display()
	{
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Department "+department);
		System.out.println("----------------");
	}
}
public class staffdemo
{
	public static void main(String args[])throws IOException
	{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many staff:");
		int num=Integer.parseInt(br.readLine());
		OfficeStaff []stfobj=new OfficeStaff[num];

		for(i=0;i<num;i++)
		{
			stfobj[i]=new OfficeStaff();
			stfobj[i].accept();
		}
		System.out.println("----------------");
		System.out.println("Staff details are as:");
		for(i=0;i<num;i++)
		{
			stfobj[i].display();
		}
	}
}

