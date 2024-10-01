package ej;

public class PorteVerrouilleException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String getErrorMessage()
	{
		return ("La porte est déjà vérrouillée.");
	}
	
}
