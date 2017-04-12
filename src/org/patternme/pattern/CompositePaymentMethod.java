package org.patternme.pattern;

import java.util.ArrayList;
import java.util.List;

import org.patternme.model.PaymentMethod;
import org.patternme.model.SimplePaymentMethod;

public class CompositePaymentMethod implements PaymentMethod {

	List<SimplePaymentMethod> simplePaymentMethods = new ArrayList<SimplePaymentMethod>();

	@Override
	public void pay() {
		for (SimplePaymentMethod pm : simplePaymentMethods){
			pm.pay();	
		}
	}

	@Override
	public void addPaymentMethod(PaymentMethod pm) {
		this.simplePaymentMethods.add((SimplePaymentMethod) pm);
		
	}
	
	
	
	
	
	
}
