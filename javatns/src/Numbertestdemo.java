import static org.junit.jupiter.api.Assertions.assertEquals;

public class Numbertestdemo {
	
	void factorialtest() {
		
		int exp=120;
		int act=Numberfunction.getfactorial(5);
		assertEquals(exp,act);
		
		//System.out.println(Numberfunction.getfactorial(act));
	}
	

}
