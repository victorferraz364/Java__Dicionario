package collections.list;

import java.util.ArrayList;


/* 
 * 
 * reduz o tamanho para o mesmo que a quantidade de elementos
 * usado para economizar memoria caso não precise adicionar mais elementos
 * no array
 * 
 * 
 * 
 * 
 * 
 * */

public class Trim_And_ensureCapacity_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
    
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
        
        c1.ensureCapacity(7);
        c1.add("a");
        c1.add("b");
        c1.add("c");
        
        System.out.println(c1);
        
	}

}
