package ej;

public class IllegalBlocException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public String getErrorMessage()
	{
		return ("Impossible de construire le bloc.");
	}
	
	
	
}
