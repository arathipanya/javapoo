package poo.model;

public class Person {
	private String				firstname;
	private String				lastname;
	private Integer				age;
	private String				city;
	
	
	public Person() {
		this.firstname = "noFirstname";
		this.lastname = "noLastname";
		this.age = 0;
		this.city = "SDF";
	}
	
	public Person(String f, String l, Integer a, String c) {
		this.firstname = f;
		this.lastname = l;
		this.age = a;
		this.city = c;
	}
	
	// GETTERS AND SETTERS
	public String 				getFirstname()					{return firstname;}
	public String 				getLastname()					{return lastname;}
	public String 				getCity()						{return city;}
	public Integer				getAge()						{return age;}
	
	public void 				setFistname(String firstname)		{this.firstname = firstname;}
	public void 				setLastname(String lastname)		{this.lastname = lastname;}
	public void 				setCity(String city)				{this.city = city;}
	public void 				setAge(Integer age)					{this.age = age;}
}
