package file.nio;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Files_With_NIO {

	public static void main (String args[]) {
		
		
		FileSystem fs = FileSystems.getDefault(); // gerenciador do sistema
		Path arquivo1 = fs.getPath("C:\\Users\\note\\Desktop\\extrato.csv"); // classe caminho
		System.out.println(arquivo1);
		
		Path nomearquivo = arquivo1.getFileName();
		System.out.println(nomearquivo);
		
		File arquivoIO = arquivo1.toFile(); // conversão para api antiga, inverso também funciona
		System.out.println(arquivoIO.getName());
	
	}
	
}
