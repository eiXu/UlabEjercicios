package EjercicioNotas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Scanner scan;

	public static void main(String[] args) {

		int valor;
		scan = new Scanner(System.in);
		List<Alumno> alumnos = new ArrayList<Alumno>();

		do {
			valor = printMenu();
			switch (valor) {
			case 1:
				alumnos.add(option1());
				break;
			case 2:
				option2(alumnos);
				break;
			case 3:
				option3(alumnos);
				break;
			case 4:
				option4(alumnos);
				break;
			case 5:
				optionFilter(alumnos, "SOBRESALIENTE");
				break;
			case 6:
				optionFilter(alumnos, "NOTABLE");
				break;
			case 7:
				optionFilter(alumnos, "BIEN");
				break;
			case 8:
				optionFilter(alumnos, "SUFICIENTE");
				break;
			case 9:
				optionFilter(alumnos, "INSUFICIENTE");
				break;

			}

		} while (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6 || valor == 7
				|| valor == 8 || valor == 9);

		System.out.println("-- Programa finalizado --");

		scan.close();
	}

	// Método que imprime el menú, y devuelve la opción seleccionada
	public static int printMenu() {

		int opcion;

		System.out.println("1- Nueva Calificación");
		System.out.println("2- Listar Calificaciones");
		System.out.println("3- Listar Calificaciones (Ordenado por calificación ascendente)");
		System.out.println("4- Listar Calificaciones (Ordenado por calificación descendente)");
		System.out.println("5- Listar Calificaciones SOBRESALIENTES");
		System.out.println("6- Listar Calificaciones NOTABLE");
		System.out.println("7- Listar Calificaciones BIEN");
		System.out.println("8- Listar Calificaciones SUFICIENTE");
		System.out.println("9- Listar Calificaciones INSUFICIENTE");

		try {
			opcion = scan.nextInt();
		} catch (Exception e) {
			System.err.println("Valor introducido no es entero");
			opcion = 3;
		}

		return opcion;

	}

	// Método que crea un alumno y lo devuelve con las respectivas restricciones de
	// la nota
	public static Alumno option1() {

		scan.nextLine();
		System.out.println("Introduce el nombre del alumno:");
		String nombre = scan.nextLine();
		int nota;
		try {
			do {
				System.out.println("Introduce la nota del alumno:");
				nota = scan.nextInt();
				if (nota < 0 || nota > 10) {
					System.out.println("Introduce una nota válida: [0-10]");
				}
			} while (nota < 0 || nota > 10);
		} catch (Exception e) {
			System.err.println("Nota solo puede ser un valor entero");
			nota = 0;
		}

		return new Alumno(nombre, nota);

	}

	// Función que imprime todos los alumnos
	public static void option2(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	// Función que imprime los alumnos de forma ascendente
	public static void option3(List<Alumno> alumnos) {
		Collections.sort(alumnos);
		Alumno alumno;
		for (int i = 0; i < alumnos.size(); i++) {
			alumno = alumnos.get(i);
			System.out.println(alumno);
		}
	}

	// Función que imprime los alumnos de forma descendente
	public static void option4(List<Alumno> alumnos) {
		Collections.sort(alumnos);
		Alumno alumno;
		for (int i = alumnos.size(); i > 0; i--) {
			alumno = alumnos.get(i - 1);
			System.out.println(alumno);
		}
	}

	// Función que imprime los alumnos que tengan una nota dentro de "filter"
	public static void optionFilter(List<Alumno> alumnos, String filter) {
		for (Alumno alumno : alumnos) {
			if (alumno.getTipoNotas().getNombreNota().equals(filter)) {
				System.out.println(alumno);
			}
		}
	}

}
