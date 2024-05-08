package files.io;

import java.io.File;
import java.io.IOException;

public class Basic {

	public static void main (String[] args) {
		
		// caminho
		File pasta1 = new File("C:\\Users\\note\\Desktop\\filesTest\\test1"); 
		
		// arquivo - caminho + nome e tipo
		File arquivo1 = new File(pasta1, "text1.txt");
		
		
		try {
			// criar arquivo
			arquivo1.createNewFile();
			
		} catch (IOException e) {
			
			System.out.println("Erro ao criar arquivo: " + e.getMessage());
		}		
	}
	
}
