/*
 * Written by: Jonathan Su, Jinjie Luo, Xuanchen Wu, Miguel Oyarzun
 * Date: 10/28/2021
 *
 * 4.2: Calculates the date of Easter on a year based on an algorithm invented by Carl Friedrich Gauss.
 */

import java.util.*;

class EasterCalculator {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to Easter calculator! Enter a year and we will tell you what day Easter will be/was that year.");

	// 1
	int y = input.nextInt();

	// 2
	int a = y % 19;

	// 3
	int b = y / 100;
	int c = y % 100;

	// 4
	int d = b / 4;
	int e = b % 4;

	// 5
	int g = (8 * b + 13) / 25;

	// 6
	int h = (19 * a + b - d - g + 15) % 30;

	// 7
	int j = c / 4;
	int k = c % 4;

	// 8
	int m = (a + 11 * h) / 319;

	// 9
	int r = (2 * e + 2 * j - k - h + m + 32) % 7;

	// 10
	int n = (h - m + r + 90) / 25;

	// 11
	int p = (h - m + r + n + 19) % 32;

	// Used for testing purposes
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(g);
	System.out.println(h);
	System.out.println(j);
	System.out.println(k);
	System.out.println(m);
	System.out.println(r);
	System.out.println(n);
	System.out.println(p);
	System.out.println();

	// Easter always falls on April or March so only 2 options needed for the month
	String monthString;
	switch (n) {
	case 3:
	    monthString = "March";
	    break;
	case 4:
	    monthString = "April";
	    break;
	default:
	    monthString = "Error/Invalid month";
	    break;
	}

	System.out.println("In " + y + ", Easter Sunday fell/will fall on " + monthString + " " + p + ".");
	input.close();
    }
}