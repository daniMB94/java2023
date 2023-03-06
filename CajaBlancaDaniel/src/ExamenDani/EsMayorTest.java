package ExamenDani;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsMayorTest {

	@Test
	void testMayor1() {
		
		int test = EsMayor.mayor(2, 1, 3);
		assertEquals(2, test);
	}

	
	@Test
	void testMayor2() {
		
		int test2 = EsMayor.mayor(10, 2, 3);
		assertEquals(3, test2);
	}
	
	@Test
	void testMayor3() {
		
		int test3 = EsMayor.mayor(1, 3, 2);
		assertEquals(3, test3);
	}
	
	@Test
	void testMayor4() {
		
		int test4 = EsMayor.mayor(1, 2, 3);
		assertEquals(3, test4);
	}
}
