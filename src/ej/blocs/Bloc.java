package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.IllegalBlocException;

public abstract class Bloc implements IBloc{
	
	protected int longueur;
	protected int largeur;
	protected int hauteur;
	protected Color color;
	
	private static Logger logger = LogManager.getLogger(Bloc.class);
	
	public Bloc(final int longueur,final int largeur,final int hauteur) throws IllegalBlocException
	{
		if (longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTER) throw new IllegalBlocException();
		
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		
		logger.info(this.getClass().getSimpleName());
		
	}
	
	public void setColor(Color couleurChoice)
	{
		this.color = couleurChoice;
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	
	public int getLongueur()
	{
		return this.longueur;
	}
	
	public int getLargeur()
	{
		return this.largeur;
	}
	
	public int getHauteur()
	{
		return this.hauteur;
	}
	
	
}
