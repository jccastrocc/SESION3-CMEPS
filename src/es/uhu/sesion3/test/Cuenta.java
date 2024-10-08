package es.uhu.sesion3.test;

import java.util.ArrayList;
import java.util.List;

import es.uhu.sesion3.exception.FondosInsuficientesException;
import es.uhu.sesion3.test.Movimiento.Signo;

public class Cuenta {

	private Double saldo;
	String numero;
	String titular;
	List<Movimiento> movimientos;

	public Cuenta(Double saldo, String numero, String titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
		this.movimientos = new ArrayList<>();
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {

		return this.saldo;
	}

	public void ingresar(double d) {
		String detalle = "";
		// Scanner sc = new Scanner(System.in);

		// detalle = //sc.nextLine();

		movimientos.add(new Movimiento(Signo.INGRESO, d, detalle));
		this.saldo += d;

	}

	public void retirar(double importe) throws Exception {

		if (saldo - importe < -500) {

			throw new FondosInsuficientesException("ERROR: No hay fondos suficientes para hacer un reintegro de " + importe
					+ " para la cuenta " + this.numero + " el saldo actual es: " + this.getSaldo());
		}

		String detalle = "";
		// Scanner sc = new Scanner(System.in);

		// detalle = sc.nextLine();

		movimientos.add(new Movimiento(Signo.RETIRO, importe, detalle));
		this.saldo -= importe;
		this.getSaldo();
	}

}
