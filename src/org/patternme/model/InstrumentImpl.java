package org.patternme.model;

public class InstrumentImpl implements Instrument {
	
	private String body;
	private String type;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void play() {
		System.out.println("Playing instrument");
	}
	
	
}
