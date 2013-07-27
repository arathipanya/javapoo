package poo.model.state;

import poo.model.validation.ValidationException;

public class ConcertStateMachine {
	public static void changeStep(IConcertStateChangeable concert) throws ValidationException
	{
		//can call the IValidable interface validate() method, because IValidable extends IStateChangeable
		//any IStateChangeable reference is also a IValidable instance.
		concert.validate();
		
		concert.setConcertState(concert.getConcertState().getNextStepState());
	}
}
