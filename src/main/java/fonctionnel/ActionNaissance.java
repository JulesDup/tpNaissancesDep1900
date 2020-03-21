package fonctionnel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Naissance;

public class ActionNaissance {

	public static List<Naissance> naissanceByAnne(List<Naissance> listNaissance, String annee) {
		List<Naissance> listNaissanceByAnnee = listNaissance.stream()
				.filter(naissance -> naissance.getAnnee().equals(annee)).collect(Collectors.toList());

		return listNaissanceByAnnee;

	}

	public static int sommeNaissanceByAnnee(List<Naissance> listNaissance, String annee) {

		int nb = listNaissance.stream().filter(naissance -> naissance.getAnnee().equals(annee))
				.map(naissance -> naissance.getNombre()).reduce((n1, n2) -> n1 + n2).get();
		return nb;

	}

	public static double moyenneNaissanceByAnnee(List<Naissance> listNaissance, String annee) {
		double nb = listNaissance.stream().filter(naissance -> naissance.getAnnee().equals(annee))
				.mapToDouble(naissance -> naissance.getNombre()).average().orElse(Double.NaN);

		return nb;
	}
}
