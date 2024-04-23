package _04_object;

public class Alumno extends Persona{
public String curso;


	
	public boolean esCiencias() {
		if (curso.equals("DAM")) {
			return true;
		}else {
			return false;
		}
	}

	
	public void presentarse() {
		//Como el nombre el private solo podemos acceder a el mediante el metodo
		//accesor o el metodo modificador
		System.out.println("Hola soy el alumno muñon de nombre : " + this.nombre);
		//como el atributo edad es "protected" no necesitamos nombre
		//podemos accerder a el directamente
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
