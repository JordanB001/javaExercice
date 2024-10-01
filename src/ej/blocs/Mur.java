package ej.blocs;

import ej.IllegalBlocException;

public class Mur extends Bloc
{
	private boolean porteur;
	
	public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) throws IllegalBlocException
	{
		super(longueur, largeur, hauteur);
		this.porteur = porteur;
		this.color = Color.GRIS;
	}

	public boolean estTraversable()
	{
		if(this.porteur == true) return false;
		else return true;
	}
	
	public void afficherDescription()
	{
		System.out.println("Bloc Mur");
	}
	
}
