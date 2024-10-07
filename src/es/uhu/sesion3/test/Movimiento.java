package es.uhu.sesion3.test;

public class Movimiento {
	public enum Signo{INGRESO, RETIRO};
	Signo signo;
	Double importe;
	String detalle;
	
	
	
	public Movimiento(Signo signo, Double importe, String detalle) {
		super();
		this.signo = signo;
		this.importe = importe;
		this.detalle = detalle;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Signo getSigno() {
		return signo;
	}
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	
}
