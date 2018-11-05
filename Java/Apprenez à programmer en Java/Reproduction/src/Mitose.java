
public interface Mitose extends Reproduction {
	public static void description() {
		Reproduction.description();
		System.out.println("Redefinie par Mitose");
	}
	
	default void reproduire() {
		System.out.println("Je me divise !");
	}
}
