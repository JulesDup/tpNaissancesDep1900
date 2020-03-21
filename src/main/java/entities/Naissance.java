package entities;

public class Naissance {
	private String type;
	private String annee;
	private String dateEvenement;
	private int nombre;

	public Naissance(String type, String annee, String dateEvenement, int nombre) {
		super();
		this.type = type;
		this.annee = annee;
		this.dateEvenement = dateEvenement;
		this.nombre = nombre;
	}

	public Naissance() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Getter
	 * 
	 * @return the annee
	 */
	public String getAnnee() {
		return annee;
	}

	/**
	 * Getter
	 * 
	 * @return the dateEvenement
	 */
	public String getDateEvenement() {
		return dateEvenement;
	}

	/**
	 * Getter
	 * 
	 * @return the nombre
	 */
	public int getNombre() {
		return nombre;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Setter
	 * 
	 * @param annee the annee to set
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}

	/**
	 * Setter
	 * 
	 * @param dateEvenement the dateEvenement to set
	 */
	public void setDateEvenement(String dateEvenement) {
		this.dateEvenement = dateEvenement;
	}

	/**
	 * Setter
	 * 
	 * @param strings the nombre to set
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	/**
	 * Implémentation de la methode toString
	 *
	 */
	@Override
	public String toString() {
		return "Naissance [type=" + type + ", annee=" + annee + ", dateEvenement=" + dateEvenement + ", nombre="
				+ nombre + "]";
	}

}
