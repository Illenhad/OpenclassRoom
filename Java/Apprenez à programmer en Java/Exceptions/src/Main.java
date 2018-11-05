
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 10, i = 0;
		try{
			System.out.println(j/i);
		}
		catch (ArithmeticException e){
			e.printStackTrace();
			}
		finally {
			System.out.println("Systematique");
		}
		System.out.println("Coucou!");
	}

}
