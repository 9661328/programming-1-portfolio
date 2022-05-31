import java.util.*;

class Main {
    public final static int FLOZ_IN_GALLON = 128;
    public static int truckCapacity = FLOZ_IN_GALLON * 11_000;

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("How many ounces of water do you drink per day? ");
	int ozPerDay = scanner.nextInt();

	System.out.print("What is your life expectancy in years? ");
	int lifeExpectancy = scanner.nextInt();

	System.out.println("\nIn your lifetime, you will consume " + calculateNumTankers(ozPerDay, lifeExpectancy)
		+ " tanker truck(s) full of water.");
	scanner.close();
    }

    public static double calculateNumTankers(int ozPerDay, int lifeExpectancy) {
	double ozInLifetime = (ozPerDay * 365) * lifeExpectancy;
	return ozInLifetime / truckCapacity;
    }
}