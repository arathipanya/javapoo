package poo.model.state;

public enum EConcertState {
	CONCERT_FINISHED( 	"Concert finished", null),
	CONCERT_PLAYING(	"Concert playing", 	CONCERT_FINISHED),
	CONCERT_READY(		"Concert ready", 	CONCERT_PLAYING),
	CONCERT_WAITING(	"concert waiting", 	CONCERT_READY);
	
	
	private EConcertState 		nextStepState;
	private String 			state;
	
	private EConcertState(String state, EConcertState nextStepState) {
		this.state 			= state;
		this.nextStepState	= nextStepState;
	}
	
	public String getState()					{return state;}
	public EConcertState getNextStepState()		{return nextStepState;}
	
	
}
