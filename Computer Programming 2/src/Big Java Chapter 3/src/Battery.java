/* 
 * Written by: Jonathan Su
 * Date: 10/19/2021
 *
 * Project P3.9: A class to model a rechargeable battery.
 * */

public class Battery {
    private double originalCapacity, capacity;

    /**
     * Constructs a new battery.
     * 
     * @param capacity - the capacity of the battery measured in milliampere hours.
     */
    public Battery(double capacity) {
	this.originalCapacity = capacity;
	this.capacity = capacity;
    }

    /**
     * Discharges the battery by an amount.
     * 
     * @param amount - the amount to drain the battery measured in milliampere
     *               hours.
     */
    public void drain(double amount) {
	this.capacity -= amount;
    }

    /**
     * Charges the battery back to its original capacity.
     */
    public void charge() {
	this.capacity = originalCapacity;
    }

    /**
     * @return the current capacity of the battery.
     */
    public double getRemainingCapacity() {
	return this.capacity;
    }
}