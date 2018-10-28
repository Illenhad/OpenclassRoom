
public enum Langage {
	//Objet construit
	Java("Langage Java", "Eclipse"),
	C("Langage C", "Code Blocks"),
	PHP("Langage PHP", "PS Pad"),
	Python("langage Python", "Python3");
	
	private String name ="";
	private String editor ="";
	
	//Constructeur
	Langage(String name, String editor){
		this.name = name;
		this.editor = editor;
	}
	
	public void getEditor() {
		System.out.println("Editeur : "+editor);
	}
	
	public String toString() {
		return name;
	}
}


