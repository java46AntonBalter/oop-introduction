package telran.text.test;

import static org.junit.jupiter.api.Assertions.*;

import telran.text.*;

import org.junit.jupiter.api.Test;

class StringsTest {
	@Test
	void testSortStringsAsDates() {
		String[] input = new String[] {"21/7/1983", "25/6/2012", "1/3/2000", "15/12/1650", "15/2/1983", "4/6/2012"};
		String[] expected = new String[] {"15/12/1650", "15/2/1983", "21/7/1983", "1/3/2000", "4/6/2012", "25/6/2012"};
		assertArrayEquals(expected, Strings.sortStringsAsDates(input));				
	}
	
	@Test
	void wrongDateTest() {
		String[] input = new String[] {"1/2/3/4", "25/6/2012", "1/3/2000", "15/12/1650", "15/2/1983", "4/6/2012"};
		boolean flException = false;
		try {
			Strings.sortStringsAsDates(input);
		} catch (IllegalArgumentException e) {
			flException = true;
			System.out.println(e.getMessage());
		}
		assertTrue(flException);
	}

}