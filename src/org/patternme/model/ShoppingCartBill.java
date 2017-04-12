package org.patternme.model;

import java.util.Observable;
import java.util.Observer;

public class ShoppingCartBill implements Observer {

	private String id;
	private double totalPrice;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		ShoppingCartImpl shoppingCartUpdated =  (ShoppingCartImpl) o;
		// do magic
		System.out.println("Shopping Cart Bill observed Shopping Cart was updated");
	}
	
	
	
}
