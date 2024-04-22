package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Remove_InList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		nomes.add("oliveira");
		
		nomes.add(0, "caralho"); // posição, valor

		System.out.println(nomes);
		
		nomes.remove(0);
		System.out.println(nomes);
	}

}
