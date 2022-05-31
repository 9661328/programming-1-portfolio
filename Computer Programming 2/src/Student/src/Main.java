import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your first name: ");
	String fName = scanner.nextLine();

	System.out.print("Enter your last name: ");
	String lName = scanner.nextLine();

	System.out.print("Enter your gender (m/f): ");
	char gender = scanner.next().charAt(0);

	System.out.print("Enter your age: ");
	int age = scanner.nextInt();

	System.out.print("Enter your student ID: ");
	int studentID = scanner.nextInt();

	Student student = new Student(fName, lName, gender, age, studentID);
	System.out.println();
	System.out.println("Your first and last name alphabetized is: " + student.display());
	System.out.println("The sum of the digits in your student ID is: " + student.calculate());
	System.out.println("Your age in binary is: " + student.ageToBinary());

	System.out.println(
		student.allosome() + "" + student.ageToBinary() + "" + student.display() + "" + student.calculate());
	scanner.close();
    }
}