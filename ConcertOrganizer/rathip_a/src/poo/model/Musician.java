package poo.model;

import poo.model.state.IMusicianStateChangeable;
import poo.model.validation.IValidable;
import poo.model.validation.ValidationException;

public class Musician implements IValidable {
	private Person				artist;
	private String				nickname;
	private AbstractInstrument	instrument;
	
	private IMusicianStateChangeable	state;
	
	
	public Musician() {
		this.nickname = "noNickname";
		this.state = new CLEAN(null);
	}
	
	public Musician(Person p, String n, AbstractInstrument i) {
		if (n == null)
			this.nickname = "noNickname";
		else
			this.nickname = n;
		this.artist = p;
		this.instrument = i;
		this.state = new CLEAN(i);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (artist != null && instrument != null && nickname != null)
			sb.append(artist.getFirstname() + " " + artist.getLastname() + " alias " + nickname + " playing " + instrument.toString() + "\n");
		else
			sb.append("A musician not ready");
		return sb.toString();
	}
	/*
	public String play() {
		StringBuilder sb = new StringBuilder();
		if (instrument != null)
			sb.append("OKAAY LETS GO !!\n\t" + instrument.play());
		return sb.toString();
	}
	*/
	public String play() {
		return (state != null)? state.play() : "lost...";
	}
	
	// GETTERS AND SETTER
	public String 				getNickname()					{return nickname;}
	public Person				getArtist()						{return artist;}
	public AbstractInstrument	getInstrument()					{return instrument;}
	
	public IMusicianStateChangeable		getMusicianState()						{return state;}
	
	
	public void 				setNickname(String nickname)		{this.nickname = nickname;}
	public void					setPerson(Person p)					{this.artist = p;}
	
	public void setInstrument(AbstractInstrument i)	{
		this.instrument = i;
		this.state = new CLEAN(i);
	}
	
	public void					setMusicianState(IMusicianStateChangeable state)	{this.state = state;}

	@Override
	public void validate() throws ValidationException {
		if (instrument == null)
			throw new ValidationException(nickname + " has no instrument !!");
		if (artist == null)
			throw new ValidationException("There is nobody to play this " + instrument.toString() + " instrument !!");
	}
}
