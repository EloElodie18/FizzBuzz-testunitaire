import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUnitaire1 { /*je fais des tests séparés pour voir si chacunes des conditions fonctionnent*/

	@Test
	void testCheck() {/*je test en lui donnant entre parenthese (le resulat attendu, nom de la classe.lenomdelafonction(un chiffre a tester donc le FB) */
		assertEquals("Fizz", FizzBuzz.check(3));
	}

}
