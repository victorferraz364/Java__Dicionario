package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clone_Copy_Empty_ArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>(Arrays.asList("azul", "vermelho"));
		List<String> nomes = new ArrayList<String> (cores);

		
		
		System.out.println(nomes + "" + nomes.isEmpty());
		
		nomes.removeAll(cores); // remover tudo
		nomes.isEmpty();
		
		System.out.println(nomes + "" + nomes.isEmpty());
		
	}

}
