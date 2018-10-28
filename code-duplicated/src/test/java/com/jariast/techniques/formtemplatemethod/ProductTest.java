package com.jariast.techniques.formtemplatemethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {

	Product product;

	@Test
	public void mustBeBasicProductBillableAmount() {
		double price = 5.0;
		product = new BasicProduct(price);
		
		double actualBillableAmount = product.getBillableAmount();
		double baseExpected = price;
		double taxExpected = baseExpected * Product.TAX_RATE;
		double expectedBillableAmount = baseExpected + taxExpected;
		
		assertEquals(expectedBillableAmount, actualBillableAmount, 0.0);
	}
	
	@Test
	public void mustBePremiumProductBillableAmount() {
		double price = 5.0;
		product = new PremiumProduct(price);
		
		double actualBillableAmount = product.getBillableAmount();
		double baseExpected = price * 1.2;
		double taxExpected = baseExpected * Product.TAX_RATE * 1.1;
		double expectedBillableAmount = baseExpected + taxExpected;
		
		assertEquals(expectedBillableAmount, actualBillableAmount, 0.0);
	}

}
