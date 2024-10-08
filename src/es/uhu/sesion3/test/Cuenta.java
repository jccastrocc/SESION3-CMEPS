package es.uhu.sesion3.test;

import java.util.ArrayList;
import java.util.List;

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
		String detalle="";
		//Scanner sc = new Scanner(System.in);
		
		//detalle = //sc.nextLine();
		
		movimientos.add(new Movimiento(Signo.INGRESO,d, detalle));
		this.saldo+=d;
		
	}


	public  void retirar(double importe) throws Exception {
		
		if(saldo-importe<-500) {
			
			throw new Exception("No hay fondos suficientes");
		}
		
		String detalle="";
		//Scanner sc = new Scanner(System.in);
		
		//detalle = sc.nextLine();
		
		movimientos.add(new Movimiento(Signo.RETIRO,importe, detalle));
		this.saldo-=importe;
		this.getSaldo();
	}

	
}
