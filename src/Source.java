import java.util.List;
import java.util.ArrayList;

public class Source {

	public static void main(String[] args){
		List<Integer> liste = new ArrayList<Integer>();
		
		System.out.println(liste);
		
		liste.add(12);
		liste.add(13);
		liste.add(14);
		
		System.out.println(liste);
		
		liste.remove(0);
		
		System.out.println(liste);
		
	}
	
}
