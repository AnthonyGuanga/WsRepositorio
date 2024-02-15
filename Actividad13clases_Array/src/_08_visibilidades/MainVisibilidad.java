package _08_visibilidades;

public class MainVisibilidad {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		//e1 = e1.nombre = "pepe"
		e1.edad = 23;
		e1.peso = 56.67;
		e1.dni = "124414242";
		e1.setNombre("P");
		System.out.println(e1.getNombre());
		e1.setNombre("Pepe");
		System.out.println(e1.getNombre());
		
	}

}
