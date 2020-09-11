
public class ModifiedAccountClass 
{
	private String name;
	private double balance;
	
	public ModifiedAccountClass(String name, double balance) 
	{
		setName(name);
		if(balance > 0.0) 
		{
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
		{
			balance += depositAmount;
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public double withdraw(double withdrawAmount)
	{
		if(balance > 0.0 && balance > withdrawAmount)
		{
			balance -= withdrawAmount;
		}else
		{
			System.out.println("Withdrawal amount exceeded account balance!!!");
		}
		return balance;
	}
}
