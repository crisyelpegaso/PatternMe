package org.patternme.pattern;

import org.patternme.model.PaymentMethod;
import org.patternme.model.SimplePaymentMethod;

public class SimplePaymentMethodFactory extends PaymentMethodFactory {

	@Override
	public PaymentMethod createPaymentMethod() {
		SimplePaymentMethod spm = new SimplePaymentMethod();
		return spm;
	}

	
}
