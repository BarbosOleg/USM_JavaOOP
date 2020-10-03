public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount saving1 = new SavingsAccount(4, 2000);
		SavingsAccount saving2 = new SavingsAccount(4, 3000);
		
		System.out.printf("New balance for saving1: $%.2f%n", saving1.calculateMonthlyInterest());
		System.out.printf("New balance for saving2: $%.2f%n", saving2.calculateMonthlyInterest());
		
		SavingsAccount.modifyInterestRate(5.0);
		
		System.out.printf("New balance for saving1 with new interest rate: $%.2f%n", saving1.calculateMonthlyInterest());
		System.out.printf("New balance for saving2 with new interest rate: $%.2f%n", saving2.calculateMonthlyInterest());
	}

}
