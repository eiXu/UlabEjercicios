package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		final String pass = "123456";
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce la password");
			if (pass.equals(teclado.next())) {
				System.out.println("Contraseņa correcta!");
				break;
			}
			System.out.println("Contraseņa incorrecta.");
		}
		teclado.close();

	}

}
