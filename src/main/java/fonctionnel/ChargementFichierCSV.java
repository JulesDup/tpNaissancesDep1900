package fonctionnel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.*;

import entities.Naissance;

public class ChargementFichierCSV {

	/**
	 * Methode permettant de charger le fichier naissances_depuis_1900.csv et de
	 * reccuperer la liste de naissance
	 * 
	 * @return Une Liste de naissance
	 * @throws IOException
	 */
	public static List<Naissance> chargementFichier() throws Exception {
		String fileName = "C:/Temp/naissances_depuis_1900.csv";

		// Je cree un stream de toute mes ligne du csv
		Stream<String> lines = Files.lines(Paths.get(fileName));
		// je fais le mapping avec naissance et je l'ajoute dans une liste

		List<Naissance> listNaissances = lines.map(ln -> {
			String[] strings = ln.split(";");
			Naissance naissance = new Naissance();
			naissance.setType(strings[0]);
			naissance.setAnnee(strings[1]);
			naissance.setDateEvenement(strings[2]);
			naissance.setNombre(Integer.parseInt(strings[3]));

			// pour chaque ligne je return une instance de Naissance
			return naissance;
			// je cree ma list d'instance
		}).collect(Collectors.toList());
		return listNaissances;

	}

}
