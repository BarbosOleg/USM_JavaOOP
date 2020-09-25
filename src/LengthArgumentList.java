import java.util.Scanner;

public class LengthArgumentList {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%d%n", Product(2, 4, 3, 5));
		System.out.printf("%d%n", Product(2, 4, 3, 5, 3));
		System.out.printf("%d%n", Product(2, 4, 3, 5, 1, 1, 2));
	}
	public static int Product(int ... tmpArray) {
		int product = 1;
		for(int value: tmpArray) {
			product *= value;
		}
		return product;
	}
}
