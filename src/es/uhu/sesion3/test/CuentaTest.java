package es.uhu.sesion3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	//DOuble saldo;
	//ingresar(double)
	//returar(double)

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
		Cuenta.ingresar(500d);
		assertEquals(500,Cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		Cuenta.retirar(500d);
		assertEquals(-500,Cuenta.getSaldo());
	}
}
