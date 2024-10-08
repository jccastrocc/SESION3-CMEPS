package es.uhu.sesion3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)//Con esto podemos controlar el orden de ejecucion
class CuentaTest {

	private static Cuenta cuenta;
	private static Cuenta cuenta12345;
	private static Cuenta cuenta67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.out.println(" ******* Inicio de instrucciones********");
		System.out.println();
		// Inicializacion 1
		cuenta12345 = new Cuenta(50d, "12345", "Juan");
		// Inicializacion 2
		cuenta67890 = new Cuenta(0d, "67890", "Pedro");
		
		System.out.println("Saldo inicial de la cuenta 12345: "+cuenta12345.getSaldo());
		System.out.println("Saldo inicial de la cuenta 67890: "+cuenta67890.getSaldo());
		
		

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
		assertEquals("ERROR: No hay fondos suficientes para hacer un reintegro de " + 501d
				+ " para la cuenta " + cuenta.numero + " el saldo actual es: " + cuenta.getSaldo(), exception.getMessage());
	}
	
	//Se deciden separar en lugar de meterlos todos en un test y ejecutar de manera secuencial
	
	// Instrucción 1
    @Test
    public void instruccion1_Reintegro200Cuenta12345() throws Exception {
        double saldoInicial = cuenta12345.getSaldo();
        double cantidadReintegro = 200;

        cuenta12345.retirar(cantidadReintegro);

        assertEquals(saldoInicial - cantidadReintegro, cuenta12345.getSaldo(), 0);
        System.out.println("Instrucción 1. Reintegro 200 en cuenta12345. Saldo: " + cuenta12345.getSaldo());
    }

    // Instrucción 2
    @Test
    public void instruccion2_Reintegro350Cuenta67890() throws Exception {
        double saldoInicial = cuenta67890.getSaldo();
        double cantidadReintegro = 350;

        cuenta67890.retirar(cantidadReintegro);

        assertEquals(saldoInicial - cantidadReintegro, cuenta67890.getSaldo(), 0);
        System.out.println("Instrucción 2. Reintegro 350 en cuenta67890. Saldo: " + cuenta67890.getSaldo());
    }

    // Instrucción 3
    @Test
    public void instruccion3_Ingreso100Cuenta12345() throws Exception {
        double saldoInicial = cuenta12345.getSaldo();
        double cantidadIngreso = 100;

        cuenta12345.ingresar(cantidadIngreso);

        assertEquals(saldoInicial + cantidadIngreso, cuenta12345.getSaldo(), 0);
        System.out.println("Instrucción 3. Ingreso 100 en cuenta12345. Saldo: " + cuenta12345.getSaldo());
    }

    // Instrucción 4
    @Test
    public void instruccion4_Reintegro200Cuenta67890() {
        double cantidadReintegro = 200;

        System.out.println("Instrucción 4. Intento reintegro 200 en cuenta67890. Saldo antes de intento: " + cuenta67890.getSaldo());

        Exception exception = assertThrows(Exception.class, () -> {
            cuenta67890.retirar(cantidadReintegro);
        });
        assertEquals("ERROR: No hay fondos suficientes para hacer un reintegro de " + cantidadReintegro
				+ " para la cuenta " + cuenta67890.numero + " el saldo actual es: " + cuenta67890.getSaldo(), exception.getMessage());
    }

    // Instrucción 5
    @Test
    public void instruccion5_Reintegro150Cuenta67890() throws Exception {
        double saldoInicial = cuenta67890.getSaldo();
        double cantidadReintegro = 150;

        cuenta67890.retirar(cantidadReintegro);

        assertEquals(saldoInicial - cantidadReintegro, cuenta67890.getSaldo(), 0);
        System.out.println("Instrucción 5. Reintegro 150 en cuenta67890. Saldo: " + cuenta67890.getSaldo());
    }

    // Instrucción 6
    @Test
    public void instruccion6_Reintegro200Cuenta12345() throws Exception {
        double saldoInicial = cuenta12345.getSaldo();
        double cantidadReintegro = 200;

        cuenta12345.retirar(cantidadReintegro);

        assertEquals(saldoInicial - cantidadReintegro, cuenta12345.getSaldo(), 0);
        System.out.println("Instrucción 6. Reintegro 200 en cuenta12345. Saldo: " + cuenta12345.getSaldo());
    }

    // Instrucción 7
    @Test
    public void instruccion7_Ingreso50Cuenta67890() throws Exception {
        double saldoInicial = cuenta67890.getSaldo();
        double cantidadIngreso = 50;

        cuenta67890.ingresar(cantidadIngreso);

        assertEquals(saldoInicial + cantidadIngreso, cuenta67890.getSaldo(), 0);
        System.out.println("Instrucción 7. Ingreso 50 en cuenta67890. Saldo: " + cuenta67890.getSaldo());
    }

    // Instrucción 8
    @Test
    public void instruccion8_Reintegro100Cuenta67890() {
        double cantidadReintegro = 100;

        System.out.println("Instrucción 8. Intento reintegro 100 en cuenta67890. Saldo antes de intento: " + cuenta67890.getSaldo());

        Exception exception = assertThrows(Exception.class, () -> {
            cuenta67890.retirar(cantidadReintegro);
        });
        assertEquals("ERROR: No hay fondos suficientes para hacer un reintegro de " + cantidadReintegro
				+ " para la cuenta " + cuenta67890.numero + " el saldo actual es: " + cuenta67890.getSaldo(), exception.getMessage());
    
        System.out.println();
        System.out.println(" ******* Fin de instrucciones ********");
		System.out.println();
    
    }
}
