package Personas;
import java.util.Scanner;

public class ImprimirTipoDato {

	static Scanner teclado = new Scanner(System.in);
	static final int TAM = 2;
	
	public static void main(String[] args) {
		
		Persona[] ArrayPersonas = new Persona[TAM];

		for(int i = 0; i < TAM ; i++)
		{
			ArrayPersonas[i] = pedirDatos();
		}
		
		imprimirTodos(ArrayPersonas);
		
	}
	
	public static Persona pedirDatos()
	{
		System.out.println("Dime el nombre");
		String nombre = teclado.next();
		System.out.println("Dime el primer apellido");
		String apellidos = teclado.next();
		System.out.println("Dime el día de nacimiento");
		int diaNac = teclado.nextInt();
		System.out.println("Dime el mes de nacimiento");
		int mesNac = teclado.nextInt();
		System.out.println("Dime el año de nacimiento");
		int anyNac = teclado.nextInt();
		System.out.println("Dime la ciudad");
		String ciudad = teclado.next();
		System.out.println("Dime tu edad");
		int edad = teclado.nextInt();
		System.out.println("¿Estudias? true/false");
		boolean estudiar = teclado.nextBoolean();
		System.out.println("¿Trabajas? true/false");
		boolean trabajar = teclado.nextBoolean();
		System.out.println("¿Hombre o mujer? H/M");
		char sexo = teclado.next().charAt(0);
		System.out.println("¿Hombre o mujer? H/M");
		String dni = teclado.next();
		
		Persona persona = new Persona(nombre,apellidos,diaNac,mesNac,anyNac,ciudad,edad,estudiar,trabajar,sexo,dni);
		
		return persona;
	}
	
	public static void imprimirTodos(Persona[] Personas)
	{
		for(int i = 0; i < TAM ; i++)
		{
			System.out.println(Personas[i]);
		}
	}

}
