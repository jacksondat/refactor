package com.jariast.techniques.formtemplatemethod;

public abstract class Product {
	protected static final double TAX_RATE = 0.1F;
	protected double price;
	
	public Product(double price) {
		this.price = price;
	}
	
	public Double getBillableAmount() {
		return getBaseAmount() + getTaxAmount();
	}

	protected abstract Double getBaseAmount();
	
	protected abstract Double getTaxAmount();

}
