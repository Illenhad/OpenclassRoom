import java.util.Scanner;

public class conv {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		double choix = 0;
		char cont = ' ';
		String chaine = new String(" ");
					
		do 
		{
			//choix du convertisseur
			do{
				System.out.println("Convertir en Celcius: Tapez 1\nConvertir en Faranheight: Tapez 2.");
				choix = sc.nextInt();
			}while (choix != 1 && choix != 2);
			
			//Choix de la température
			System.out.println("Entrez la température à convertir:");
			int temp = sc.nextInt();
			
			//Conversion
			if ( choix == 1)
				System.out.println(temp + " °F = " + ((temp-32)*5)/9 + " °C");
			else if (choix == 2)
				System.out.println(temp + " °C = " + (((9/5)*temp+32)) + " °F");
			
			//Continue ?
			do{
				System.out.println("Southaitez vous continuer ? (O/N)");
				chaine = sc.next();
				cont = chaine.charAt(0);
			}while (cont != 'O' && cont != 'N' );
			
		}while (cont == 'O');
	}
}