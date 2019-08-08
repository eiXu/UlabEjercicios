package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjercicioStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Prrimer punto
		System.out.println("Esto es una prueba".toUpperCase());

		// Segundo punto
		String[] punto2 = "La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc"
				.split(",");
		for (String s : punto2) {
			System.out.println(s);
		}

		// Tercer punto
		System.out.println("Esto es un ejemplo usado para determinar un indice".indexOf("ejemplo"));

		// Cuarto punto
		muestraFecha("01/02/2016");
		muestraFecha("22/04/2017");
		muestraFecha("01-02-2016");

		// Quinto punto
		System.out.println("Introduce una frase:");
		String frase = scan.nextLine();
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		char letra;
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			if(letra == 'a' || letra == 'A' || letra == 'á' || letra == 'Á') {
				contadorA++;
			}
			if(letra == 'e' || letra == 'E' || letra == 'é' || letra == 'É') {
				contadorE++;
			}
			if(letra == 'i' || letra == 'I' || letra == 'í' || letra == 'Í') {
				contadorI++;
			}
			if(letra == 'o' || letra == 'O' || letra == 'ó' || letra == 'Ó') {
				contadorO++;
			}
			if(letra == 'u' || letra == 'U' || letra == 'ú' || letra == 'Ú') {
				contadorU++;
			}
		}
		System.out.println("La 'A' aparece ("+contadorA+") veces");
		System.out.println("La 'E' aparece ("+contadorE+") veces");
		System.out.println("La 'I' aparece ("+contadorI+") veces");
		System.out.println("La 'O' aparece ("+contadorO+") veces");
		System.out.println("La 'U' aparece ("+contadorU+") veces");
		
		scan.close();
	}

	public static void muestraFecha(String f) {
		Pattern pat = Pattern.compile("\\d\\d/\\d\\d/\\d\\d\\d\\d");
		Matcher mat = pat.matcher(f);
		String respuesta;

		if (mat.matches()) {

			String[] frase = f.split("/");
			String mes = null;

			switch (frase[1]) {
			case "01":
				mes = "Enero";
				break;
			case "02":
				mes = "Febrero";
				break;
			case "03":
				mes = "Marzo";
				break;
			case "04":
				mes = "Abril";
				break;
			case "05":
				mes = "Mayo";
				break;
			case "06":
				mes = "Junio";
				break;
			case "07":
				mes = "Julio";
				break;
			case "08":
				mes = "Agosto";
				break;
			case "09":
				mes = "Septiembre";
				break;
			case "10":
				mes = "Octubre";
				break;
			case "11":
				mes = "Noviembre";
				break;
			case "12":
				mes = "Diciembre";
				break;
			default:
				mes = "mes erróneo";
			}

			respuesta = "Es el ".concat(frase[0]).concat(" de ").concat(mes).concat(" de ").concat(frase[2]);
		} else {
			respuesta = "La fecha '".concat(f).concat("' no tiene el formato correcto");
		}
		System.out.println(respuesta);
	}
}
