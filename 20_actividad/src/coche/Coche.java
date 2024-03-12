package coche;

public class Coche {

	private int id;
	private String matricula;
	private String marca;
	static private int contadorID;
	
	public Coche() {
		super();
	}
	
	public Coche(int id, String matricula, String marca) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		
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

	@Override
	public String toString() {
		return "Coche [id=" + id + 
				", matricula=" + matricula + 
				", marca=" + marca + "]";
	}
	
	
	
	
	
	
}
