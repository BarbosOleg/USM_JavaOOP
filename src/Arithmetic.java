import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stubbb
		   Scanner input = new Scanner(System.in);
	        int num1;
	        int num2;
	        int sum;
	        int dif;
	        int prod;
	        double div;

	        System.out.print("Introduceti primul numar: ");
	        num1 = input.nextInt();

	        System.out.print("Introduceti al doilea numar: ");
	        num2 = input.nextInt();

	        sum = num1 + num2;
	        dif = num1 - num2;
	        prod = num1 * num2;
	        div = (float)num1 / num2;

	        System.out.printf("Suma -> %d%n",sum);

	        System.out.printf("Diferenta -> %d%n",dif);

	        System.out.printf("Produsl -> %d%n",prod);

	        System.out.printf("Impartiria -> %.2f%n",div);
	}

}
