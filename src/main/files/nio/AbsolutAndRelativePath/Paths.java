package files.nio.AbsolutAndRelativePath;

import java.nio.file.Path;

public class Paths {

	public static void main(String[] args) {
		 
		Path arquivo = Path.of("Desktop\\extrato.csv");
		System.out.println(arquivo);
		
		Path arquivoAbsoluto = arquivo.toAbsolutePath();
		System.out.println(arquivoAbsoluto);

		System.out.println(arquivo.isAbsolute());
		System.out.println(arquivoAbsoluto.isAbsolute());
	}

}
