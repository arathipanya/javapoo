package poo.model.state;

import poo.model.validation.IValidable;

public interface IBandStateChangeable extends IValidable
{
	public EBandState getBandState();

	public void setBandState(EBandState state);
	
}