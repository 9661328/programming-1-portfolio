/*
 * Written by: Jonathan Su
 * Date: 11/25/2021
 *
 * Clone of the "1-Var Stats" function on a TI-84 graphing calculator. Calculates mean, deviation, quartiles, etc.
 */

import java.util.*;

class DataSet {
  public static Scanner scanner = new Scanner(System.in);
  public static ArrayList < Double > data = new ArrayList < Double > ();

  public static void main(String[] args) {
    System.out.println("Enter numbers, negative number when done.");

    double d;
    do {
      d = scanner.nextDouble();

      if (d > 0) {
        add(d);
      }
    } while (d > 0);

    runMethods();
  }

  public static void runMethods() {
    if (data.size() <= 3) {
      System.out.println("List size must be greater than 3.");
      return;
    }
    System.out.println(data);
    Collections.sort(data);
    System.out.println("x̄ = " + getAverage());
    System.out.println("Σx = " + getSum());
    System.out.println("Σx^2 = " + getSquaredSum());
    System.out.println("Sx = " + getStandardDeviation());
    System.out.println("σx = " + getPopulationDeviation());
    System.out.println("n = " + getCount());
    System.out.println("minX = " + getMin());
    System.out.println("Q1 = " + getQ1());
    System.out.println("Med = " + getMedian());
    System.out.println("Q3 = " + getQ3());
    System.out.println("maxX = " + getMax());
  }

  public static void add(double value) {
    data.add(value);
  }

  public static double getAverage() {
    double sum = 0, count = 0;

    for (double d: data) {
      sum += d;
      count++;
    }

    return sum / count;
  }

  public static double getSum() {
    double sum = 0;

    for (double d: data) {
      sum += d;
    }

    return sum;
  }

  public static double getSquaredSum() {
    double sum = 0;

    for (double d: data) {
      sum += Math.pow(d, 2);
    }

    return sum;
  }

  public static double getStandardDeviation() {
    double x = getAverage(), n = data.size(), sumOfDeviations = 0.0;
    double[] deviations = new double[data.size()];
    int i = 0;

    for (double d: data) {
      deviations[i] = Math.pow(data.get(i) - x, 2);
      i++;
    }

    for (double d: deviations) {
      sumOfDeviations += d;
    }

    return Math.sqrt((sumOfDeviations) / (n - 1));
  }

  public static double getPopulationDeviation() {
    double x = getAverage(), n = data.size(), sumOfDeviations = 0.0;
    double[] deviations = new double[data.size()];
    int i = 0;

    for (double d: data) {
      deviations[i] = Math.pow(data.get(i) - x, 2);
      i++;
    }

    for (double d: deviations) {
      sumOfDeviations += d;
    }

    return Math.sqrt(sumOfDeviations / n);
  }

  public static int getCount() {
    return data.size();
  }

  public static double getMin() {
    return data.get(0);
  }

  public static double getQ1() {
    double result;
    ArrayList < Double > firstHalf = new ArrayList < Double > ();
    for (int i = 0; i < data.size() / 2; i++) {
      firstHalf.add(data.get(i));
    }

    if (firstHalf.size() % 2 == 1) {
      result = firstHalf.get(firstHalf.size() / 2);
    } else {
      result = (firstHalf.get(firstHalf.size() / 2) + firstHalf.get((firstHalf.size() / 2) - 1)) / 2;
    }

    return result;
  }

  public static double getMedian() {
    double result;

    if (data.size() % 2 == 1) {
      result = data.get(data.size() / 2);
    } else {
      result = (data.get(data.size() / 2) + data.get((data.size() / 2) - 1)) / 2;
    }

    return result;
  }

  public static double getQ3() {
    double result;
    ArrayList < Double > secondHalf = new ArrayList < Double > ();
    if (data.size() % 2 == 1) {
      for (int i = (data.size() / 2) + 1; i < data.size(); i++) {
        secondHalf.add(data.get(i));
      }
    } else {
      for (int i = (data.size() / 2); i < data.size(); i++) {
        secondHalf.add(data.get(i));
      }
    }

    if (secondHalf.size() % 2 == 1) {
      result = secondHalf.get(secondHalf.size() / 2);
    } else {
      result = (secondHalf.get(secondHalf.size() / 2) + secondHalf.get((secondHalf.size() / 2) - 1)) / 2;
    }

    return result;
  }

  public static double getMax() {
    return data.get(data.size() - 1);
  }
}