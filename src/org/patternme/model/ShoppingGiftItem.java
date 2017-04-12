package org.patternme.model;

import org.patternme.pattern.Visitable;
import org.patternme.pattern.Visitor;

public class ShoppingGiftItem implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
