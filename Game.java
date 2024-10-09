import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        int score = 0;
        int wordcount = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = scan.nextLine();

        while (score < 50) {
            System.out.println("Enter next word: ");
            String word2 = scan.nextLine();

            wordcount ++;

            if (word2.compareTo(word1) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphebetically after previous word; SCORE: " + score);
            }
            else if (word1.equals(word2)) {
                score -= 10;
                System.out.println("bruh; SCORE: " + score);
            }
            else {
                score -= 5;
                System.out.println("-5 points: current word alphebetically before previous word; SCORE: " + score);
            }

            if (word1.substring(word1.length() - 2, word1.length()).equals(word2.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 of current; SCORE: " + score);
            }

            int index = word2.indexOf(word1.substring(0, 1));
            
            if (index > -1) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }

            word1 = word2;
        }

        System.err.println("It took you " + wordcount + " words to beat the game!");
        scan.close();
    }
}
