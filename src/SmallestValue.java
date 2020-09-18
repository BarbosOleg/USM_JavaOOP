import java.util.Random;
import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int max = 10;
		
		int array[], arrayLen;
		
		do {
			System.out.print("Set lenght of array: ");
			arrayLen = input.nextInt();
			
		} while (arrayLen < 2);
		array = new int[arrayLen];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + random.nextInt(max);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		int smallest = array[0];
		for (int i = 1; i < array.length; i++) {
			if(smallest > array[i]) {
				smallest = array[i];
			}
		}
		System.out.printf("%nSmallest value in array: %d%n", smallest);
	}

}
