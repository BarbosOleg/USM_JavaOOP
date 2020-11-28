import java.util.Random;

public class RandomSentences {

    public static void main(String[] args) {

        final String[] article = new String[]{"the", "a", "one", "some", "any"};
        final String[] noun = new String[]{"boy", "girl", "dog", "town", "car"};
        final String[] verb = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        final String[] preposition = new String[]{"to", "from", "over", "under", "on"};

        final Random rand = new Random();

        for (int i = 0; i < 20; i++){
            int tmpRandom = rand.nextInt(5);
            String finalStr = Character.toUpperCase(article[tmpRandom].charAt(0)) + article[tmpRandom].substring(1);
            tmpRandom = rand.nextInt(5);
            finalStr += " " + verb[tmpRandom];
            tmpRandom = rand.nextInt(5);
            finalStr += " " + preposition[tmpRandom];
            tmpRandom = rand.nextInt(5);
            finalStr += " " + article[tmpRandom];
            tmpRandom = rand.nextInt(5);
            finalStr += " " + noun[tmpRandom] + ".";
            System.out.print(finalStr + "\n");
        }
    }

}
