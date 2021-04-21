// Jonathan Su, Feb. 2021

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to output a combination of coins that equals that amount.");

    Scanner scanner = new Scanner(System.in);
    int originalAmount, newAmount, quarters, dimes, nickels, pennies;
    originalAmount = scanner.nextInt();
    newAmount = originalAmount;
    quarters = newAmount / 25;
    newAmount = newAmount % 25;
    dimes = newAmount / 10;
    newAmount = newAmount % 10;
    nickels = newAmount / 5;
    newAmount = newAmount % 5;
    pennies = newAmount;

    System.out.println("\n" + originalAmount + " cent(s) can be given as: ");
    System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies ");
  }
}