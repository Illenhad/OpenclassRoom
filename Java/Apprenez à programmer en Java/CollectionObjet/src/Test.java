import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;

import java.util.Enumeration;
import java.util.Hashtable;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		//Test de List: LinkedList
		System.out.println("\nTest de List: \n");
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
		
		// Test de List: ListeIterator
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//Test List: ArrayList
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
		
		
		//Test de Map: Hashtable
		System.out.println("\nTest de Map: \n------------------");
		Hashtable ht = new Hashtable();
		ht.put(1, "Printemps");
		ht.put(27, "Eté");
		ht.put(42, "Automne");
		ht.put(79, "Hiver");
		
		Enumeration e = ht.elements();
		System.out.println("\nTest avec un Hashtable: \n");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
		//Test de Set: HashSet
		System.out.println("\nTest des Set: \n------------------");
		
		HashSet hs = new HashSet();
		hs.add("truc");
		hs.add(25);
		
		System.out.println("\nTest avec un HashSet: \n");
		Iterator it = hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("\nTest avec un tableau d'objet: \n");
		
		Object[] obj = hs.toArray();
		for(Object o : obj)
			System.out.println(o);
		
	}
}
