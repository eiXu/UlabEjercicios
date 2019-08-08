package herencia;

public class AnimalesDomesticos {

	public static void main(String[] args) {
		
		int TAM = 5;
		Perro[] perros = new Perro[TAM];
		Gato[] gatos = new Gato[TAM];
		Raton[] ratones = new Raton[TAM];
		
		String nombre;
		double peso;
		double altura;
		
		for (int i = 0; i < TAM; i++) {
			nombre= "perro";
			perros[i] = new Perro(nombre.concat(String.valueOf(i+1)),i*1.1,i*1.1);
			nombre= "gato";
			gatos[i] = new Gato(nombre.concat(String.valueOf(i+1)),i*1.05,i*1.05);
			nombre= "ratón";
			ratones[i] = new Raton(nombre.concat(String.valueOf(i+1)),i*1.03,i*1.03);
		}
		for (int i = 0; i < TAM; i++) {
			System.out.println(perros[i].getNombre()+" es un perro pesa "+perros[i].getPeso()+" y mide "+perros[i].getAltura()
					);
			System.out.println(gatos[i].getNombre()+" es un gato pesa "+gatos[i].getPeso()+" y mide "+gatos[i].getAltura()
					);
			System.out.println(ratones[i].getNombre()+" es un ratón pesa "+ratones[i].getPeso()+" y mide "+ratones[i].getAltura()
					);
		}

	}

}
