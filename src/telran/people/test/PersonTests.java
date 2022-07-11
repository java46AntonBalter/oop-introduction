package telran.people.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.people.*;

class PersonTests {

	@Test
	void personTest() {
		long id = 977846;
		int birthYear = 1983;
		String email = "vasya@pupkin.com";
		Person vasyaPupkin = new Person(id, birthYear, email);
		assertEquals(id, vasyaPupkin.getId());
		assertEquals(birthYear, vasyaPupkin.getBirthYear());
		assertEquals(email, vasyaPupkin.getEmail());
		id = 777777;
		birthYear = 2002;
		email = "pupkin@vasya.net";
		vasyaPupkin.setId(id);
		vasyaPupkin.setBirthYear(birthYear);
		vasyaPupkin.setEmail(email);
		assertEquals(id, vasyaPupkin.getId());
		assertEquals(birthYear, vasyaPupkin.getBirthYear());
		assertEquals(email, vasyaPupkin.getEmail());
	}
	@Test
	void employeeTest() {
		long id = 977846;
		int birthYear = 1983;
		String email = "vasya@pupkin.com";
		int basicSalary = 7000;
		Employee vasyaPupkin = new Employee(id, birthYear, email, basicSalary);
		assertEquals(id, vasyaPupkin.getId());
		assertEquals(birthYear, vasyaPupkin.getBirthYear());
		assertEquals(email, vasyaPupkin.getEmail());
		assertEquals(basicSalary, vasyaPupkin.computePay());
		
	}
	@Test
	void wageEmployeeTest() {
		long id = 977846;
		int birthYear = 1983;
		String email = "vasya@pupkin.com";
		int basicSalary = 7000;
		int wage = 50;
		int hours = 20;
		WageEmployee vasyaPupkin = new WageEmployee(id, birthYear, email, basicSalary, wage, hours);
		assertEquals(id, vasyaPupkin.getId());
		assertEquals(birthYear, vasyaPupkin.getBirthYear());
		assertEquals(email, vasyaPupkin.getEmail());
		assertEquals(8000, vasyaPupkin.computePay());
		
	}
	
	@Test
	void salesPersonTest() {
		long id = 977846;
		int birthYear = 1983;
		String email = "vasya@pupkin.com";
		int basicSalary = 7000;
		int sales = 1000000;
		int percent = 1;
		SalesPerson vasyaPupkin = new SalesPerson(id, birthYear, email, basicSalary, sales, percent);
		assertEquals(id, vasyaPupkin.getId());
		assertEquals(birthYear, vasyaPupkin.getBirthYear());
		assertEquals(email, vasyaPupkin.getEmail());
		assertEquals(17000, vasyaPupkin.computePay());
		
	}

}
