import java.util.Scanner;

public class GasMileage {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int miles, gallons, trips = 0, tripsCount = 0;
		double milePerGalon, totalMPG = 0;//mpg => miles driven gallons used
		
		while(trips != -1)
		{
			
			System.out.print("Get driven miles: ");
			miles = input.nextInt();
			System.out.print("Get used gallons: ");
			gallons = input.nextInt();
			
			milePerGalon = (double)miles / gallons;
			System.out.printf("Curent trip miles/gallon : %.3f%n", milePerGalon);
			
			totalMPG += milePerGalon;
			
			System.out.print("Enter trip nr. or -1 to EXIT : ");
			trips = input.nextInt();
			tripsCount++;
		}
		System.out.printf("Total trips nr. : %d%n", tripsCount);
		System.out.printf("Total miles/gallon : %.3f%n", totalMPG);
		
	}

}
