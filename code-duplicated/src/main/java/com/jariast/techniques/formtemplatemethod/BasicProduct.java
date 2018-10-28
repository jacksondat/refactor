package com.jariast.techniques.formtemplatemethod;

public class BasicProduct extends Product {

	public BasicProduct(double price) {
		super(price);
	}
	
	@Override
	protected Double getBaseAmount() {
		return price;
	}
	
	@Override
	protected Double getTaxAmount() {
		return getBaseAmount() * Product.TAX_RATE;
	}

}
