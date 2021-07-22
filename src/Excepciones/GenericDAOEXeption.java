package Excepciones;

public class GenericDAOEXeption extends Exception {

	private static final long serialVersionUID = 7402404243077053880L;
	
	public GenericDAOEXeption(String mesage,Throwable cause) {
		super(mesage,cause);	
	}
	
	public GenericDAOEXeption(String mesage) {
		super(mesage);
	}

	public String getMessage() {
		return "Error de coneccion";
	}

}
