package assessment1package;

public class Account {
	public enum AccTy {
		SAVINGS,CURRENT;
	}
	Integer accno;
	String custname;
	AccTy  acctype;
	float balance;
	Account(Integer accno,String custname,AccTy  acctype,float balance)
	{
		this.accno= accno;
		this.custname= custname;
		this.acctype=  acctype;
		this.balance= balance;
	}
	

}
