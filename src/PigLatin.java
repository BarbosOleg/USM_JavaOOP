import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an sentence:");
        String[] tokens = scanner.nextLine().split(" ");

        for (String token : tokens) {
            printLatinWord(token);

        }
    }

    public static void printLatinWord(String tmpString) {
        String pigLatin = tmpString.substring(1);
        pigLatin += Character.toLowerCase(tmpString.charAt(0)) + "ay ";
        System.out.print(pigLatin);
    }
}
