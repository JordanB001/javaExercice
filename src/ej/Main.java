package ej;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.Mur;
import ej.blocs.Porte;

public class Main {
	
	private static Logger loggerException = LogManager.getLogger(Main.class);

	public static void main(String[] args)
	{
		
		try {
			Mur mur = new Mur(1,2,3, true);
			Porte porte = new Porte(1, 1, 1, true);
			
			
			porte.verrouiller();
			
			
		} catch (IllegalBlocException exception) {
			loggerException.error(exception.getErrorMessage());
		} catch (PorteVerrouilleException exception) {
			loggerException.error(exception.getErrorMessage());
		}

		
		
	}

}
