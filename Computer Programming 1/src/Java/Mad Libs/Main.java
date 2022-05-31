// Jonathan Su, Mar. 2021

import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scannerA = new Scanner(System.in);
    System.out.println("Jonathan Su, Mar. 2021\n»»»»»»»»»»»»»»»»»»»»»»");
    System.out.println("___  ___          _ _     _ _         ");
    System.out.println("|  \\/  |         | | |   (_) |        ");
    System.out.println("| .  . | __ _  __| | |    _| |__  ___ ");
    System.out.println("| |\\/| |/ _` |/ _` | |   | | '_ \\/ __|");
    System.out.println("| |  | | (_| | (_| | |___| | |_) \\__ \\");
    System.out.println("\\_|  |_/\\__,_|\\__,_\\_____/_|_.__/|___/");
    System.out.println("");
    System.out.println("Which mad-lib would you like to do? Enter \'A' or \'B'.");
    char whichOne = scannerA.next().charAt(0);

    switch (whichOne) {
    case 'A':
      Scanner scanner = new Scanner(System.in);
      ArrayList list = new ArrayList();

      System.out.println("\nType a word and press enter with each prompt:");
      System.out.print("A holiday: ");
      list.add(scanner.nextLine());
      System.out.print("A plant or vegetable (capitalize first letter): ");
      list.add(scanner.nextLine());
      System.out.print("A verb: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.print("A verb: ");
      list.add(scanner.nextLine());
      System.out.print("A plural noun: ");
      list.add(scanner.nextLine());
      System.out.print("A plural noun: ");
      list.add(scanner.nextLine());
      System.out.print("A body part: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.print("A plural noun: ");
      list.add(scanner.nextLine());
      System.out.print("A politician: ");
      list.add(scanner.nextLine());
      System.out.print("A color: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.print("A body part: ");
      list.add(scanner.nextLine());
      System.out.print("A plural noun: ");
      list.add(scanner.nextLine());
      System.out.print("A noun: ");
      list.add(scanner.nextLine());
      System.out.print("An exclamation or swear (capitalize first letter): ");
      list.add(scanner.nextLine());
      System.out.print("A noun: ");
      list.add(scanner.nextLine());
      System.out.print("A celebrity: ");
      list.add(scanner.nextLine());
      System.out.print("A plural noun: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.print("A mode of transportation: ");
      list.add(scanner.nextLine());
      System.out.print("A noun: ");
      list.add(scanner.nextLine());
      System.out.print("A 3-digit number: ");
      list.add(scanner.nextLine());
      System.out.print("A verb: ");
      list.add(scanner.nextLine());
      System.out.print("A liquid: ");
      list.add(scanner.nextLine());
      System.out.print("A food: ");
      list.add(scanner.nextLine());
      System.out.print("A verb: ");
      list.add(scanner.nextLine());
      System.out.print("A country: ");
      list.add(scanner.nextLine());
      System.out.print("A noun: ");
      list.add(scanner.nextLine());
      System.out.print("A liquid: ");
      list.add(scanner.nextLine());
      System.out.print("A number: ");
      list.add(scanner.nextLine());
      System.out.print("An adjective: ");
      list.add(scanner.nextLine());
      System.out.println(list + " " + list.size() + "\n");

      System.out.println("Bad Customer Service");
      System.out.println("~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Customer service: Happy " + list.get(0) + ", this is " + list.get(1) + "ville Water and Sewer, may I " + list.get(2) + " you?");
      System.out.println("Caller: Yes, I am " + list.get(3) + "! My tap water looks " + list.get(4) + " and smells " + list.get(5) + "!");
      System.out.println("Customer service: Relax, don't " + list.get(6) + ", this is a harmless condition caused by " + list.get(7) + " entering the pipes.");
      System.out.println("Caller: But my kids are all sick in bed with " + list.get(8) + " on their " + list.get(9) + "!");
      System.out.println("Customer service: Well that's not caused by the water, that's caused by " + list.get(10) + " parenting, substandard " + list.get(11) + " in our schools, and " + list.get(12) + "\'s policies.");
      System.out.println("Caller: Well, when I took a shower this morning, my hair turned " + list.get(13) + " and " + list.get(14) + " bumps began appearing on my " + list.get(15) + ".");
      System.out.println("Customer service: Have you tried flushing your " + list.get(16) + "?");
      System.out.println("Caller: I need help! Now when I look down the drain, I see a " + list.get(17) + "!");
      System.out.println("Customer service: " + list.get(18) + "! We'd better send out our " + list.get(19) + " technician to check that out. " + list.get(20) + " is our best troubleshooter, and they're in the field right now testing the " + list.get(21) + ".");
      System.out.println("Customer service: Tell them to look for a house with a " + list.get(22) + " front door and a " + list.get(23) + " in the driveway.");
      System.out.println("Customer service: You'll also need to talk directly to our " + list.get(24) + " department at " + list.get(25) + ". \nCustomer service: In the meantime, don't " + list.get(26) + " any of your water taps and treat the skin irritation with a salve of " + list.get(27) + " and " + list.get(28) + ". \nCustomer Service: You can also use an over-the-counter remedy called " + list.get(29) + " but don't use " + list.get(30) + "\'s brand. Also, be sure to boil your " + list.get(31) + " and drink only bottled " + list.get(32) + ".");
      System.out.println("Caller: How long will this take?");
      System.out.println("Customer service: About " + list.get(33) + " hours. Have a " + list.get(34) + " day!");
      break;
    case 'B':
      System.out.println("\nThere is nothing here yet!");
      break;
    }
  }
}