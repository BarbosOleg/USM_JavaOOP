import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numb1;
        int numb2;
        int numb3;
        int sum;
        float med;
        int prod;

        System.out.print("Introduceti primul numar: ");
        numb1 = input.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        numb2 = input.nextInt();

        System.out.print("Introduceti al treilea numar: ");
        numb3 = input.nextInt();

        sum = numb1 + numb2 + numb3;
        med = (float)sum/3;
        prod = numb1 * numb2 * numb3;

        System.out.printf("Suma -> %d%n",sum);

        System.out.printf("Produsl -> %d%n",prod);

        System.out.printf("Media -> %.2f%n",med);

        if(numb1 >= numb2 && numb1 >= numb3) 
            System.out.printf("%d is larger %n",numb1);
        else if(numb2 >= numb1 && numb2 >= numb3)
            System.out.printf("%d is larger %n",numb2);
        else if(numb3 >= numb1 && numb3 >= numb2)
            System.out.printf("%d is larger %n",numb3);

        if(numb1 <= numb2 && numb1 <= numb3)
            System.out.printf("%d is smallest %n",numb1);
        else if(numb2 <= numb1 && numb2 <= numb3)
            System.out.printf("%d is smallest %n",numb2);
        else if(numb3 <= numb2 && numb3 <= numb1)
            System.out.printf("%d is smallest %n",numb3);
    }
}
