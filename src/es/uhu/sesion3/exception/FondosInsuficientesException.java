package es.uhu.sesion3.exception;

public class FondosInsuficientesException extends Exception {
    
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
        System.out.println(mensaje); // Muestra el mensaje en la consola
    }
}