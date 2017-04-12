package org.patternme.pattern;

import org.patternme.model.ShoppingGiftItem;
import org.patternme.model.ShoppingItem;

public interface Visitor {

	public void visit(ShoppingItem item);
	public void visit(ShoppingGiftItem item);
	
}
