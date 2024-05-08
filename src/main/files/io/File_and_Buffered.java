package files.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_and_Buffered {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\note\\Desktop\\links.txt");
	

	        try (FileReader fileReader = new FileReader(arquivo);
	             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

	            String line;
	            // Lê cada linha do arquivo e imprime no console
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
