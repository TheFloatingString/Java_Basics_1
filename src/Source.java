import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
		
		LinkedList<String> noms = new LinkedList<>();
		noms.add("Mathieu");
		noms.add("Laurent");
		noms.add("Alex");
		noms.add("Omar");
		
		LinkedList<String> cap_nom = new LinkedList<>();
		
		for(String item:noms){
			cap_nom.add(item.toUpperCase());
		}
		
		Collections.sort(noms);
		Collections.sort(cap_nom);
		
		System.out.println(noms);
		System.out.println(cap_nom);
		System.out.println(cap_nom.get(0));
		
		Set<String> set = new HashSet<>();
		
		set.add("abc");
		set.add("hef");
		set.add("ghi");
		
		
		
		Set<String> newSet = new HashSet<>();
		
		
		for(String item : set){
			newSet.add(item.toUpperCase());
		}
		
		System.out.println(newSet);
		
		HashMap dict = new HashMap();
		dict.put("Phil", "Programmer");
		dict.put("Mathieu", "Programmer");
		System.out.println(dict.get("Phil"));
		System.out.println(dict.keySet());
		
	}
	
}
