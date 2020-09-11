import java.util.Scanner;

public class InvoiceTest {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceClass invoice1 = new InvoiceClass("201", "RAM 4GB", 3, 700.00);
		InvoiceClass invoice2 = new InvoiceClass("493", "GTX 1050Ti", 5, 2499.99);
		int quantity;
		double price;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Invoice amount for invoice1 => %.2f %n",invoice1.getInvoiceAmount());
		System.out.printf("Invoice amount for invoice2 => %.2f %n",invoice2.getInvoiceAmount());
		
		System.out.print("Enter quantity for invoice1: ");
		quantity = input.nextInt();
		System.out.print("Enter item price for invoice1:");
		price = input.nextDouble();
		
		invoice1.setQuantity(quantity);
		invoice1.setPricePerItem(price);
		
		System.out.print("Enter quantity for invoice2: ");
		quantity = input.nextInt();
		System.out.print("Enter item price for invoice2:");
		price = input.nextDouble();
		
		invoice2.setQuantity(quantity);
		invoice2.setPricePerItem(price);
		
		System.out.printf("Invoice amount for invoice1 => %.2f %n",invoice1.getInvoiceAmount());
		System.out.printf("Invoice amount for invoice2 => %.2f %n",invoice2.getInvoiceAmount());
	
	}

}
