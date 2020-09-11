import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args)
	{
		ModifiedAccountClass account1 = new ModifiedAccountClass("Jane Green", 60.21);
		ModifiedAccountClass account2 = new ModifiedAccountClass("John ", 120.03);
		double depositAmount;
		//display initial balance
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
	
		Scanner input = new Scanner(System.in);
		//add money to accounts
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n Adding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n Adding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		//display updated balance
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
		
		//withdraw money from accounts
		System.out.print("Enter withdraw amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n Extracting %.2f to account1 balance%n%n", depositAmount);
		account1.withdraw(depositAmount);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n Extracting %.2f to account2 balance%n%n", depositAmount);
		account2.withdraw(depositAmount);
		//display updated balance
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
		
	}//end main
}//end class AccountTest
