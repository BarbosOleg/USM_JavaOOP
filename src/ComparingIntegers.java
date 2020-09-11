import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

		  int numb1;
	      int numb2;

	      System.out.print("Introduceti primul numar: ");
	      numb1 = input.nextInt();
	      System.out.print("Introduceti al doilea numar: ");
	      numb2 = input.nextInt();

	      if(numb1 == numb2){
	    	  System.out.print("These numbers are equal");
	    	  
	      }else if (numb1 > numb2) {
	    	  System.out.printf("%d is larger %n",numb1);	    	  
	      }else {
	    	  System.out.printf("%d is larger %n",numb2);   	  
	      }
	}
}
