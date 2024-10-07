package es.uhu.sesion3.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


	public  Double getSaldo() {
		
		return this.saldo;
	}

	public  void ingresar(double d) {
		String detalle;
		Scanner sc = new Scanner(System.in);
		
		detalle = sc.nextLine();
		
		movimientos.add(new Movimiento(Signo.D,d, detalle));
		this.saldo+=d;
		
	}


	public  void retirar(double d) {
		String detalle;
		Scanner sc = new Scanner(System.in);
		
		detalle = sc.nextLine();
		
		movimientos.add(new Movimiento(Signo.H,d, detalle));
		this.saldo-=d;
	}

	
}
