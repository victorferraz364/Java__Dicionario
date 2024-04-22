package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_ArrayToArray_ArrayList {

	public static void main(String[] args) {
		
		List<String> filmes = new ArrayList<String>(Arrays.asList("pokemon1"));
		filmes.add("pokemon");
		System.out.println(filmes);
		
		List<String> filmes2 = new ArrayList<String>();
		filmes.add("pokemon");
		
		
		 List<String> lista1 = new ArrayList<>(Arrays.asList("pokemon"));
	     List<String> lista2 = new ArrayList<>(Arrays.asList("pokemon"));

		boolean iguais = lista1.equals(lista2);
		boolean saoIguais = filmes.size() == filmes2.size() && filmes.containsAll(filmes2);
		System.out.println(iguais);
		System.out.println(saoIguais);
	
		
		ArrayList<String> c3 = new ArrayList<String>();
        for (String e : filmes) {
        	
        	c3.add(filmes2.contains(e) ? "Yes" : "No");
        }
           
        System.out.println(c3);
       
   
		
	}
}
