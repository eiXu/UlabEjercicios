package Personas;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Persona[] personas = new Persona[4];
		
		personas[0] = new Persona("ANA",2010,26);
		personas[1] = new Persona("ALBA",1998,21);
		personas[2] = new Persona("ANA",2009,26);
		personas[3] = new Persona("ALBA",2007,26);
		
		List<Persona> listaPersonas = Arrays.asList(personas);
		
		Collections.sort(listaPersonas);
		
		for(Persona p : personas) {
			System.out.println(p);
		}

	}

}
