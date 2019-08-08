package Diario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int opcion;

		do {
			opcion = printMenu();
			switch (opcion) {
			case 1:
				writeDiary();
				break;
			case 2:
				readDiary();
				break;
			}
		} while (opcion == 1 || opcion == 2);

		System.out.println("-- Se ha seleccionado una opción diferente, se cierra el programa --");

	}

	public static int printMenu() {
		System.out.println("1- Escribir diario");
		System.out.println("2- Leer diario");

		return scan.nextInt();
	}

	public static void writeDiary() {

		FileWriter fw;
		String linea;

		scan.nextLine();

		System.out.println("Introduce la frase que quieras:");

		try {
			fw = new FileWriter("diario.txt", false);

			do {
				linea = scan.nextLine();
				if (!linea.equals("FIN")) {
					fw.write(linea + "\r\n");
				}
			} while (!linea.equals("FIN"));
			fw.close();

		} catch (IOException e) {
			System.err.println("No existe el archivo");
		}

	}

	public static void readDiary() {

		FileReader fr;
		BufferedReader br;
		String linea;

		try {
			fr = new FileReader("diario.txt");
			br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (Exception e) {
			System.err.println("No existe el diario");
		}
	}

}
