package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddColorProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> colors = new ArrayList<String>();
		
	
		while (true) {
			
			System.out.println("Digite uma cor: ");
		
			String cor = sc.next();
			
			  if (!cor.equalsIgnoreCase("2")) {
			        colors.add(cor);
			    }	
			if (cor.equalsIgnoreCase("2")) {
				break;
			}
		}
		
	System.out.println(colors);
	
	}

}
