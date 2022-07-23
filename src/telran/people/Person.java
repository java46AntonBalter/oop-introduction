package telran.people;

public class Person implements Comparable<Person> {
	private long id;
	private int birthYear;
	private String email;

	public Person(long id, int birthYear, String email) {
		this.id = id;
		this.birthYear = birthYear;
		setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null) {
			if (!email.matches("^[A-Za-z0-9_\\.-]+@[A-Za-z\\.-]+$")) {
				throw new IllegalArgumentException(String.format("%s - wrong email.\n"
						+ "part before @ may contain any ascii letters, any digits, dot (.) or dash(-) or underscore(_)\n"
						+ "Second part may contain any ascii letter dot(.) or dash(-)", email));

			}
		}
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public int getBirthYear() {
		return birthYear;
	}

	@Override
	public int compareTo(Person o) {

		return Long.compare(this.id, o.id);
	}

}
