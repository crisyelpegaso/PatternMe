package org.patternme.pattern;

import org.patternme.model.Instrument;
import org.patternme.model.InstrumentImpl;

public class InstrumentProxy implements Instrument {
	
	InstrumentImpl currentInstrument = new InstrumentImpl();
	
	@Override
	public void play() {
		currentInstrument.play();
	}
	

}
