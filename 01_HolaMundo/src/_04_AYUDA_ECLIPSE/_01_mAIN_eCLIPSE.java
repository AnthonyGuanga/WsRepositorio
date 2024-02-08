package _04_AYUDA_ECLIPSE;

public class _01_mAIN_eCLIPSE {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Pepon");
		p2.peso = 123.89;
		Persona p3 = new Persona("Pepin",15,56,false);
		
		//por defecto los obejetos se imprimin con el siguiente formato
		//Nombre completo claseCODIGO_HASH
		//Pero, si sobreescribimos el metodos toStringdelaclase
		//podemos darle el formato que queramos
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		
		


	}

}
