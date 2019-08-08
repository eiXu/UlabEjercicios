
public class Meses {

	public static void main(String[] args) {
		
		String[] Meses = new String[12];
		
		Meses[0] = "Enero";
		Meses[1] = "Febrero";
		Meses[2] = "Marzo";
		Meses[3] = "Abril";
		Meses[4] = "Mayo";
		Meses[5] = "Junio";
		Meses[6] = "Julio";
		Meses[7] = "Agosto";
		Meses[8] = "Septiembre";
		Meses[9] = "Octubre";
		Meses[10] = "Noviembre";
		Meses[11] = "Diciembre";
		
		for (int i = 0; i < Meses.length; i++) {
			System.out.println("El "+(i+1)+"º mes del año es "+Meses[i]);
		}
	}

}
