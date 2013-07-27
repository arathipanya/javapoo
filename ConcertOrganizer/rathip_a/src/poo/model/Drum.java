package poo.model;

public class Drum extends AbstractInstrument {
	public Drum() {
		this.brand = "noBrand";
		this.typeOfInstrument = "percussions";
	}
	
	public Drum(String b, String t) {
		this.brand = b;
		this.typeOfInstrument = t;
	}
	
	public String toString() {return "drum";}
	public String play() {return "CHTAK OUU CHTAK TOUDOUM";}
	public String playDrunk() {return "CHhhhhTAaaaaaaK...... OooUUuuuuu....";}
}
