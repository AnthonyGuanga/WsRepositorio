package coche;

public class Coche {

	private int id;
	private String matricula;
	private String marca;
	private static int contadorID;
	private static final String MARCA1 = "TOYOTA";
	private static final String MARCA2 = "RENAULT";
	
	public Coche() {
		super();
		this.id = contadorID;
		contadorID ++;
	
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public static int getContadorID() {
		return contadorID;
	}



	public static void setContadorID(int contadorID) {
		Coche.contadorID = contadorID;
	}



	public static String getMarca1() {
		return MARCA1;
	}



	public static String getMarca2() {
		return MARCA2;
	}



	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	public void mostrarElValor() {
		System.out.println(contadorID);
	}
	
	public void resetearContador() {
		
		contadorID = 0;
	}
}
