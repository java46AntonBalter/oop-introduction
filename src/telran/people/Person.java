package telran.people;

public class Person {
	private long id;
	private int birthYear;
	private String email;

	public Person(long id, int birthYear, String email) {
		setEmail(email);
		this.id = id;
		this.birthYear = birthYear;
	}
	public void setEmail(String email) {
		this.email = email;		
	}
	
	public String getEmail() {
		return email;		
	}
	public long getId() {
		return id;
	}
	public int getBirthYear() {
		return birthYear;
	}
}
