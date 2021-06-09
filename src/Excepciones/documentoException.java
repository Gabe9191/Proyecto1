package Excepciones;

public class documentoException extends Exception{
	
	public documentoException(String mensaje ) {
		super(mensaje);
		
	}
	
	public documentoException() {
		super();
	}
	
	
	public String getMessage() {
		return "ERROR";
	}

}
