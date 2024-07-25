import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class testassumption {
	
	@Test
	void testassumption() {
		int a=20, b=20;
		Assumptions.assumingThat(a==b, ()-> {System.out.println("test");});
		
	}

}
