package es.uhu.sesion3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	private static Cuenta cuenta12345;
	private static Cuenta cuenta67890;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345 = new Cuenta(50d, "12345", "Juan");
		cuenta67890 = new Cuenta(0d,"67890","Pedro");
		
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500);
		assertEquals(500,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() throws Exception {
		
		cuenta.retirar(500);
		assertEquals(-500,cuenta.getSaldo());
	}
	
	@Test
	void testRetirarSinFondos() {
	     
		 Exception exception = assertThrows(Exception.class, () -> {
	            cuenta.retirar(501);
	            
	        });
	        assertEquals("No hay fondos suficientes", exception.getMessage());
	}

	
	
}
