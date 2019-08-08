package Personas;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Map<String,Persona> personas = new HashMap<String,Persona>();
		
		Persona persona1 = new Persona("48621185J","Adrián");
		Persona persona2 = new Persona("62841152O","Javier");
		
		personas.put(persona1.getDNI(), persona1);
		personas.put(persona2.getDNI(), persona2);
		
		for(Persona p : personas.values()) {
			System.out.println(p.getNombre()+" tiene el DNI "+p.getDNI());
		}
	}

}
