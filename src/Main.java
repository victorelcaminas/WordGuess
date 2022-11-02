import java.util.Scanner;

public class Main {

    public static final int MAX_SHOTS = 10;
    public static void main(String[] args) {
        int countShoots = 0;
        System.out.println("You have " + MAX_SHOTS + " shots");
        MagicWord m = new MagicWord();
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        while (!gameOver) {
            System.out.println("Enter letter or word");
            String s = input.next();
            countShoots ++;
            m.shootLetterOrWord(s);
            System.out.println("Num shots:" + countShoots);
            System.out.println(m);
            if (m.wins()) {
                System.out.println("You Win");
                gameOver = true;
            }
        }

    }
}
