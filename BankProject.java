import java.util.Scanner;

public class BankProject
{
	public String name ;
	public int accno ;
	public double bal ;
	public BankProject() {}
	static Scanner sc = new Scanner(System.in);
	static BankProject data[] = new BankProject[0];
	public BankProject (String name, int accno, double bal)
	{
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}
	public void print()
	{
		for (int i = 0; i < data.length; i++) 
		{
			System.out.println("----------Details----------");
			System.out.println("Name : "+data[i].name);
			System.out.println("Accno : "+data[i].accno);
			System.out.println("Bal : "+data[i].bal);
			System.out.println("---------------------------");
		}
	}
	public void create()
	{
		BankProject temp[] = new BankProject[data.length+1];
		for (int i = 0; i < data.length; i++)
		{
			temp[i] = data[i];
		}
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter Accno: ");
		int accno = sc.nextInt();
		System.out.println("Enter the balance: ");
		double bal = sc.nextDouble();
		temp[data.length] = new BankProject(name, accno, bal);
		data = temp;
		System.out.println("-----------Account Created-----------");
	}
	public void search(String name)
	{
		name = name.toLowerCase();
		BankProject b1 = null;
		boolean status = false;
		for (int i = 0; i < data.length; i++) 
		{
			if (data[i].name.equals(name))
			{
				b1 = data[i];
				status = true;
			}
			if (status)
			{
				System.out.println("Account is found...!!!");
				String x = sc.next();
				x = x.toLowerCase();
				if (x.equals("yes"))
				{
					System.out.println("-----------Account Details----------");
					System.out.println("Name: "+b1.name);
					System.out.println("Accno: "+b1.accno);
					System.out.println("Bal: "+b1.bal);
				}
				else
				{
					System.out.println("Thank you for fetching your data..!!");
				}
			}
			else
			{
				System.out.println("Account not found");
			}
		}
	}
}
