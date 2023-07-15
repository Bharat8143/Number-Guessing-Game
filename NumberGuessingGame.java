import java.util.Scanner;
import java.util.Random;

class main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        int Start = 1;
        int End = 100;
        int rounds = 4;
        int Attempt = 7;
        int totalScore = 0;


        System.out.println("Welcome to Number Guessing Game!");
        System.out.println ("Guess a number between " + Start + " to " + End + "." );
        System.out.println("You have " + Attempt + " attempts to guess the number.");

        for (int r = 1; r <= rounds; r++) {
            int randNum = rand.nextInt(100);
            int a = 0;
            int roundScore = Attempt;

            System.out.println("****Round " + r + "****");

            while (a < Attempt) {
                System.out.print("Enter your guess (Attempt " + (a + 1) + "): ");
                int guess = reader.nextInt();
                reader.nextLine();
                a++;

                if (guess == randNum) {
                    System.out.println("Awesome ! You guessed the correct number in " + a + " attempts.");
                    break;

                } else if (guess < randNum) {
                    System.out.println("Your number is too low");
                } else {
                    System.out.println("Your number is too high");
                }
                roundScore--;
            }

            totalScore += roundScore;

            System.out.println("The number was = " + randNum);
            System.out.println("This Round Score =  " + roundScore);
            System.out.println("Total score =  " + totalScore);

            if (r < rounds) {
                System.out.print("Press enter to start the next round...");
                reader.nextLine();
            }
        }
        System.out.println("-----Game Over!-----");


        reader.close();
    }
}