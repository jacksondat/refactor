package com.jariast.techniques.formtemplatemethod;

public class BasicProduct extends Product {

	private double price;
	
	public BasicProduct(double price) {
		this.price = price;
	}
	
	@Override
	public Double getBillableAmount() {
		double base = price;
		double tax = base * Product.TAX_RATE;
		return base + tax;
	}

}
