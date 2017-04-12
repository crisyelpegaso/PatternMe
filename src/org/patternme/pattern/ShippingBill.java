package org.patternme.pattern;

import org.patternme.model.ShoppingGiftItem;
import org.patternme.model.ShoppingItem;

public class ShippingBill implements Visitor {

	@Override
	public void visit(ShoppingItem item) {
		System.out.println("Shopping Item was visited");
		
	}

	@Override
	public void visit(ShoppingGiftItem item) {
		System.out.println("Shopping Gift Item was visited");
	}

}
