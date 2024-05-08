package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

	private List<Integer> list;
	private Integer SIZE;

	public ListOfNumbers () {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	}


	public void writeList() throws IOException {
		// The FileWriter constructor throws IOException, which must be caught.
		PrintWriter out = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter("OutFile.txt");
			out = new PrintWriter(fw);
			for (int i = 0; i < SIZE; i++) {
				// The get(int) method throws IndexOutOfBoundsException, which must be caught.
				out.println("Value at: " + i + " = " + list.get(i));
			}
		}

		catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: "+ e.getMessage());
		} 

		catch (IOException e) {
			System.err.println("Caught IOException: "+ e.getMessage());
		}

		finally {

			if (out != null) { 
				System.out.println("Closing PrintWriter");
				out.close(); 
			}
			if (fw != null) {
				System.out.println("Closing FileWriter");
				fw.close();
			}
			else { 
				System.out.println("PrintWriter not open");
			} 
		}

	}
}
