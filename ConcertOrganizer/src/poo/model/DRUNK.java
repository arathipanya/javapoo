package poo.model;

import poo.model.state.IMusicianStateChangeable;
import poo.model.validation.ValidationException;

public class DRUNK implements IMusicianStateChangeable {
	private AbstractInstrument instrument;
	
	public DRUNK(AbstractInstrument i) { this.instrument = i; }
	
	public String play() {
		return (instrument != null)? "hum... " + this.instrument.playDrunk() : "ha?";
	}

	public String getState() {
		return "drunk";
	}
}
