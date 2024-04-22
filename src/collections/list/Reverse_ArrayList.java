package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_ArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		
		Collections.reverse(nomes);
		System.out.println(nomes);
	}

}
