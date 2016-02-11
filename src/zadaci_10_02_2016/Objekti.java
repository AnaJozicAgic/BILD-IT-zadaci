package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Date;

public class Objekti {

	public static void main(String[] args) {
		//Creating new array list of object
		ArrayList<Object>lista= new ArrayList<>();
		//add various object
		lista.add(new Date());
		lista.add("String");
		lista.add(new GeometricObject());
		lista.add(new Triangl());
		//printing list content
		for(int i= 0; i<lista.size(); i++){
			System.out.println(lista.get(i));
			System.out.println();
		}

	}

}
