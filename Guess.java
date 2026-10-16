import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guesses = 10;
        int number = randomNumber();
        int gus = 0;
        System.out.println("Random Guessing game. Type Start to Start! ");
        String start = scanner.next();
        if (!start.equals("No")) {
            System.exit(1);
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print("You have " + guesses + " amount of guesses. What number do you choose? ");
            gus = scanner.nextInt();
            if (gus == number && i == 1) {
                System.out.println("You somehow hacked this game, and that is pathetic. :( You cheated but you technicly won.");
                System.exit(0);
            }
            else if (gus == number) {
                System.out.println("You won!");
                System.exit(0);
            }
            else if (gus > number) {
                System.out.println("Go lower");
            }
            else if (gus < number) {
                System.out.println("Go higher");
            }
            guesses--;
            }

        }
    

    public static int randomNumber() {
        return 1 + (int) (Math.random() * 1000);
    }
}
