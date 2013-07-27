package poo.model.state;

public enum EMusicianState {
	DRUNK(	"musician on stage", 	null),
	BORED(		"musician coming", 	DRUNK),
	HAPPY(	"member drunk", 	BORED);
	
	
	private EMusicianState 		nextStepState;
	private String 			state;
	
	private EMusicianState(String state, EMusicianState nextStepState) {
		this.state 			= state;
		this.nextStepState	= nextStepState;
	}
	
	public String getState()					{return state;}
	public EMusicianState getNextStepState()		{return nextStepState;}
	
	
}
