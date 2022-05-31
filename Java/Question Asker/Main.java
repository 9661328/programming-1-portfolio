import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    try {
      File inputFile = new File("Questions.txt");
      File outputFile = new File("Output.txt");
      PrintWriter pw = new PrintWriter(new FileWriter(outputFile, true));
      ArrayList < String > questions = new ArrayList < String > ();
      Scanner fileScanner = new Scanner(inputFile);
      Scanner inputScanner = new Scanner(System.in);
      Random random = new Random();
      boolean run;
      int questionNumber;
      String answer, again;

      while (fileScanner.hasNextLine()) {
        questions.add(fileScanner.nextLine());
      }

      System.out.println("Open-ended questions attempt to make the person who is answering the question give a more detailed and elaborate response. While almost any question can be answered in a few words, if you try hard enough, a good open-ended question tries to get around this.\n");

      do {
        questionNumber = random.nextInt(questions.size());
        System.out.println(questions.get(questionNumber));
        answer = inputScanner.nextLine();
        pw.println(questions.get(questionNumber));
        pw.println(answer + "\n");
        System.out.println("\nDo you want another question? Type 'y' for yes and any other key for no.");
        again = inputScanner.nextLine();
        run = again.equals("y") || again.equals("Y") ? true : false;
        System.out.println("");
      } while (run);

      System.out.println("Saving your responses...done.");
      pw.println("~~~~~~~~~~~~~~~\n");
      pw.close();
      fileScanner.close();
      inputScanner.close();
    } catch (IOException e) {
      System.out.println("An error has occured.");
    }
  }
}