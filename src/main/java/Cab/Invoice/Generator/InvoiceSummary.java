package Cab.Invoice.Generator;

public class InvoiceSummary {
	public static int noOfRides;
	public static double totalFare;
	public static double averageFare;
	
	public InvoiceSummary(int noOfRides, double totalfare) {
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.noOfRides;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		InvoiceSummary that = (InvoiceSummary)obj;
		return noOfRides == that.noOfRides &&
				Double.compare(that.totalFare, totalFare) == 0 &&
				Double.compare(that.averageFare, averageFare) == 0;
	}
}
