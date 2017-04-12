package org.patternme.pattern;

import org.patternme.model.InstrumentImpl;

public interface InstrumentBuilder {

	public void buildType();
	public void buildBody();
	public InstrumentImpl getInstrument();
}
