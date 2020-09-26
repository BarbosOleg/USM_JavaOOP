import java.util.Scanner;

public class TestRectangleClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RectangleClass rec1 = new RectangleClass(2, 5);
		RectangleClass rec2 = new RectangleClass(3.2, 9.5);
		RectangleClass rec3 = new RectangleClass(2.23, 50);
		RectangleClass rec4 = new RectangleClass(-5, 50);
		
		System.out.printf("Perimeter for first rectangle: %.2f%n",rec1.PerimeterCalculator());
		System.out.printf("Area for first rectangle: %.2f%n%n",rec1.AreaCalculator());
		
		System.out.printf("Perimeter for second rectangle: %.2f%n",rec2.PerimeterCalculator());
		System.out.printf("Area for second rectangle: %.2f%n%n",rec2.AreaCalculator());
		
		System.out.printf("Perimeter for third rectangle: %.2f%n",rec3.PerimeterCalculator());
		System.out.printf("Area for third rectangle: %.2f%n%n",rec3.AreaCalculator());
		
		System.out.printf("Perimeter for fourth rectangle: %.2f%n",rec4.PerimeterCalculator());
		System.out.printf("Area for fourth rectangle: %.2f%n%n",rec4.AreaCalculator());
		
	}

}
