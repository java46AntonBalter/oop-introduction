package telran.people;

public class Person {
	private long id;
	private int birthYear;
	private String email;

	public Person(long id, int birthYear, String email) {
		setEmail(email);
		setId(id);
		setBirthYear(birthYear);
	}
	public void setEmail(String email) {
		this.email = email;		
	}
	public void setId(long id) {
		this.id = id;		
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;		
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
