
public abstract class Price {
	
	public abstract int getPriceCode();
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		// add frequent renter points
		// add bonus for a two day new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else
			return 1;
	}
	
}