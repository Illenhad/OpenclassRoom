
public interface Pondre extends Reproduction {
	public static void description() {
		Reproduction.description();
		System.out.println("Redefinie par Pondre");
	}
	default void reproduire() {
		System.out.println("Je ponds des oeufs !");
	}
}
