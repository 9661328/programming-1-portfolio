import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Welcome to the command line calculator!");

	do {
	    System.out.print("\nEnter the first number to compute: ");
	    String num1 = scanner.nextLine();

	    System.out.print("Enter the operator to use: ");
	    String op = scanner.nextLine();

	    System.out.print("Enter the second number to compute: ");
	    String num2 = scanner.nextLine();

	    if ("+-*/%".contains(op)) {
		try {
		    System.out.println(
			    "\nThe answer is: " + calculate(Double.parseDouble(num1), op, Double.parseDouble(num2)));
		} catch (NumberFormatException e) {
		    System.out.println("\nInvalid number! " + e);
		}
	    } else {
		System.out.println("\nInvalid operator!");
	    }

	    System.out.println("\nDo you want to do another calculation? Enter 'y' for yes and 'n' for no.");
	} while (scanner.nextLine().equals("y"));
	scanner.close();
    }

    public static double calculate(double num1, String op, double num2) {
	double answer = 0.0;
	switch (op) {
	case "+":
	    answer = num1 + num2;
	    break;
	case "-":
	    answer = num1 - num2;
	    break;
	case "*":
	    answer = num1 * num2;
	    break;
	case "/":
	    answer = num1 / num2;
	    break;
	case "%":
	    answer = num1 % num2;
	    break;
	}
	return answer;
    }
}