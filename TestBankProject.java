package programs;

import java.util.Scanner;

public class TestBankProject 
{
	public static void main(String[] args) 
	{
		BankProject b = new BankProject();
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter 1 for create account: ");
			System.out.println("Enter 2 for details: ");
			System.out.println("Enter 3 for search: ");
			int n = sc.nextInt();
			switch(n)
			{
			case 1: b.create();break;
			case 2: b.print();break;
			case 3: 
			{
				System.out.println("Enter name to search..!!");
				b.search(sc.next());
				break;
			}
			default: System.out.println("Invalid Input..!!");
			}
			System.out.println("Enter 1 for continue OR 2 for exit: ");
			int a = sc.nextInt();
			if (a==1)
			{
				continue;
			}
			else if (a==2)
			{
				System.out.println("Thank You...!!");
				break;
			}
			else
			{
				System.err.println("Invalid data...!!");
			}
		}
	}
}
