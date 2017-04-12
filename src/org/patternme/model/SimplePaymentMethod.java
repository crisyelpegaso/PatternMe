package org.patternme.model;

public class SimplePaymentMethod implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("Paying with pm");
	}

	@Override
	public void addPaymentMethod(PaymentMethod pm) {
		// Empty
		
	}

	
}
