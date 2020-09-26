
public class SavingsAccount {
	private static double InterestRate;
	private double SavingBalance;
	
	public static double getInterestRate() {
		return InterestRate;
	}
	public static void modifyInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	
	public double getSavingBalance() {
		return SavingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		SavingBalance = savingBalance;
	}
	public double calculateMonthlyInterest() {
		double tmpBalance;
		tmpBalance = this.SavingBalance * SavingsAccount.InterestRate / 12;
		this.SavingBalance += tmpBalance;
		return this.SavingBalance;
	}
}
