package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Join_ArrayList {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>(Arrays.asList("azul", "vermelho"));
		List<String> nomes = new ArrayList<String>(Arrays.asList("Victor", "ferraz"));
		List<String> arrayJoin = new ArrayList<String>();
		
		arrayJoin.addAll(cores);
		arrayJoin.addAll(nomes);
		System.out.println(arrayJoin);
	
	}

}
