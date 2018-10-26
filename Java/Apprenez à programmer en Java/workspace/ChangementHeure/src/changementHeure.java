import java.util.Scanner;

public class changementHeure {
	private static Scanner sc;

	public static void main(String[] args) {
		int i = 0;
		sc = new Scanner(System.in);
		do
		{
			System.out.println("Avril: Tapez 1 \nOctobre: Tapez 2");
			int choix = sc.nextInt();
			i = 0;
			if (choix == 1)
					{
				System.out.println("\nEn AVril, on AVance d'une heure !");
					}
			else if (choix == 2)
				System.out.println("\nEn octobRE, on REcule d'une heure !");
			else
			{
				System.out.println("\nRaté!\n");
				i = 1;
				
			}
		}while(i == 1);
	}
}
