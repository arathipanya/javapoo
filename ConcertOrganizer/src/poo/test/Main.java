package poo.test;

import poo.model.*;
import poo.model.state.ConcertStateMachine;
import poo.model.validation.ValidationException;

public class Main {

	public static void main(String[] args) {
		buildEntities();
	}

	private static void buildEntities() {
		Person p1 = new Person("Jonny", "Bgood", 42, "Brooklyn");
		Person p2 = new Person("Toto", "Lafayette", 31, "Paris");
		Person p3 = new Person("Murielle", "Jerk", 45, "Paris");
		Person p4 = new Person("Joey", "Jordisson", 34, "London");
		
		Musician m1 = new Musician(p1, "JonnyBG", new Guitar());
		Musician m2 = new Musician(p2, "TOTO", new Bass());
		Musician m3 = new Musician(p3, "Mimi Maty", new Voice());
		Musician m4 = new Musician(p4, "JJDrummer", null);

		Band b = new Band();
		b.setName("Band of fire");
		b.addMember(m1);
		b.addMember(m2);
		b.addMember(m3);
		b.addMember(m4);
		
		
		//Concert c 	= new Concert(null, b, "Paris");
		Concert c 	= new Concert(null, null, null);
	
		System.out.println(c.toString());
		System.out.println(c.getConcertState().toString());
		
		System.out.println("\r\nMain: try to make the concert to play...");
		
		try {
			ConcertStateMachine.changeStep(c);
			System.out.println(c.getConcertState().toString());
			System.out.println(c.playNow());
			}
		catch (ValidationException e) {System.out.println("Main: " + e.toString());}
		
		System.out.println(">>>>>> adding band....");
		c.setBand(b);
		
		try {
			ConcertStateMachine.changeStep(c);
			System.out.println(c.getConcertState().toString());
			System.out.println(c.playNow());
			}
		catch (ValidationException e) {System.out.println("Main: " + e.toString());}
		
		System.out.println(">>>>>> setting drum for JJDrumer....");
		m4.setInstrument(new Drum());
		
		try {
			ConcertStateMachine.changeStep(c);
			System.out.println(c.getConcertState().toString());
			System.out.println(c.playNow());
			}
		catch (ValidationException e) {System.out.println("Main: " + e.toString());}
		
		System.out.println(">>>>>> adding area....");
		c.setCity("Paris");
		
		System.out.println(c.toString());
		
		try {
			ConcertStateMachine.changeStep(c);
			System.out.println(c.getConcertState().toString());
			System.out.println(c.playNow());
			}
		catch (ValidationException e) {System.out.println("Main: " + e.toString());}
		
		System.out.println("Ow ! JonnyBG is drinking !!");
		m1.setMusicianState(new DRUNK(m1.getInstrument()));
		System.out.println(c.playNow());
	}

}
