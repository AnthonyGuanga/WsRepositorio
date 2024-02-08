package _07_relaciones;

public class MainPersona {

	public static void main(String[] args) {
		
		//los numeros que enpizan por 0 en java estan en base octal
		//int cp = 05467;
		//System.out.println(cp);
		int hexa = 0x123abc;
		int binario = 0b101;
		System.out.println(binario);
		System.out.println(hexa);
		
		Persona p1 = new Persona();
		//p1.direccion = "calle orence 62 Madrid 28224";
		p1.nombre = "thor";
		//p1.direccion.ciudad = " Madrid";
		//System.out.println(p1.cuentaBancaria.length);
		
		Direccion d1 = new Direccion();
		d1.ciudad = "Madrid";
		p1.direccion = d1;
		
		CuentaBancaria[] arrayCb1 = new CuentaBancaria[2];
		p1.cuentaBancaria = arrayCb1;
		System.out.println(p1.cuentaBancaria.length);
		//System.out.println(p1.cuentaBancaria[0].iban);
		CuentaBancaria cb1 = new CuentaBancaria();
		cb1.iban ="ES32267890";
		p1.cuentaBancaria[0] = cb1;
		cb1.saldo = 5000;
		System.out.println(p1.cuentaBancaria[0].saldo);
		System.out.println(arrayCb1[0].saldo);
		
		cb1 = new CuentaBancaria();
		cb1.iban = "sz552525";
		arrayCb1[1] = cb1;
		
	
		
		System.out.println(p1.cuentaBancaria[1].iban);
		
		
		Persona p2 = new Persona();
		//p2.direccion = "Orense 05789 Plaza de españa 78";
		p2.nombre = "Iroman";
		
		//p2 = p1;
		d1 = new  Direccion();
		d1.ciudad = "New York";
		p2.direccion = d1;
		System.out.println(p1.direccion.ciudad);
	}

}
