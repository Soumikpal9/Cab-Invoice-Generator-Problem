package Cab.Invoice.Generator;

public class PremiumInvoiceGenerator {

    public static final int COST_PER_TIME = 2;
	public static final double MIN_COST_PER_KM = 15;
    public static final double MINIMUM_FARE = 20;
    
    public double calculateFare(double distance, int time) {
		double totalFare = distance * MIN_COST_PER_KM + time * COST_PER_TIME;
	 return Math.max(totalFare, MINIMUM_FARE);
	}
}
