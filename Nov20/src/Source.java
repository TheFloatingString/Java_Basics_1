import java.util.Scanner;
import java.util.Random;

public class Source {
		public static void main(String args[]){
			
		Scanner	sc = new Scanner(System.in);
		Random r =  new Random();
		int nombre = r.nextInt(100)+1;
	
		int nbCoups = 0;

		
		String counter = "";
		
		long start = System.currentTimeMillis();
		for (int i = 0;i<=1000;i++){
			if(i%100==0){
				String format = "%-40s%s%n";

				System.out.printf(format, i, System.currentTimeMillis()-start);

			}
			for (int j = 0; j<i;j++){
				counter = counter + "*";
			}
		}
		System.out.println(counter);
		
		while(true){
				nbCoups++;

				int nbUtilisateur = sc.nextInt();
				
				if(nbUtilisateur == nombre){
					System.out.println("C'est le bon nombre!");
					break;
				} else if (nbUtilisateur < nombre){
					System.out.println("Trop petit");
				} else{
					System.out.println("Trop grand!");
				}
				
			}
		System.out.println(nbCoups);
		
		}
		
}
