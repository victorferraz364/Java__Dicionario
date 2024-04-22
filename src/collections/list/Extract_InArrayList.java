package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Extract_InArrayList {

	public static void main(String[] args) {
		
		List<String> filmes = new ArrayList<String>();
		filmes.add("pokemon");
		filmes.add("transformes");
		filmes.add("fnaf");
		filmes.add("maquinas mortais");
		
		System.out.println(filmes);
		
		List<String> subList = filmes.subList(0, 2);
		System.out.println(subList);
		
	}
	

}
