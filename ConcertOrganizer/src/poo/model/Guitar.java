package poo.model;

public class Guitar extends AbstractInstrument {
	public Guitar() {
		this.brand = "noBrand";
		this.typeOfInstrument = "picked cords";
	}
	
	public Guitar(String b, String t) {
		this.brand = b;
		this.typeOfInstrument = t;
	}
	
	public String toString() {return "guitar";}
	public String play() {return "DING DING OUUUIINNN DING";}
	public String playDrunk() {return "DiiiING.... DIiii...NG.. OUUUI...I.NNN";}
}
