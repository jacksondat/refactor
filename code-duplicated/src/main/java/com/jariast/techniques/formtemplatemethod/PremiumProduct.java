package com.jariast.techniques.formtemplatemethod;

public class PremiumProduct extends Product {
	
	private static final double PREMIUM_PRICE_ADDITION = 1.2;
	private static final double PREMIUM_TAX_ADDITION = 1.1;
	
	private double price;
	
	public PremiumProduct(double price) {
		this.price = price;
	}

	@Override
	public Double getBillableAmount() {
		double base = price * PREMIUM_PRICE_ADDITION;
		double tax = base * Product.TAX_RATE * PREMIUM_TAX_ADDITION;
		return base + tax;
	}

}
