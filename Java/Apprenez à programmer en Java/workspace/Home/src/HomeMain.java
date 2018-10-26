
public class HomeMain {
	
	public static void main (String[] args) {
		Ville ville = new Ville("Lens",45_000,"france" );
		System.out.println(ville.descriptionVille());
		System.out.print("Il y a " + ville.getCompteur() + " villes.");
	}
}
