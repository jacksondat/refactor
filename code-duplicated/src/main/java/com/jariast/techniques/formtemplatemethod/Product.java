package com.jariast.techniques.formtemplatemethod;

public abstract class Product {
	protected static final double TAX_RATE = 0.1F;
	
	public abstract Double getBillableAmount();

}
