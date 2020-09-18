import java.util.Scanner;

public class CreditLimitTest {
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		CreditLimitCalculator test1 = new CreditLimitCalculator(100, 5, 20, 200);
		CreditLimitCalculator test2 = new CreditLimitCalculator(1000, 45, 320, 200);
		CreditLimitCalculator test3 = new CreditLimitCalculator(100, 5, 200, 20);
		
		System.out.printf("Account number for test1: %d%n", test1.getAccountNumber());
		System.out.printf("Account number for test2: %d%n", test2.getAccountNumber());
		System.out.printf("Account number for test3: %d%n", test3.getAccountNumber());
		
		System.out.printf("Account new balance for test1: %d%n", test1.newBalance());
		System.out.printf("Account new balance for test2: %d%n", test2.newBalance());
		System.out.printf("Account new balance for test3: %d%n", test3.newBalance());
		
		if(test1.limitExceeded()){System.out.println("Credit limit exceeded for test1");}
		if(test2.limitExceeded()){System.out.println("Credit limit exceeded for test2");}
		if(test3.limitExceeded()){System.out.println("Credit limit exceeded for test3");}
	}

}
