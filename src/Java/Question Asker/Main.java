import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    try {
      File inputFile = new File("Questions.txt");
      File outputFile = new File("Output.txt");
      PrintWriter pw = new PrintWriter(new FileWriter(outputFile, true));
      Scanner fileScanner = new Scanner(inputFile);
      Scanner inputScanner = new Scanner(System.in);
      Random random = new Random();
      ArrayList < String > questions = new ArrayList < String > ();
      boolean run = true;

      while (fileScanner.hasNextLine()) {
        String next = fileScanner.nextLine();
        questions.add(next);
      }

      System.out.println("Open-ended questions attempt to make the person who is answering the question give a more detailed and elaborate response. While almost any question can be answered in a few words, if you try hard enough, a good open-ended question tries to get around this.\n");
      do {
        int questionNumber = random.nextInt(questions.size() + 1);
        System.out.println(questions.get(questionNumber));
        String answer = inputScanner.nextLine();
        pw.println(questions.get(questionNumber));
        pw.println(answer + "\n");
        System.out.println("\nDo you want another question? Type 'y' for yes and 'n' for no.");
        String again = inputScanner.nextLine();
        System.out.println("");
        if (again.equals("y")) {
          run = true;
        } else if (again.equals("n")) {
          System.out.println("Saving your responses...done.");
          run = false;
          pw.close();
          fileScanner.close();
        }
      } while (run);
    } catch (IOException e) {
      System.out.println("An error has occured.");
    }
  }
}