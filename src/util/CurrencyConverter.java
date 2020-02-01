package util;

public class CurrencyConverter {
	
	public static final double TAX = 6.00;
	
	public static double Price(double dollarPrice,double dollarAmount) {
		return dollarPrice * dollarAmount*TAX/100 + dollarPrice * dollarAmount;
	}
	}


