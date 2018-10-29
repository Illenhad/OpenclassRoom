import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//Test de LinkedList
		List l = new LinkedList();
		l.add(25);
		l.add("Test!");
		l.add(98.753);
		System.out.println("Test avec un LinkedList: \n");
		//Affichage de l'ensemble des éléments
		for(int i = 0; i < l.size(); i++) {
			System.out.println("index "+i+", Element : "+l.get(i));
		}
		
		System.out.println("\nTest avec un Iterateur: \n");
		
		// Test de ListeIterator
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//Test ArrayList
		ArrayList al = new ArrayList();
		al.add(72);
		al.add("TrucMachin");
		al.add(null);
		al.add(12.21531546351);
		
		System.out.println("\nTest avec un ArrayList: \n");
		
		//Affichage de l'ensemble des éléments
				for(int i = 0; i < al.size(); i++) {
					System.out.println("index "+i+", Element : "+al.get(i));
				}
	}

}
