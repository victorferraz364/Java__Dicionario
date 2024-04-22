package exceptions.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class App {

	public static void main (String[] args) {
		
		Path arquivo1 = Path.of("C:\\Users\\note\\Desktop\\teste.txt");
	
		
		try {
			Files.createFile(arquivo1);
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo" + e.getMessage());
		}
		
		
	}
	
}
