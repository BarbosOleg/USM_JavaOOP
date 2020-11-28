import java.util.Scanner;

public class WordsRevers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a sentence:");
        String[] tokens = scanner.nextLine().split(" ");
        int tokensLen = tokens.length;

        for (int i = tokensLen - 1; i >= 0; i--){
            System.out.print(tokens[i] + " ");

        }
    }
}
