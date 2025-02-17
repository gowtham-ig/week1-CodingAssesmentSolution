package assessment1package;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
	List<Account> lis1=new ArrayList<>();

	public boolean isValidAccount(int acNumber) throws except
	{
		if(acNumber==0||acNumber<0)
		{
			throw new except("enter correct account number");
		}
		for(int i=0;i<lis1.size();i++)
		{
			if(lis1.get(i).accno==acNumber)
			{
				System.out.println("account is found");
				return true;
			}
				
		}
		throw new except("account number is invalid");
		
		
	}

	public void deposit(float amt,int accnum) throws except
	{
		boolean found=false;
		for(Account a:lis1)
		{
			if(a.accno==accnum)
			{
				found=true;
				a.balance+=amt;
				System.out.println("sucessfullt deposited");
				break;
				
			}
			
			
		}
		if(!found)
		{
			throw new except("enter correct account number");
		}
		
		
		
	}

	public void withdraw(float amt,int accnum) throws except
	{
		boolean something=false;
		for(Account a:lis1)
		{
			if(a.accno==accnum)
			{
				a.balance-=amt;
				if(a.balance<0)
				{
					a.balance+=amt;
					throw new except("Insuffient funds");
				}
				else
				{ something=true;
					System.out.println("Succesfully withdrawn");
					break;
				}
			}
			
			
		}
		if(!something)
		{
			throw new except("No such account number is found");
		}
	
		
	}

	public float getBalance(int accnum) throws except
	{
		
		for(Account a:lis1)
		{
			if(a.accno==accnum)
			{
				return a.balance;
			}
			
		}
		throw new except("No such account is present");
		
	}

}
