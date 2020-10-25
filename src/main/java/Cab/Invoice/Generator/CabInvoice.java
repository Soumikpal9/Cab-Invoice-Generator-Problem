/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Cab.Invoice.Generator;

public class CabInvoice {
	private static final int COST_PER_TIME = 1;
	private static final double COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;
	
	public double calculateFare(double distance, int time) {
		double fare = (distance * COST_PER_KILOMETER) + (time * COST_PER_TIME);
		if(fare < MINIMUM_FARE) {
			fare = MINIMUM_FARE;
		}
		return fare;
	}
}
