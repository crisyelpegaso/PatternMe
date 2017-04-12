package org.patternme.model;

import org.patternme.pattern.Visitable;
import org.patternme.pattern.Visitor;

public class ShoppingItem implements Visitable {

	private String id;

	public ShoppingItem(String id){
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	
}
