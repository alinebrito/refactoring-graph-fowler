import java.util.Enumeration;

public abstract class Statement {
	
	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		String result = headerString(aCustomer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			//show figures for this rental
			result += eachRentalString(each);
		}
		//add footer lines
		result += footerString(aCustomer);
		return result;
	}
	
	public abstract String headerString(Customer aCustomer);
	
	public abstract String eachRentalString(Rental each);
	
	public abstract String footerString(Customer aCustomer);

}
