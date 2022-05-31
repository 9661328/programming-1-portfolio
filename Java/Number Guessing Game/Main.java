// Jonathan Su, Feb 2021

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int secretNumber = 0;
    int guess = 0;
    int attempts = 1;
    char again = 'A';
    boolean play = false;

    do {
      attempts = 1;
      secretNumber = rand.nextInt(101);
      //System.out.println("\nRandom Integer: " + secretNumber);
      System.out.println("Welcome to the Number Guessing Game! Enter a number from 0-100:\n");
      guess = scanner.nextInt();
      System.out.println("Guess is: " + guess);
      while (guess != secretNumber) {
        if (guess < 0 || guess > 100) {
          System.out.println("Your guess must be between 0-100, try again.\n");
          guess = scanner.nextInt();
        } else if (secretNumber > guess) {
          System.out.println("Your guess was too low, try again.\n");
          guess = scanner.nextInt();
        } else if (secretNumber < guess) {
          System.out.println("Your guess was too high, try again.\n");
          guess = scanner.nextInt();
        }
        attempts++;
      }
      System.out.println("Hooray! You guessed the number in " + attempts + " attempt(s)!");
      System.out.println("Do you want to play again? Enter 'y' for yes and 'n' for no.\n");
      again = scanner.next().charAt(0);
      if (again == 'y' || again == 'Y') {
        play = true;
      } else if (again == 'n' || again == 'N') {
        play = false;
        System.out.println("\nGoodbye!");
      }
    } while (play);
  }
}