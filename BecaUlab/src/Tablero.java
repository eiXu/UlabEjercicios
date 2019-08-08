
public class Tablero {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		String[][] Tablero = generarTablero(a, b);

		mostrarArray(Tablero);

	}

	public static String[][] generarTablero(int a, int b) {

		String[][] Array = new String[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				Array[i][j] = String.valueOf(b*i+j);
			}
		}

		return Array;
	}

	public static void mostrarArray(String[][] Tablero) {
		for (int i = 0; i < Tablero.length; i++) {
			for (int j = 0; j < Tablero[i].length; j++) {
				System.out.print(Tablero[i][j]);
			}
			System.out.println();
		}

	}

}
