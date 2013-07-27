package poo.model;

public class Voice extends AbstractInstrument {
	public Voice() {
		this.brand = "noBrand";
		this.typeOfInstrument = "wind instrument";
	}
	
	public Voice(String b, String t) {
		this.brand = b;
		this.typeOfInstrument = t;
	}
	
	public String toString() {return "singin";}
	public String play() {return "LALALAAA OYEAH";}
	public String playDrunk() {return "LaaAaaaLALaaAaAaaA......";}
}
