import java.util.Scanner;

public class GasMileage {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int miles, gallons, trips = 0, tripsCount = 0;
		
		while(trips != -1)
		{
			System.out.print("Enter trip nr. or -1 to EXIT :");
			trips = input.nextInt();
			
			System.out.print("Get driven miles: ");
			miles = input.nextInt();
			System.out.print("Get used gallons");
			gallons = input.nextInt();
			
			tripsCount++;
		}
		
		
		
	}

}
