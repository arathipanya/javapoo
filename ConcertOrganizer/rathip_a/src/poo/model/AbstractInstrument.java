package poo.model;

abstract class AbstractInstrument {
	protected String				brand;
	protected String				typeOfInstrument;
	
	
	protected String play() {return null;}
	protected String playDrunk() {return null;}

	// GETTERS AND SETTERS
	protected String 				getBrand()					{return brand;}
	protected String 				getTypeOfInstrument()		{return typeOfInstrument;}
	
	protected void 				setBrand(String brand)				{this.brand = brand;}
	protected void 				setTypeOfInstrument(String t)		{this.typeOfInstrument = t;}
}
