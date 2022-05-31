import java.util.*;

public class Student {
    private String fName, lName;
    private char gender;
    private int age, studentID;

    public Student() {
	fName = "";
	lName = "";
	gender = ' ';
	age = 0;
	studentID = 0;
    }

    public Student(String fName, String lName, char gender, int age, int studentID) {
	this.fName = fName;
	this.lName = lName;
	this.gender = gender;
	this.age = age;
	this.studentID = studentID;
    }

    public String getfName() {
	return fName;
    }

    public void setfName(String fName) {
	this.fName = fName;
    }

    public String getlName() {
	return lName;
    }

    public void setlName(String lName) {
	this.lName = lName;
    }

    public char getGender() {
	return gender;
    }

    public void setGender(char gender) {
	this.gender = gender;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public int getStudentID() {
	return studentID;
    }

    public void setStudentID(int studentID) {
	this.studentID = studentID;
    }

    public String display() {
	String fullName = fName.toUpperCase() + "" + lName.toUpperCase();
	String newName = "";
	int[] charToInt = new int[fullName.length()];

	for (int i = 0; i < fullName.length(); i++) {
	    charToInt[i] = (int) fullName.charAt(i);
	}

	Arrays.sort(charToInt);

	for (int a : charToInt) {
	    newName += (char) a;
	}

	return newName;
    }

    public int calculate() {
	int tempStudentID = studentID;
	int result = 0;

	while (tempStudentID > 0) {
	    result += tempStudentID % 10;
	    tempStudentID /= 10;
	}

	return result;
    }

    public String ageToBinary() {
	String binaryAge = (Integer.toBinaryString(age));

	return binaryAge;
    }

    public String allosome() {
	String a = "";

	if (gender == 'm') {
	    a = "XY";
	} else if (gender == 'f') {
	    a = "XX";
	} else {
	    a = "??";
	}

	return a;
    }
}