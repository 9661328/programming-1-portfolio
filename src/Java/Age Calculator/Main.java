// Jonathan Su, Feb. 2021

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text. * ;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System. in );
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    Date date2 = new Date();
    SimpleDateFormat MDY = new SimpleDateFormat("MM/dd/yyyy");

    System.out.println("Enter the month you were born (1-12):");
    int month = input.nextInt();
    System.out.println("\nEnter the day you were born (1-31):");
    int day = input.nextInt();
    System.out.println("\nEnter the year you were born as 4 digits:");
    int year = input.nextInt();
    calendar1.set(year, month - 1, day);
    long milliC1 = calendar1.getTimeInMillis();
    long milliC2 = calendar2.getTimeInMillis();
    long diff = milliC2 - milliC1;
    Date date1 = new Date(milliC1);
    System.out.println("\n" + date2.toString());
    System.out.println(date1.toString());
    System.out.println(milliC2 + " - " + milliC1);
    System.out.println(diff + " ms");

    double days = diff / 86400000;
    double millenium = (((days / 365) / 100) / 10);
    double centuries = ((days / 365) / 100);
    double decades = ((days / 365) / 10);
    double years = days / 365;
    double months = years * 12;
    double weeks = days / 7;
    long hours = diff / 3600000;
    long minutes = diff / 60000;
    long seconds = diff / 1000;

    System.out.println("\nYour age is:");
    System.out.println(millenium + " millenium");
    System.out.println(centuries + " century");
    System.out.println(decades + " decades");
    System.out.println(years + " years");
    System.out.println(months + " months");
    System.out.println(weeks + " weeks");
    System.out.println(days + " days");
    System.out.println(hours + " hours");
    System.out.println(minutes + " minutes");
    System.out.println(seconds + " seconds");
    System.out.println(diff + " milliseconds");
    System.out.println("\n*These values are from " + month + "/" + day + "/" + year + " at midnight to " + MDY.format(date2) + " at midnight, and are approximate. \nTimezone may affect calculations.");
  }
}

// Use the scanner class to ask the user for their birth month, birth day, and birth year, and store each value in a variable.
// Create two objects of the calendar class.
// Set one calendar equal to the user’s birthday and one calendar to the current time.
// Get each date in milliseconds and find the difference between the two.
// Convert milliseconds to each period of time such as days, weeks, etc. using math. Most calculations are done by converting days to a period of time.
// Print out the variables and concatenate it with some text.