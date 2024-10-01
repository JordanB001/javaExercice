package ej;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;

public class Kit {
	
	private List<IBloc> listeBlocs = new ArrayList<IBloc>();
	private Set<String> listeMotsCles = new LinkedHashSet<String>();
	
	
	public Kit() throws IllegalBlocException
	{
		listeBlocs.add(new Mur(3, 2, 2, true));
		listeBlocs.add(new Mur(3, 2, 2, true));
		listeBlocs.add(new Mur(2, 1, 2, false));
		listeBlocs.add(new Mur(2, 1, 2, false));
		listeBlocs.add(new Porte(1, 2, 2, false));
		
		listeMotsCles.add("Cabane");
		listeMotsCles.add("Muraille");
	}
	
	public void afficherKit()
	{
		System.out.println("Nombre de bloc dans le kit : " + this.listeBlocs.size());
		System.out.print("Liste de mots clés du kit : ");
		for(String motsCles : listeMotsCles)
		{
			System.out.print(motsCles + " ");
		}
				
	}
	
	
}
