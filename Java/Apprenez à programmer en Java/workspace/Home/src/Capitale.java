
public class Capitale extends Ville {
	
	private String monument;
	
	//constructeur par défaut
	public Capitale() {
		
		super(); //Appelle le constructeur de la classe mère
		monument = "Inconnu";
	}
	//constructeur
	public Capitale(String nom, int nbre, String pays, String monument) throws NombreHabitantException, NomVilleException {
			super(nom,nbre,pays);
			this.monument = monument;
	}
	// Description de la capitale
	public String toString() { 
		return super.toString() + "\nSon monument est : " + this.monument;
	}
	//Accesseur
	public String getMonument() {
		return monument;
	}
	
	//Mutateur
	public void setMonument(String monument) {
		this.monument = monument;
	}
}