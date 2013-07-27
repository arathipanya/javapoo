package poo.model.state;

public enum EBandState {
	BAND_PLAYING(	"band playing", 	null),
	BAND_READY(		"band ready", 	BAND_PLAYING),
	BAND_GROUPING(	"band grouping", 	BAND_READY);
	
	
	private EBandState 		nextStepState;
	private String 			state;
	
	private EBandState(String state, EBandState nextStepState) {
		this.state 			= state;
		this.nextStepState	= nextStepState;
	}
	
	public String getState()					{return state;}
	public EBandState getNextStepState()		{return nextStepState;}
	
	
}
