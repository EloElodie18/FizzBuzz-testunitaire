import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUnitaire4 { /*pour tester les 3 possibilités d'un coup*/

	@Test
	void testCheck() {
		assertEquals("Fizz", FizzBuzz.check(3));
	}
	
	@Test
	void testCheck2() {
		assertEquals("Buzz", FizzBuzz.check(5));
	}
	
	@Test
	void testCheck3() {
		assertEquals("FizzBuzz", FizzBuzz.check(0));
	}
}
