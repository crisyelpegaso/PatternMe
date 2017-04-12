package org.patternme.pattern;

import org.patternme.model.PaymentMethod;

public class CompositePaymentMethodFactory extends PaymentMethodFactory {

	@Override
	public PaymentMethod createPaymentMethod() {
		CompositePaymentMethod cpm = new CompositePaymentMethod();
		return cpm;
	}

	
}
