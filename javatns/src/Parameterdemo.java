import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterdemo {
	
	@ParameterizedTest
	@ValueSource(strings = {"cali","bali","suri"})
	
	void endawithI(String str) {
		assertTrue(str.endsWith("i"));
	}

}
