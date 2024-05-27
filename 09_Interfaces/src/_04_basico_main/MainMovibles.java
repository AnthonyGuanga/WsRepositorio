package _04_basico_main;

import java.util.ArrayList;
import java.util.List;

import _04_Basico_animales.Animal;
import _04_Basico.vehiculos.Camion;
import _04_Basico.vehiculos.Coche;
import _04_Basico.vehiculos.Moto;
import _04_Basico.vehiculos.VehiculoTerrestre;
import _04_Basico_animales.Cangrejo;
import _04_Basico_animales.Leon;
import _04_Basico_animales.Sexo;
import _04_Basico_animales.Tiburon;
import _04_Basico_animales.Trucha;
import _04_in.Movibles;

public class MainMovibles {

	public static void main(String[] args) {
		Animal t = new Trucha();
		t.setNombre("Robustiana");
		t.setPeso(2.2);
		t.setSexo(Sexo.NO_BINARIO);
		t.setEdad(1);
		Trucha trucha = (Trucha)t;
		trucha.setNumeroAletas(2);
		
		Cangrejo c = new Cangrejo();
		c.setNombre("Sebastian");
		c.setEdad(4);
		c.setNumeroAletas(0);
		c.setPeso(0.2);
		c.setSexo(Sexo.HERMAFRODITA);
		
		Leon l = new Leon();
		l.setNombre("Simba");
		l.setEdad(5);
		l.setPeso(180);
		l.setSexo(Sexo.MASCULINO);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Lorenzo");
		tiburon.setPeso(480);
		tiburon.setEdad(3);
		tiburon.setSexo(Sexo.FLUIDO);

		VehiculoTerrestre vh1 = new Camion();
		vh1.setPeso(2000);
		
		VehiculoTerrestre vh2 = new Coche();
		vh2.setPeso(1000);
		
		VehiculoTerrestre vh3 = new Moto();
		vh1.setPeso(400);
		
		List<Movibles>listaMovibles = new ArrayList<Movibles>();
		listaMovibles.add(trucha);
		listaMovibles.add(tiburon);
		listaMovibles.add(l);
		listaMovibles.add(c);
		listaMovibles.add(vh1);
		listaMovibles.add(vh2);
		listaMovibles.add(vh3);
		
		listaMovibles.forEach(v -> v.moverseLento());
		listaMovibles.forEach(v ->v.moverseRapido());
		
		for (Movibles m : listaMovibles) {
			m.moverseRapido( );
		}
		
		
		//Las interfaces no se pueden instanciar 
		
		//Movibles m1 = new Movibles();
		
		
		//pero si podemos crear clases anonimas
		
		Movibles m1 = new Movibles() {
			
			//podemos crear atributos, pero es mu dificil
			//acceder a ekkis 
			public int atributo1;
			
			//suponemos que el objeto movibles en un barco :)
			@Override
			public void moverseRapido() {
				System.out.println("Soy un baco y me muevo a 345");
				
			}
			
			@Override
			public void moverseLento() {
				System.out.println("Soy un baco y me muevo a 230");
				
			}
		};
		listaMovibles.add(m1);
	}

}
