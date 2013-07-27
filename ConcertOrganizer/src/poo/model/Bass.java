package poo.model;

public class Bass extends AbstractInstrument {
	public Bass() {
		this.brand = "noBrand";
		this.typeOfInstrument = "picked cords";
	}
	
	public Bass(String b, String t) {
		this.brand = b;
		this.typeOfInstrument = t;
	}
	
	public String toString() {return "bass guitar";}
	public String play() {return "DOUM DOUM DOUM DOUM";};
	public String playDrunk() {return "DOuuuuUM.... DuoooooOUmmMmmm......";};
}
