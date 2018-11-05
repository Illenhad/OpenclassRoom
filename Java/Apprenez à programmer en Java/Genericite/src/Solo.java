
public class Solo<T> {
	
	private T valeur;
	
	public T getValeur() {
		return this.valeur;
	}
	
	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	
	public Solo() {
		this.valeur = null;
	}
	
	public Solo (T valeur) {
		setValeur(valeur);
	}
}
