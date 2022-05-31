/*
 * Written by: Jonathan Su
 * Date: 10/19/2021
 * 
 * Tests methods in the Battery class.
 * */

public class BatteryTester {
    public static void main(String[] args) {
	Battery aa = new Battery(3000);
	System.out.println(aa.getRemainingCapacity());
	System.out.println("Expected: 3000.0");

	aa.drain(250);
	System.out.println(aa.getRemainingCapacity());
	System.out.println("Expected: 2750.0");

	aa.drain(1075);
	System.out.println(aa.getRemainingCapacity());
	System.out.println("Expected: 1675.0");

	aa.charge();
	System.out.println(aa.getRemainingCapacity());
	System.out.println("Expected: 3000.0");
    }
}