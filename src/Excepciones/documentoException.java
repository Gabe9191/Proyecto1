package Excepciones;

public class documentoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5159536439248929841L;


	public documentoException(String mensaje ) {
		super(mensaje);
		
	}
	
	public documentoException() {
		super();
	}
	
	
	public String getMessage() {
		return "ERROR intente nuevamente";
	}

}
