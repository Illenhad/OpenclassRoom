import java.util.Scanner;

public class TestArrondi {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Entrer un nombre � arrondir:");
		double i = sc.nextDouble();
		System.out.println("Comment de chiffres apr�s la virgule ?");
		int j = sc.nextInt();
		
		System.out.println("R�sultat: "+arrondi(i,j));
		
	}
	public static double arrondi(double a, int b) {
		return (double) ((int) (a * Math.pow(10, b)+ .5))/ Math.pow(10, b);
	}
}

