
public class HomeMain {
	
	public static void main (String[] args) {
		//On déclare v
		Capitale v = null;
		//on teste la creation de la ville
		try {
			v = new Capitale ("Le", 12000, "France", "Stade");
		} 
		catch (NombreHabitantException | NomVilleException e2) {
			System.out.println(e2.getMessage());
		}
		finally {
			if (v == null)
				v = new Capitale();
		}
		System.out.println(v.toString());

	}
	
}
