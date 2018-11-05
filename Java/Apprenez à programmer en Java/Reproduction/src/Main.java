
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//déclaration de la classe Alien
		Alien alien = new Alien();	
		//appel des interfaces
		Reproduction.description();
		Mitose.description();
		Pondre.description();
		//Appel de la classe Alien
		alien.reproduire();
		
	}

}
