package org.patternme.pattern;

import org.patternme.model.InstrumentImpl;


public class PianoBuilder implements InstrumentBuilder {

	private InstrumentImpl instrument = new InstrumentImpl();
	
	@Override
	public void buildType() {
		instrument.setType("Piano Type");
	}

	@Override
	public void buildBody() {
		instrument.setBody("Piano Body");
	}
	
	public InstrumentImpl getInstrument(){
		return this.instrument;
	}



	
}
