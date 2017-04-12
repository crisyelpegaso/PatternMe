package org.patternme.pattern;

import org.patternme.model.PaymentMethod;


public class Callback implements Callable<PaymentMethod> {

	public void onSuccess(PaymentMethod response){
		System.out.println("ON SUCCESS CALLBACK CALLED :D");
	}
	
	public void onFailure(){
		System.out.println("ON FAILURE CALLBACK CALLED :D");
	}

}
