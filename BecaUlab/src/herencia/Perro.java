package herencia;

public class Perro extends Animal{

	public Perro(String nombre, double peso, double altura) {
		super(nombre, peso, altura);
		// TODO Auto-generated constructor stub
	}

	public String ladrar() {
		return "guau";
	}
}
