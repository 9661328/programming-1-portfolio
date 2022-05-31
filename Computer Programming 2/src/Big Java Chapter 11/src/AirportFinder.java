/*
 * Returns a list of airports in the city or country supplied by the user. 
 * Reads airport data from airports.dat file downloaded from https://openflights.org/data.html
 * 
 * Written by: Jonathan Su
 * Date: 3/4/2022
 * */

import java.util.*;
import java.io.*;

public class AirportFinder {
    public static void main(String[] args) throws FileNotFoundException {
	File airportFile = new File("airports.dat");

	try (Scanner fileScanner = new Scanner(airportFile, "UTF-8"); Scanner input = new Scanner(System.in, "UTF-8")) {
	    System.out.print("Enter a city or country: ");
	    
	    String searchPlace = input.nextLine();
	    ArrayList<String> results = new ArrayList<String>();

	    fileScanner.useDelimiter(",");

	    while (fileScanner.hasNextLine()) {
		String[] airportData = fileScanner.nextLine().split(",");

		for (int i = 0; i < airportData.length; i++) {
		    if (airportData[i].contains("\"")) {
			airportData[i] = airportData[i].replaceAll("\"", "");
		    }
		}

		if (airportData[2].equals(searchPlace) || airportData[3].equals(searchPlace)) {
		    // results.add(airportData[1] + ": " + Arrays.toString(airportData));
		    results.add(airportData[1]);
		}
	    }

	    if (results.size() == 0) {
		System.out.println("No airports found in " + searchPlace + "!");
	    } else {
		System.out.println(results.size() + " airport(s) found in " + searchPlace + ":");
		for (String airport : results) {
		    System.out.println(airport);
		}
	    }
	}
    }
}
