package org.patternme.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import org.patternme.pattern.ShoppingItemIterator;
import org.patternme.pattern.ShoppingItemIteratorImpl;
import org.patternme.pattern.Visitable;

public class ShoppingCartImpl extends Observable implements ShoppingCart  {

	private List<Visitable> shoppingItems = new ArrayList<>();
	private ShoppingItemIterator iterator;
	
	@Override
	public ShoppingItemIterator getIterator() {
		this.iterator = new ShoppingItemIteratorImpl(this.shoppingItems);
		return this.iterator;
	}
	
	public boolean addShoppingItemToCart(ShoppingItem item){
		boolean result = this.shoppingItems.add(item);
		this.setChanged();
		this.notifyObservers();
		return result;
	}

	public boolean addItemToCart(Visitable item){
		boolean result = this.shoppingItems.add(item);
		return result;
	}
	
	public List<Visitable> getShoppingItems(){
		return this.shoppingItems;
	}
	
}
