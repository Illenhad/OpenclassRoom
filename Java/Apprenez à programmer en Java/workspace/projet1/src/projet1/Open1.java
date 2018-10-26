package projet1;

public class Open1 {
	public static void main(String[] args) {
		String tab[][] = {{"toto", "titi", "tutu"}, {"tata", "tete", "tyty"}};
		 
		for(String str[] : tab)
		{
		 	for(String str2 : str)
		 	{
		     	System.out.println("La valeur est  = " + str2);
		 	}
		 
		}

	}
}