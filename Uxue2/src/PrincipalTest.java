

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void test() {
		
		assertEquals(true,Principal.solicitarPermiso(20));
		assertEquals(false,Principal.solicitarPermiso(90));
		
		
		
	}

	
}
