package org.patternme.pattern;

import java.util.List;

import org.patternme.model.ShoppingItem;

public class ShoppingItemIteratorImpl implements ShoppingItemIterator {

	private int currentPos = 0;
	private List<Visitable> shoppingItems;
	
	public ShoppingItemIteratorImpl(List<Visitable> shoppingItems){
		this.shoppingItems = shoppingItems;
	}
	
	@Override
	public boolean hasNext() {
		return currentPos < this.shoppingItems.size();
		
	}

	@Override
	public Visitable currentItem() {
		return shoppingItems.get(currentPos);
	}

	@Override
	public Visitable next() {
		if (currentPos < this.shoppingItems.size()){
			Visitable currentShoppingItem = this.shoppingItems.get(currentPos);
			this.currentPos++;
			return currentShoppingItem;
		}
		return null;
	}

}
