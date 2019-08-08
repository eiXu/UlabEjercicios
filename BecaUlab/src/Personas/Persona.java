package Personas;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private String apellidos;
	private Integer diaNac;
	private Integer mesNac;
	private Integer anyNac;
	private String ciudad;
	private Integer edad;
	private Boolean estudia;
	private Boolean trabaja;
	private Character sexo;
	private String DNI;

	public Persona(String nombre, String apellidos, Integer diaNac, Integer mesNac, Integer anyNac, String ciudad,
			Integer edad, Boolean estudia, Boolean trabaja, Character sexo, String dNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNac = diaNac;
		this.mesNac = mesNac;
		this.anyNac = anyNac;
		this.ciudad = ciudad;
		this.edad = edad;
		this.estudia = estudia;
		this.trabaja = trabaja;
		this.sexo = sexo;
		DNI = dNI;
	}

	public Persona(String dNI, String nombre) {
		super();
		this.nombre = nombre;
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public Persona(String nombre, Integer anyNac, Integer edad) {
		super();
		this.nombre = nombre;
		this.anyNac = anyNac;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getDiaNac() {
		return diaNac;
	}

	public void setDiaNac(Integer diaNac) {
		this.diaNac = diaNac;
	}

	public Integer getMesNac() {
		return mesNac;
	}

	public void setMesNac(Integer mesNac) {
		this.mesNac = mesNac;
	}

	public Integer getAnyNac() {
		return anyNac;
	}

	public void setAnyNac(Integer anyNac) {
		this.anyNac = anyNac;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getEstudia() {
		return estudia;
	}

	public void setEstudia(Boolean estudia) {
		this.estudia = estudia;
	}

	public Boolean getTrabaja() {
		return trabaja;
	}

	public void setTrabaja(Boolean trabaja) {
		this.trabaja = trabaja;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return /*
				 * "Hola me llamo " + nombre + " " + apellidos + " y tengo " + edad +
				 * " años.\nNací el " + diaNac + "/" + mesNac + "/" + anyNac + " y vivo en " +
				 * ciudad
				 */this.getNombre() + "\t" + this.getEdad() + "\t" + this.getAnyNac();
	}

	@Override
	public int compareTo(Persona persona2) {

		int valor = this.getNombre().compareTo(persona2.getNombre());

		if (valor == 0) {

			if (this.getEdad() > persona2.getEdad()) {
				valor = -1;
			} else if (this.getEdad() < persona2.getEdad()) {
				valor = 1;
			} else {
				if (this.getAnyNac() < persona2.getAnyNac()) {
					valor = -1;
				} else if (this.getAnyNac() > persona2.getAnyNac()) {
					valor = 1;
				} else {
					valor = 0;
				}
			}

		}

		return valor;
	}

}
