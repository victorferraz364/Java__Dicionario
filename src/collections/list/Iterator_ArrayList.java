package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_ArrayList {

	public static void main(String[] args) {
		
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		nomes.add("oliveira");
		
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("===================");
		
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
		    String elemento = iterator.next();
		    System.out.println(elemento);
		}
	}

}
