
public class Ville {
	//Conteur de ville
	protected static int compteur;
	// Nom de la ville
	protected String nomVille;
	// Nombre d'habitants
	protected int nbrHabitants;
	// Nom du pays
	protected String nomPays;
	// Catégorie en fonction du nombre d'habitants
	protected char categorie;
	
	//Constructeur par défaut
	public Ville() {
		System.out.println("Creation d'une ville! ");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbrHabitants = 0;
		compteur++;
		}
	
	//Ville personnalisée
	public Ville(String pNom, int pNbre, String pPays) throws  NombreHabitantException, NomVilleException
		{
			if(pNbre < 0)
				throw new NombreHabitantException(pNbre);
			if(pNom.length() <3)
				throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
			else 
			{
				System.out.println("Creation d'une ville perso! ");
				nomVille = pNom;
				nomPays = pPays;
				nbrHabitants = pNbre;
				this.setCategorie();
				compteur++;
			}
		}
	
	
	// Accesseurs
	public int getCompteur() {
		return compteur;
	}
	public String getNom() {
		return nomVille;
	}
	public String getPays() {
		return nomPays;
	}
	public int getNbre() {
		return nbrHabitants;
	}
	
	//Mutateurs
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	public void setPays(String pPays) {
		nomPays = pPays;
	}
	public void setNbre(int pNbre) {
		nbrHabitants = pNbre;
	}
	
	//Définition de la catégorie
	protected void setCategorie() {
		int borneSup[] = {0,1000,10000,100_000,500_000,1_000_000,5_000_000,10_000_000};
		char categories[] = {'A','B','C','D','E','F','G','H'};
		int i =0;
		
		while (i < borneSup.length && this.nbrHabitants > borneSup[i])
			i++;
		this.categorie = categories[i];
	}
	
	// Description de la ville
	public String toString() {
		return "\n" + this.nomVille + " est une ville de " + this.nomPays + ".\nElle contient " + this.nbrHabitants + " habitants.\nElle est en catégorie " + this.categorie +".\n";
	}
}
