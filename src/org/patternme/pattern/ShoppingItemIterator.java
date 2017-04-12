package org.patternme.pattern;


public interface ShoppingItemIterator {

	public boolean hasNext();
	public Visitable currentItem();
	public Visitable next();
}
