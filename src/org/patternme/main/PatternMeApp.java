package org.patternme.main;


import org.patternme.model.CustomerCard;
import org.patternme.model.PaymentMethod;
import org.patternme.model.ShoppingCartBill;
import org.patternme.model.ShoppingCartImpl;
import org.patternme.model.ShoppingGiftItem;
import org.patternme.model.ShoppingItem;
import org.patternme.pattern.BassBuilder;
import org.patternme.pattern.Callable;
import org.patternme.pattern.Callback;
import org.patternme.pattern.CompositePaymentMethodFactory;
import org.patternme.pattern.InstrumentBuilder;
import org.patternme.pattern.InstrumentProxy;
import org.patternme.pattern.PaymentMethodFactory;
import org.patternme.pattern.PianoBuilder;
import org.patternme.pattern.QuickSortAlgorithm;
import org.patternme.pattern.ShippingBill;
import org.patternme.pattern.ShoppingItemIterator;
import org.patternme.pattern.SimplePaymentMethodFactory;
import org.patternme.pattern.SinglePattern;
import org.patternme.pattern.SortingAlgorithmStrategy;
import org.patternme.pattern.SortingContext;
import org.patternme.pattern.TokenAdapter;
import org.patternme.pattern.Tokenizer;
import org.patternme.pattern.Visitable;

public class PatternMeApp {

	public static void main(String[] args) {
		System.out.println(" *** SINGLETON ***");
		SinglePattern.getInstance().addMessage("Hola");
		SinglePattern.getInstance().addMessage("Peti");
		
		for (String m : SinglePattern.getInstance().getMessage()){
			System.out.println(m);	
		}
		
		System.out.println(" *** BUILDER ***");
		InstrumentBuilder pb = new PianoBuilder();
		pb.buildBody();
		InstrumentBuilder bb = new BassBuilder();
		bb.buildBody();
		
		System.out.println(" Piano built : " + pb.getInstrument().getBody());
		System.out.println(" Bass built : " + bb.getInstrument().getBody());
		
		System.out.println(" *** PROXY ***");
		InstrumentProxy proxy = new InstrumentProxy();
		proxy.play();
		
		System.out.println(" *** ADAPTER ***");
		CustomerCard cardToken = new CustomerCard();
		Tokenizer tokenizer = new TokenAdapter();
		tokenizer.tokenize(cardToken);
		
		System.out.println(" *** ITERATOR ***");
		ShoppingItem item1 = new ShoppingItem("1");
		ShoppingItem item2 = new ShoppingItem("2");
		ShoppingItem item3 = new ShoppingItem("3");
		ShoppingItem item4 = new ShoppingItem("4");
		
		ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
		shoppingCart.addShoppingItemToCart(item1);
		shoppingCart.addShoppingItemToCart(item2);
		shoppingCart.addShoppingItemToCart(item3);
		shoppingCart.addShoppingItemToCart(item4);
		
		ShoppingItemIterator iterator = shoppingCart.getIterator();
		while (iterator.hasNext()){
			Visitable shoppingItem = iterator.next();
			System.out.println("Item purchased : " + ((ShoppingItem)shoppingItem).getId());
		}
		
		System.out.println(" *** OBSERVER ***");
		ShoppingCartBill bill = new ShoppingCartBill();
		shoppingCart.addObserver(bill);
		shoppingCart.addShoppingItemToCart(new ShoppingItem("5"));
		
		System.out.println(" *** VISITOR ***");
		ShoppingGiftItem giftItem = new ShoppingGiftItem();
		shoppingCart.addItemToCart(giftItem);
		ShippingBill shippingBill = new ShippingBill();
		for (Visitable v : shoppingCart.getShoppingItems()){
			v.accept(shippingBill);
		}
		
		System.out.println(" *** FACTORY ***");
		PaymentMethod pm = new CompositePaymentMethodFactory().createPaymentMethod();
		
		System.out.println(" *** COMPOSITE ***");
		PaymentMethod spm = new SimplePaymentMethodFactory().createPaymentMethod();
		pm.addPaymentMethod(spm);
		PaymentMethod spm2 = new SimplePaymentMethodFactory().createPaymentMethod();
		pm.addPaymentMethod(spm2);
		pm.pay();
		
		System.out.println(" *** STRATEGY ***");
		SortingAlgorithmStrategy sortingStrategy = new QuickSortAlgorithm();
		SortingContext sortingContext = new SortingContext(sortingStrategy);
		int[] arr = new int[]{1,2,3}; 
		sortingContext.sortNumbers(arr);
		
		System.out.println(" *** COMMAND? ***");
		getPaymentMethods(new Callback(){
			@Override
			public void onSuccess(PaymentMethod response) {
				super.onSuccess(response);
			}
			
			@Override
			public void onFailure() {
				super.onFailure();
			}
			
		});
		
	}
	
	public static void getPaymentMethods(Callback c){
		System.out.println("I do some magic here and then ...");
		PaymentMethod response = new SimplePaymentMethodFactory().createPaymentMethod();
		c.onSuccess(response);
	}
	

}
