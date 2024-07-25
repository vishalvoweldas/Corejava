import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumptiondemo {
	@Test
	void testonassume() {
		int a=5,v=25;
		Assumptions.assumeTrue(v==a*a);
		System.out.println("it will display");
	}

}
