import java.util.Scanner;

public class BarChartPrint {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int array[] = new int[5];
		int maxAttempts = 5, iterator = 0, tmp;
		
		while(maxAttempts != 0) {
			System.out.print("Get number in range 1-30: ");
			tmp = input.nextInt();
			if (tmp >= 1 && tmp <= 30) {
				array[iterator] = tmp;
				++iterator;
				--maxAttempts;
			}else continue;
		}
//
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.printf("%n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.printf("%n");
		}
	}

}