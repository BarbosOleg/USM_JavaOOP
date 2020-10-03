
public class SavingsAccount {
	private static double InterestRate;
	private double SavingBalance;
	
	public SavingsAccount(double interestRate, double savingBalance){
		modifyInterestRate(interestRate);
		setSavingBalance(savingBalance);
	}
	
	public static double getInterestRate() {
		return InterestRate;
	}
	public static void modifyInterestRate(double interestRate) {
		if (interestRate > 0.0) {
			InterestRate = interestRate;
			
		}else InterestRate = 0.0;
	}
	
	public double getSavingBalance() {
		return SavingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		if (savingBalance > 0.0) {
			SavingBalance = savingBalance;
			
		}else SavingBalance = 0.0;
	}
	public double calculateMonthlyInterest() {
		double tmpBalance;
		tmpBalance = this.SavingBalance * SavingsAccount.InterestRate / 12;
		this.SavingBalance += tmpBalance;
		return this.SavingBalance;
	}
}
