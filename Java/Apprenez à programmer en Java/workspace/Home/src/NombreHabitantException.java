
class NombreHabitantException extends Exception{
	public NombreHabitantException() {
		System.out.println("Une ville ne peux pas avoir un nombre d'habitants n�gatif !");
	}
	public NombreHabitantException(int nbre) {
		System.out.println("Instanciation avec un nombre d'habitant n�gatif.\n\t => " + nbre);
	}
}
