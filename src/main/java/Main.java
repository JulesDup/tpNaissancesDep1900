import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Naissance;
import fonctionnel.ActionNaissance;
import fonctionnel.ChargementFichierCSV;

public class Main {

	/**
	 * 1 ) Créer une classe Naissance ANNEE Long DateEvenement Date Nombre Long
	 * 
	 * 2 ) Charger le contenu du fichier Dans une Liste de type Naissance
	 * 
	 * 3 ) Afficher toute les données selon l'année 1900
	 * 
	 * 4 ) Afficher la somme correspondant à l'année 1900 -Nombre
	 * 
	 * 5 ) Afficher la moyenne correspondant à l'année 1971 - Nombre
	 */
	public static void main(String[] args) {
		List<Naissance> listNaissance = new ArrayList<Naissance>();
		System.out.println("------------------------exo 2-----------------------");
		try {
			// création de la liste de naissance
			listNaissance = ChargementFichierCSV.chargementFichier();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Naissance courante : listNaissance) {
			System.out.println(courante);
		}

		System.out.println("------------------------exo 3-----------------------");
		List<Naissance> listNaissanceByAnnee = new ArrayList<Naissance>();
		listNaissanceByAnnee = ActionNaissance.naissanceByAnne(listNaissance, "1900");

		for (Naissance courante : listNaissanceByAnnee) {
			System.out.println(courante);
		}

		System.out.println("------------------------exo 4-----------------------");
		String annee = "1900";
		int sommeNaissanceFor1900 = 0;
		sommeNaissanceFor1900 = ActionNaissance.sommeNaissanceByAnnee(listNaissance, annee);
		System.out.println("Nombre Naissance pour l'anne" + annee + " = " + sommeNaissanceFor1900);

		System.out.println("------------------------exo 5-----------------------");
		String annee2 = "1971";
		double moyenneNaissanceFor1971 = 0;
		moyenneNaissanceFor1971 = ActionNaissance.moyenneNaissanceByAnnee(listNaissance, annee2);
		System.out.println(moyenneNaissanceFor1971);
	}
}
