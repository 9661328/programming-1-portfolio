/*
 * Written by: Jonathan Su
 * Date: 9/22/2021
 * 
 * Project P1.1: Determine whether to take your car or a train to work.
 * */

import java.util.*;
import java.text.DecimalFormat;

class CommuteCalculator {
    public static final int GAS_COST = 4;
    public static final double MCOST_PER_MILE = 0.05;

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Fuel efficiency of car (in miles per gallon): ");
	double mpg = scanner.nextDouble();

	System.out.print("Distance to work (in miles): ");
	double distanceToWork = scanner.nextDouble();

	System.out.print("Cost of train ticket: ");
	double ticketPrice = scanner.nextDouble();

	String costToDrive = Double.toString(costOfCar(mpg, distanceToWork));
	String carOrTrain = (Double.parseDouble(costToDrive) <= ticketPrice) ? ". You should drive to work." : ". You should take the train to work.";

	System.out.print("\nCost to drive " + distanceToWork + " miles to work: $" + costToDrive);
	System.out.println(carOrTrain);

	scanner.close();
    }

    public static double costOfCar(double mpg, double distanceToWork) {
	double gasUsedInGallons = distanceToWork / mpg;
	double costOfCar = (gasUsedInGallons * GAS_COST) + (MCOST_PER_MILE * distanceToWork);

	DecimalFormat df = new DecimalFormat("###.##");

	return Double.parseDouble(df.format(costOfCar));
    }
}