/**
 * Jeu de crêpes
 * Créé par Laurence Liang :D
 * le dimanche 26 novembre 2017
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Crepes {
	public static void main(String[] args){
		
		// Initialiser Scanner
		Scanner sc = new Scanner(System.in);
				
		// Initialiser crepes
		System.out.println("BIENVENUE AU JEU DE CRÊPES!!! \n");
		int nb_crepes = 0;
		
		while(true){
			System.out.print("Combien de crêpes voulez-vous créer? ");
			nb_crepes = sc.nextInt();
			sc.nextLine();
			if(nb_crepes<10){
				break;
			}
			System.out.println("Désolé! Veuillez entrer un nombre inférieur à 10! \n\n");
		}
		
		ArrayList<Integer> parent_crepes = new ArrayList<Integer>();
		int ordered_crepes = 0;
		
		for(int i = 1; i<=nb_crepes; i++){
			int num = i;
			ordered_crepes += num*Math.pow(10,i-1);
			parent_crepes.add(i);
		}
		Collections.shuffle(parent_crepes);
		int crepes = 0;
		for(int i = 0; i < parent_crepes.size();i++){
			int num = (int) (parent_crepes.get(i)*Math.pow(10, i));
			crepes += num;
		}

		
		// While not ordered
		while(crepes != ordered_crepes){
			
			// Imprimer crêpes
			System.out.println("Grandeur des crêpes:");
			// Pour chaque crepe
			for(int i = 0;i<nb_crepes;i++){
				// Pour la longueur de la crepe
				int stack = (int) (crepes/(Math.pow(10, i))%10); 
				for(int j = 0; j<stack; j++){
					System.out.print("*");
				}
				System.out.println(" "+ stack);

			}System.out.println();

			// Demander utilisateur pour le nombre de crepes
			System.out.print("Combien de crêpes voulez-vous inverser? ");
			int n_crepes_flip = sc.nextInt();
			sc.nextLine();
			/* Creer nouvelle variable et soustraire
			 * les valeurs pour le nombre de crepes
			 */
			int nouveau_crepes = crepes;
			
			for(int i = 0; i<n_crepes_flip; i++){
				int valeur = (int) ((crepes/(Math.pow(10, i)))%10);
				nouveau_crepes -= valeur*(Math.pow(10,i));
				// System.out.println("Nouveau crepes " + nouveau_crepes);
			}
		
			// Pour ce nombre de crepes
			for(int i = 0; i<n_crepes_flip; i++){
			
				// Lire valeur de la plus petite
				int valeur = (int) ((crepes/(Math.pow(10, i)))%10);
				int remplace = (int) (valeur*Math.pow(10, n_crepes_flip-i-1));
				// Remplacer la valeur de la plus grande
				nouveau_crepes += remplace;	
			}
			// Imprimer situation
			crepes = nouveau_crepes;
		
		}
		
		// Fermer scanner
		sc.close();
		// Imprimer situation
		
		System.out.println("Grandeur des crêpes:");
		for(int i = 0;i<nb_crepes;i++){
			int stack = (int) (crepes/(Math.pow(10, i))%10); 
			for(int j = 0; j<stack; j++){
				System.out.print("*");
			}
			System.out.println(" "+ stack);

		}System.out.println();
		System.out.println("FELICITATIONS!!!!!");
	}
}
