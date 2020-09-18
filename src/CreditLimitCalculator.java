
public class CreditLimitCalculator 
{
	private static int accountNumber = 0;
	private int beginningBalance;
	private int totalItemsCharged;
	private int totalCredits;
	private int creditLimit;
	
	public CreditLimitCalculator(int startMonthBalance, int totalItemsCharged, int totalCredits, int creditLimit) 
	{
		accountNumber++;
		setStartMonthBalance(startMonthBalance);
		setTotalItemsCharged(totalItemsCharged);
		setTotalCredits(totalCredits);
		setCreditLimit(creditLimit);
	}
	
	public static int getAccountNumber() 
	{
		return accountNumber;
	}
	public int getStartMonthBalance() 
	{
		return beginningBalance;
	}
	public void setStartMonthBalance(int startMonthBalance) 
	{
		if (startMonthBalance > 0.0) 
		{
			this.beginningBalance = startMonthBalance;
		}else
		{
			this.beginningBalance = 0;
		}
	}
	public int getTotalItemsCharged() 
	{
		return totalItemsCharged;
	}
	public void setTotalItemsCharged(int totalItemsCharged) 
	{
		if (totalItemsCharged > 0) 
		{
			this.totalItemsCharged = totalItemsCharged;
		}else
		{
			this.totalItemsCharged = 0;
		}
	}
	public int getTotalCredits() 
	{
		return totalCredits;
	}
	public void setTotalCredits(int totalCredits) 
	{
		if(totalCredits > 0)
		{
			this.totalCredits = totalCredits;		
		}else 
		{
			this.totalCredits = 0;
		}
	}
	public int getCreditLimit() 
	{
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) 
	{	
		if (creditLimit > 0) 
		{
			this.creditLimit = creditLimit;	
		}else
		{
			this.creditLimit = 0;
		}
	}

	public int newBalance()
	{
		int NewBalance = beginningBalance + totalItemsCharged - totalCredits;
		return (NewBalance > 0) ? NewBalance : 0;
	}
	public boolean limitExceeded()
	{
		return (newBalance() > creditLimit) ? false : true;
	}
	
}
