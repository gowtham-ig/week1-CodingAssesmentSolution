package assessment1package;
import java.util.Scanner;

public class Accounttest {
	public static void main(String args []) throws except
	{
		Account a1=new Account(101,"gowtham",Account.AccTy.SAVINGS,200.43f);
		Account a2=new Account(102,"mahesh",Account.AccTy.SAVINGS,260.73f);
		Account a3=new Account(104,"babu",Account.AccTy.CURRENT,2563.435f);
		Account a4=new Account(105,"pavan",Account.AccTy.SAVINGS,163.48f);
		Account a5=new Account(107,"rakesh",Account.AccTy.CURRENT,767.73f);
		AccountService ac=new AccountService();
		ac.lis1.add(a5);
		ac.lis1.add(a4);
		ac.lis1.add(a3);
		ac.lis1.add(a2);
		ac.lis1.add(a1);
		Scanner sc=new Scanner(System.in);
		boolean something=true;
		while(something)
		{
			System.out.println("choose an option:");
			System.out.println("1.Validate Account");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Get Balance");
			System.out.println("5.exit");
			int responce=sc.nextInt();
			int acc=0;
			float amt=0;
			switch(responce)
			{
			case 1:
				System.out.println("enter account number:");
				acc=sc.nextInt();
				ac.isValidAccount(acc);
				break;
			case 2:
				System.out.println("enter account number:");
				acc=sc.nextInt();
				System.out.println("enter the amount to deposit:");
				amt=sc.nextFloat();
				ac.deposit(amt, acc);
				break;
			case 3:
				System.out.println("enter account number:");
				acc=sc.nextInt();
				System.out.println("enter the amount to withdraw:");
				amt=sc.nextFloat();
				ac.withdraw(amt, acc);
				break;
			case 4:
				System.out.println("enter account number:");
				acc=sc.nextInt();
				System.out.println(ac.getBalance(acc));
				break;
			case 5:
				something=false;
				break;
			
				
			}
		}
//		ac.isValidAccount(101);
//		ac.deposit(1738.83f, 102);
//		System.out.println(ac.getBalance(104));
//		ac.withdraw(234, 104);
//		ac.isValidAccount(104);
//		ac.deposit(1738.83f, 102);
//		System.out.println(ac.getBalance(102));
//		ac.withdraw(100, 101);
//		System.out.println( ac.getBalance(101));
		
		
	}

}
