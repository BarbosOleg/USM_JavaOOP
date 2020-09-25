import java.util.Scanner;

public class DuplicateElimination {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int counter = 5, tmp, iterator = 0;
		int[] tmpArray = new int[5];
		
		while(counter != 0) {
			System.out.print("Get a number: ");
			tmp = input.nextInt();
			if (tmp >= 10 && tmp <= 100) {
				if (IsDublicates(tmp, tmpArray)) continue;
				else {
					tmpArray[iterator++] = tmp;
					System.out.printf("%d%n",tmp);
					counter--;
				}
			}
		}
		System.out.printf("Array with unique number%n");
		for(int value: tmpArray) {
			System.out.printf("%3d ", value);
		}
	}
	
	public static boolean IsDublicates(int newVal, int[] tmpArray) {
		int dublicatesCounter = 0;
		for(int value : tmpArray) {
			if(newVal == value) dublicatesCounter++;
		}
		
		if (dublicatesCounter > 0) {
			return true;
		}else {
			return false;
		}
	}
}
