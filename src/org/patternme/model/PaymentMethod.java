package org.patternme.model;

public interface PaymentMethod {

	public void pay();
	
	public void addPaymentMethod(PaymentMethod pm);
}
