package Excepciones;

public class DuplicatedException extends Exception {

	private static final long serialVersionUID = -3059837215339683170L;
	
	
	public DuplicatedException(String message, Throwable cause) {
		
		super(message,cause);
		
	}
	
	
	public DuplicatedException(String message) {
		super(message);
	}

	public String getMessage() {
		return"El Elemento ya existe";
	}
}
