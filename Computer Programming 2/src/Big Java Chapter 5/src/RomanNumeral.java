/*
* Written by: Jonathan Su
* Date: 11/12/2021
* 
* Converts numbers into Roman numerals and vice versa.
*/

import java.util.*;

class RomanNumeral {
  static LinkedHashMap<Integer, String> numToChar = new LinkedHashMap<Integer, String>();
  static {
    numToChar.put(1000, "M");
    numToChar.put(900, "CM");
    numToChar.put(500, "D");
    numToChar.put(400, "CD");
    numToChar.put(100, "C");
    numToChar.put(90, "XC");
    numToChar.put(50, "L");
    numToChar.put(40, "XL");
    numToChar.put(10, "X");
    numToChar.put(9, "IX");
    numToChar.put(5, "V");
    numToChar.put(4, "IV");
    numToChar.put(1, "I");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Convert number to Roman numeral.\n2 - Convert Roman numeral to number.");

    System.out.print("Enter a mode: ");
    String mode = scanner.nextLine();

    if (mode.equals("1")) {
      System.out.print("Enter a number: ");
      String inputNumber = scanner.nextLine();
      System.out.println(inputNumber + " = " + numToRomanNumeral(Integer.parseInt(inputNumber)));
    } else if (mode.equals("2")) {
      System.out.print("Enter a Roman numeral: ");
      String inputStr = scanner.nextLine();
      System.out.println(inputStr + " = " + romanNumeralToNum(inputStr));
    } else {
      System.out.println("Invalid mode.");
    }

    scanner.close();
  }

  public static String numToRomanNumeral(int num) {
    if (num < 0 || num > 4000) {
      return "Number must be positive and less than 4000.";
    }

    StringBuilder output = new StringBuilder("");

    while (num != 0) {
      for (int key: numToChar.keySet()) {
        if (num >= key) {
          int quotient = (int)num / key;

          for(int times = 0; times < quotient; times++) {
            output.append(numToChar.get(key));
          }

          num = num - (quotient * key);
          break;
        }
      }
    }

    return output.toString();
  }

  public static String romanNumeralToNum(String str) {
    for (int i = 0; i < str.length(); i++) {
      String ch = String.valueOf(str.charAt(i));
      if (!numToChar.containsValue(ch)) {
        return "Invalid Roman numeral.";
      }
    }

    ArrayList<Integer> values = new ArrayList<Integer>();
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      String ch = String.valueOf(str.charAt(i));
      for (int key: numToChar.keySet()) {
        if (numToChar.get(key).equals(ch)) {
          values.add(key);
        }
      }
    }

    System.out.println(values);

    for (int i = 0; i < values.size() - 1; i++) {
      if (values.get(i) >= values.get(i + 1)) {
        sum = sum + values.get(i);
      } else {
        sum = sum - values.get(i);
      }
    }
    sum = sum + values.get(values.size() - 1);

    if (sum < 0 || sum > 3999) {
      return "Invalid Roman Numeral.";
    }

    return String.valueOf(sum);
  }
}