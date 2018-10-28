package com.jariast.techniques.formtemplatemethod;

public class PremiumProduct extends Product {
	
	private static final double PREMIUM_PRICE_ADDITION = 1.2;
	private static final double PREMIUM_TAX_ADDITION = 1.1;
	
	public PremiumProduct(double price) {
		super(price);
	}

	@Override
	protected Double getBaseAmount() {
		return price * PREMIUM_PRICE_ADDITION;
	}
	
	@Override
	protected Double getTaxAmount() {
		return getBaseAmount() * Product.TAX_RATE * PREMIUM_TAX_ADDITION;
	}

}
