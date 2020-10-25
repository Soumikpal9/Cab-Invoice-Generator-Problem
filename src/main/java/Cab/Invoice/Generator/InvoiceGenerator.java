package Cab.Invoice.Generator;

public class InvoiceGenerator {
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0.0;
		for(Ride ride : rides) {
			if(ride.rideType == Ride.RideType.NORMAL)
				totalFare += new CabInvoice().calculateFare(ride.distance, ride.time);
			else if(ride.rideType == Ride.RideType.PREMIUM)
				totalFare += new PremiumInvoiceGenerator().calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
