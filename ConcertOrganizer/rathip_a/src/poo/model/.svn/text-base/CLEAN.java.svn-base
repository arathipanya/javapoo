package poo.model;

import poo.model.state.IMusicianStateChangeable;

public class CLEAN implements IMusicianStateChangeable {
	private AbstractInstrument instrument;
	
	public CLEAN(AbstractInstrument i) { this.instrument = i; }
	
	public String play() {
		return (instrument != null) ? "OKAY LET'S GO ! " + this.instrument.play() : "??";
	}
	
	/*
	public AbstractInstrument getInstrument() {
		return this.instrument;
	}
	public void setIntrument(AbstractInstrument i) {
		this.instrument = i;
	}
	*/
	
	public String getState() {
		return "clean";
	}
}
