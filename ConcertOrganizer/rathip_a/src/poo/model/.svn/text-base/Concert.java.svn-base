package poo.model;

import java.util.Date;

import poo.model.state.EConcertState;
import poo.model.state.EMusicianState;
import poo.model.state.IConcertStateChangeable;
import poo.model.validation.ValidationException;
import poo.utils.DateHelper;


public class Concert implements IConcertStateChangeable {
	private Date				dateOfConcert;
	private Band				band;
	private String				city;

	private EConcertState		state;
	
	
	public Concert() {
		this.dateOfConcert = new Date();
	}
	
	public Concert(Date d, Band b, String c) {
		if (d == null)
			this.dateOfConcert = new Date();
		else
			this.dateOfConcert = d;
		this.band = b;
		this.city = c;
		this.state = EConcertState.CONCERT_READY;
	}
	
	public String playNow() {
		StringBuilder sb = new StringBuilder();
		
		if (band != null) {
			for (Musician i : band.getMembers())
				sb.append("\t" + i.play() + "\n");
		} else {
			sb.append("there's no band !");
		}

		return sb.toString();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Concert: \r\n"
				+ ((band != null)? 	"\nThe rock band : " + band.getName().toString() + "\n" : "")
				+ ((dateOfConcert != null)? 	"\nWhen ? on " + DateHelper.getStringDate(dateOfConcert) : "")
				+ ((city != null)? 	"\nWhere ? at " + city : ""));

		sb.append("\r\n");
		
		sb.append("Band presentation :\n");
		
		sb.append((band != null)? band.toString() : "No band");

		return sb.toString();
	}
	
	public void validate() throws ValidationException {
		if (dateOfConcert == null)
			throw new ValidationException("There is no date for the concert !!");
		if (band == null)
			throw new ValidationException("There is no band for playing !!");
		else
			band.validate();
		if (city == null)
			throw new ValidationException("There is no area for the concert !!");
	}
	
	
	// GETTERS AND SETTERS
	public Date 			getDateOfConcert()			{return dateOfConcert;}
	public Band 			getBand()					{return band;}
	public String			getCity()					{return city;}
	
	
	public void 			setDateOfConcert(Date dateOfConcert)	{this.dateOfConcert = dateOfConcert;}
	public void 			setBand(Band band)						{this.band = band;}
	public void				setCity(String city)					{this.city = city;}

	@Override
	public EConcertState getConcertState() {
		return state;
	}

	@Override
	public void setConcertState(EConcertState state) {
		this.state = state;
	}
}
