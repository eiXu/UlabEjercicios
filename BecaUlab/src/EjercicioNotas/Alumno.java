package EjercicioNotas;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private Integer nota;
	private MisNotas tipoNotas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public MisNotas getTipoNotas() {
		return tipoNotas;
	}

	public void setTipoNotas(MisNotas tipoNotas) {
		this.tipoNotas = tipoNotas;
	}

	public Alumno(String nombre, Integer nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		switch (nota) {
		case 5:
			tipoNotas = MisNotas.SUFICIENTE;
			break;
		case 6:
			tipoNotas = MisNotas.BIEN;
			break;
		case 7:
		case 8:
			tipoNotas = MisNotas.NOTABLE;
			break;
		case 9:
		case 10:
			tipoNotas = MisNotas.SOBRESALIENTE;
			break;
		default:
			tipoNotas = MisNotas.INSUFICIENTE;

		}
	}

	public enum MisNotas {
		SOBRESALIENTE("SOBRESALIENTE"), NOTABLE("NOTABLE"), BIEN("BIEN"), SUFICIENTE("SUFICIENTE"),
		INSUFICIENTE("INSUFICIENTE");

		private String nombreNota;

		private MisNotas(String nombre) {
			nombreNota = nombre;
		}

		public String getNombreNota() {
			return nombreNota;
		}

	}

	@Override
	public int compareTo(Alumno alumno2) {

		int valor;

		if (this.nota > alumno2.getNota()) {
			valor = 1;
		} else if (this.nota < alumno2.getNota()) {
			valor = -1;
		} else {
			valor = 0;
		}

		return valor;
	}

	@Override
	public String toString() {
		return getTipoNotas() + "(" + getNota() + ") - " + getNombre();
	}

}
