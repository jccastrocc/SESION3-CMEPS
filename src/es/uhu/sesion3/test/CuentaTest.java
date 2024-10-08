package es.uhu.sesion3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	private static Cuenta cuenta;
	private static Cuenta cuenta12345;
	private static Cuenta cuenta67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		// Inicializacion 1
		cuenta12345 = new Cuenta(50d, "12345", "Juan");
		// Inicializacion 2
		cuenta67890 = new Cuenta(0d, "67890", "Pedro");
		
		System.out.println("Saldo inicial de la cuenta 12345:"+cuenta12345.getSaldo());
		System.out.println("Saldo inicial de la cuenta 67890:"+cuenta67890.getSaldo());
		
		

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0d, "num cuenta", "Antonio");

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500);
		assertEquals(500, cuenta.getSaldo());
	}

	@Test
	void testRetirar() throws Exception {

		cuenta.retirar(500);
		assertEquals(-500, cuenta.getSaldo());
	}

	@Test
	void testRetirarSinFondos() {

		Exception exception = assertThrows(Exception.class, () -> {
			cuenta.retirar(501);

		});
		assertEquals("No hay fondos suficientes", exception.getMessage());
	}

	// Instruccion 1
	@Test
	void reintegro200Cuenta12345() throws Exception {
		double saldoInicial = cuenta12345.getSaldo();
		double cantidadReintegro = 200;

		cuenta12345.retirar(cantidadReintegro);

		assertEquals(saldoInicial - cantidadReintegro, cuenta12345.getSaldo());

		System.out.println("Intruccion 1. Reintegro 200 en cuenta12345. Saldo: "+cuenta12345.getSaldo());
	}

	// Instruccion 2
	@Test
	void reintegro350Cuenta67890() throws Exception {
		
		double saldoInicial = cuenta67890.getSaldo();
		double cantidadReintegro = 350;

		cuenta67890.retirar(cantidadReintegro);

		assertEquals(saldoInicial - cantidadReintegro, cuenta67890.getSaldo());

		System.out.println("Intruccion 2. Reintegro 350 en cuenta67890. Saldo: "+cuenta67890.getSaldo());
		
		
	}

	// Instruccion 3
	@Test
	void ingreso100Cuenta12345() throws Exception {
		double saldoInicial = cuenta12345.getSaldo();
		double cantidadIngreso = 100;

		cuenta12345.ingresar(cantidadIngreso);

		assertEquals(saldoInicial + cantidadIngreso, cuenta12345.getSaldo());

		System.out.println("Intruccion 3. Ingreso 350 en cuenta12345. Saldo: "+cuenta12345.getSaldo());
		
	}

	// Instruccion 4
		@Test
		void reintegro200Cuenta67890() {
		
			double cantidadReintegro = 200;

			System.out.println("Intruccion 4. Intento reintegro 200 en cuenta67890. Saldo: "+cuenta67890.getSaldo());
			
			Exception exception = assertThrows(Exception.class, () -> {
				cuenta67890.retirar(cantidadReintegro);

			});
			assertEquals("No hay fondos suficientes", exception.getMessage());
			
		}
}
