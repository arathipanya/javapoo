package poo.model;

import java.util.ArrayList;
import java.util.List;

import poo.model.validation.ValidationException;

public class Band {
	private List<Musician> 		members 		= new ArrayList<Musician>();
	private String				name;


	public Band() {
		this.name = "noName";
	}
	
	public Band(List<Musician> m, String n) {
		if (name == null)
			this.name = "noName";
		else
			this.name = n;
		this.members = m;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<" + name + "> :\n");
		
		for (Musician i : members)
			sb.append("\r\n\t" + i.toString());

		return sb.toString();
	}
	
	public void validate() throws ValidationException {
		if (members == null)
			throw new ValidationException("There is no members to play ! !!");
		else {
			for (Musician i : members)
				i.validate();
		}
			
	}
	
	// GETTERS AND SETTERS
	public List<Musician> 		getMembers()				{return members;}
	public String 				getName()					{return name;}
	
	
	public void 				addMember(Musician member)	{this.members.add(member);}
	public void 				delMember(Musician member)	{this.members.remove(member);}
	public void 				setName(String name)		{this.name = name;}
}
