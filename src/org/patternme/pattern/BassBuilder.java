package org.patternme.pattern;

import org.patternme.model.InstrumentImpl;

public class BassBuilder implements InstrumentBuilder  {

	private InstrumentImpl instrument = new InstrumentImpl();
	
	@Override
	public void buildType() {
		instrument.setType("Bass Type");
	}

	@Override
	public void buildBody() {
		instrument.setBody("bass body");
	}

	public InstrumentImpl getInstrument(){
		return this.instrument;
	}
}
