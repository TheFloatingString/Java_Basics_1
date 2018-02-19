
public class RunnableTest implements Runnable {

	private String nom;
	
	public RunnableTest(String n){
		nom = n;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++){
			System.out.println(nom + ": " + i);
		}
		
	}

}
