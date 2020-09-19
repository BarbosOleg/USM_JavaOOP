import java.util.Scanner;

public class ParkingCharges {
	private static final double baseFee = 2.0;
	private static final double hourFee = 0.5;
	private static final double maxFee = 10.0;
	private static double totalFee = 0.0;
	
	public static double calculateCharges(int hours) {
		if(hours > 0 && hours <= 3) {
			totalFee = getTotalFee() + baseFee;
			return baseFee;
		}else if (hours > 3 && hours <= 24) {
			double curentFee = baseFee + hourFee * (hours - 3);
			totalFee = getTotalFee() + Math.min(curentFee, maxFee);
			return Math.min(curentFee, maxFee);
		}else if(hours > 24) {
			System.out.print("No car parks for longer than 24 hours");
		}
		return 0;
	}
	public static double getTotalFee() {return totalFee;}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours = 0;
		do {
			System.out.print("Get parking hours (0 - for EXIT): ");
			hours = input.nextInt();
			System.out.printf("Charges: $%.2f%n", calculateCharges(hours));
		} while (hours != 0);
		System.out.printf("Total charges: $%.2f", totalFee);
	}
}
