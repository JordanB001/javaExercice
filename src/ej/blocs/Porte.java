package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteVerrouilleException;

public class Porte extends Bloc {
	
	private boolean Lock;
	
	public Porte(final int longueur, final int largeur, final int hauteur, final boolean Lock) throws IllegalBlocException
	{
		super(longueur, largeur, hauteur);
		this.Lock = Lock;
		this.color = Color.BLEU;
	}
	
	public boolean isLock()
	{
		if(this.Lock == true) return true;
		else return false;
	}
	
		public void verrouiller() throws PorteVerrouilleException
		{
			if(!this.Lock) this.Lock = true;
			else throw new PorteVerrouilleException();
			
		}
	
	public void afficherDescription()
	{
		System.out.println("Bloc Porte");
	}
	
}
