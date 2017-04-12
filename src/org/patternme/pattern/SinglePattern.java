package org.patternme.pattern;

import java.util.ArrayList;
import java.util.List;

public class SinglePattern {
	
	private List<String> messages;
	private static SinglePattern instance;
	
	private SinglePattern(){
		this.messages = new ArrayList<String>();
	}
	
	public static SinglePattern getInstance(){
		if (instance == null) {
			instance = new SinglePattern();
		}
		return instance;
	}
	
	public boolean addMessage(String message){
		return SinglePattern.getInstance().messages.add(message);
	}

	public List<String> getMessage(){
		return SinglePattern.getInstance().messages;
	}
}
