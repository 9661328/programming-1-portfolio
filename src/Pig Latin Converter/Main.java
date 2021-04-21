// Jonathan Su, Feb. 2021

import java.util.Scanner;
import java.io.*;

class Main {
  static void pigMethod() {
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine().toLowerCase().replaceAll(",", " , ").replaceAll("\\.", " \\.").replaceAll("!", " !").replaceAll("\\?", " \\?").replaceAll("-", " - ").replaceAll(":", " :").replaceAll(";", " ;").replaceAll("\\s{2,}", " ").replaceAll("\"", "");
    String consonantEnd = "ay";
    String vowelEnd = "yay";
    int charCount = 0;
    int spaceCount = 0;
    int allChars = 0;

    try {
      File file = new File("Output.txt");
      if (!file.exists()) {
        file.createNewFile();
      }
      PrintWriter pw = new PrintWriter(new FileWriter(file, true));

      if (userInput.equals("#esc")) {
        System.out.println("...\nProgram terminated!");
        System.exit(0);
      } else {
        System.out.println("\nOriginal text:\n" + userInput);
        pw.println("Original text:\n" + userInput);
        System.out.println("\nTranslated text:");
        pw.println("\nTranslated text:");
      }

      for (String eachWord: userInput.split(" ")) {
        char firstLetter = eachWord.charAt(0);
        boolean isNumber = Character.isDigit(eachWord.charAt(0));
        int firstVowelPos = -1;
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
          System.out.print(eachWord + vowelEnd + " ");
          pw.print(eachWord + vowelEnd + " ");
          charCount += eachWord.length() + vowelEnd.length();
          spaceCount++;
        } else if (isNumber == true) {
          System.out.print(eachWord + " ");
          pw.print(eachWord + " ");
          charCount += eachWord.length();
          spaceCount++;
        } else if (firstLetter == ',') {
          System.out.print("\b, ");
          pw.print("\b, ");
          charCount++;
        } else if (firstLetter == '.') {
          System.out.print("\b. ");
          pw.print("\b. ");
          charCount++;
        } else if (firstLetter == '!') {
          System.out.print("\b! ");
          pw.print("\b! ");
          charCount++;
        } else if (firstLetter == '?') {
          System.out.print("\b? ");
          pw.print("\b? ");
          charCount++;
        } else if (firstLetter == '-') {
          System.out.print("\b- \b");
          pw.print("\b- \b");
          charCount++;
          spaceCount--;
        } else if (firstLetter == ':') {
          System.out.print("\b: ");
          pw.print("\b: ");
          charCount++;
        } else if (firstLetter == ';') {
          System.out.print("\b; ");
          pw.print("\b; ");
          charCount++;
        } else {
          for (int i = 0; i < eachWord.length(); i++) {
            if (eachWord.charAt(i) == 'a' || eachWord.charAt(i) == 'e' || eachWord.charAt(i) == 'i' || eachWord.charAt(i) == 'o' || eachWord.charAt(i) == 'u') {
              firstVowelPos = i;
              break;
            }
          }
          if (firstVowelPos > -1) {
            System.out.print(eachWord.substring(firstVowelPos) + eachWord.substring(0, firstVowelPos) + consonantEnd + " ");
            pw.print(eachWord.substring(firstVowelPos) + eachWord.substring(0, firstVowelPos) + consonantEnd + " ");
            charCount = charCount + eachWord.substring(firstVowelPos).length() + eachWord.substring(0, firstVowelPos).length() + consonantEnd.length();
            spaceCount++;
          } else {
            System.out.print(eachWord + consonantEnd + " ");
            pw.print(eachWord + consonantEnd + " ");
            charCount += eachWord.length() + consonantEnd.length();
            spaceCount++;
          }
        }
      }
      if (spaceCount > 0) {
        spaceCount--;
      }
      allChars = charCount + spaceCount;
      System.out.println("\n\nCharacter count (with spaces): " + allChars + "\nCharacter count (excluding spaces): " + charCount + "\nSpace count: " + spaceCount + "\n~~~");
      pw.println("\n\nCharacter count (with spaces): " + allChars + "\nCharacter count (excluding spaces): " + charCount + "\nSpace count: " + spaceCount + "\n~~~");
      pw.println("");
      pw.close();
    } catch (Exception e) {
      System.out.println("\n*There was an error.*\n~~~");
    }
  }

  public static void main(String[] args) {
    System.out.println("      ______   __     ______        __         ______     ______   __     __   __    ");
    System.out.println("     /\\  == \\ /\\ \\   /\\  ___\\      /\\ \\       /\\  __ \\   /\\__  _\\ /\\ \\   /\\ \"-.\\ \\");
    System.out.println("     \\ \\  _-/ \\ \\ \\  \\ \\ \\__ \\     \\ \\ \\____  \\ \\  __ \\  \\/_/\\ \\/ \\ \\ \\  \\ \\ \\-.  \\  ");
    System.out.println("      \\ \\_\\    \\ \\_\\  \\ \\_____\\     \\ \\_____\\  \\ \\_\\ \\_\\    \\ \\_\\  \\ \\_\\  \\ \\_\\\"\\_ \\ ");
    System.out.println("       \\/_/     \\/_/   \\/_____/      \\/_____/   \\/_/\\/_/     \\/_/   \\/_/   \\/_/ \\/_/ ");
    System.out.println("");
    System.out.println(" ______     ______     __   __     __   __   ______     ______     ______   ______     ______    ");
    System.out.println("/\\  ___\\   /\\  __ \\   /\\ \"-.\\ \\   /\\ \\ / /  /\\  ___\\   /\\  == \\   /\\__  _\\ /\\  ___\\   /\\  == \\   ");
    System.out.println("\\ \\ \\____  \\ \\ \\/\\ \\  \\ \\ \\-.  \\  \\ \\ \\'/   \\ \\  __\\   \\ \\  __<   \\/_/\\ \\/ \\ \\  __\\   \\ \\  __<   ");
    System.out.println(" \\ \\_____\\  \\ \\_____\\  \\ \\_\\\"\\_ \\  \\ \\__|    \\ \\_____\\  \\ \\_\\ \\_\\    \\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\ ");
    System.out.println("  \\/_____/   \\/_____/   \\/_/ \\/_/   \\/_/      \\/_____/   \\/_/ /_/     \\/_/   \\/_____/   \\/_/ /_/ ");
    System.out.println("\n\n");
    System.out.println("Jonathan Su, Feb. 2021 \n----------------------------------\nType or paste a paragraph, then press enter to translate it to Pig Latin! \nOr, type \"#ESC\" to stop the program.\n");
    boolean run = true;
    while (run) {
      pigMethod();
    }
  }
}

// 1. Provide instructions and program info.
// 2. Receive a string from the user using the scanner class.
// 3. Set the input equal to a variable called userInput.
// 4. Format the text (all lowercase, replace symbols).
// 5. Print out "original text" and "translated text" to let user know.
// 6. Break the string apart into individual words using the String split method.
// 7. For each word, check to see if the first letter is a vowel.
////// a. If it is, print the word and add "yay" to the end.
////// b. If not, create a loop to go through the word's characters to find the index 
//////    of the first vowel and set it equal to a variable called firstVowelPos. 
//////    Print out the word substrings and add "ay" to the end.
// 8. Print out the punctuation and backspace since an extra space was added to prevent the symbol from getting mixed in with the word.
// 9. Repeat steps 7-8 for each word.

// This program's definition of Pig Latin:
// Words with vowel as first letter: Leave word alone and add "yay."
// Words with consonant as first letter: Take everything before the first vowel, put it at the end, and add "ay."
// Words with hyphen: Translate words on opposite sides of the hyphen separately.
// Words with apostrophe or quotation marks: Same as consonant as first letter.
// The letter 'y' is always treated as a consonant.
// Only covers commonly used punctuation.