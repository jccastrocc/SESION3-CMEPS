package es.uhu.sesion3.test;

public class Cuenta {
	
	private Double saldo;
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public  Double getSaldo() {
		
		return this.saldo;
	}

	public  void ingresar(double d) {
		this.saldo+=d;
		
	}


	public  void retirar(double d) {
		
		this.saldo-=d;
	}

	
}
