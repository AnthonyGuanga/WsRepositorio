package ordenador;

import java.util.ArrayList;

public class Ordenador {
	
	double precio;
	Procesador procesador;
	TarjetaGrafica tarjetaGrafica;
	PlacaBase placaBase;
	ArrayList <RAM> listaRAMs;
	ArrayList<Periferico>listaPerifericos;
	
	public Ordenador() {
		
	}
	public Ordenador(double precio, Procesador procesador, TarjetaGrafica tarjetaGrafica, PlacaBase placaBase,
			ArrayList<RAM> listaRAMs, ArrayList<Periferico> listaPerifericos) {
		super();
		this.precio = precio;
		this.procesador = procesador;
		this.tarjetaGrafica = tarjetaGrafica;
		this.placaBase = placaBase;
		this.listaRAMs = listaRAMs;
		this.listaPerifericos = listaPerifericos;
	}

	@Override
	public String toString() {
		return "Usuario [precio=" + precio + ", procesador=" + procesador + ", placaBase=" + placaBase + ", listaRAMs="
				+ listaRAMs + ", listaPerifericos=" + listaPerifericos + "]";
	}

	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	public ArrayList<RAM> getListaRAMs() {
		return listaRAMs;
	}

	public void setListaRAMs(ArrayList<RAM> listaRAMs) {
		this.listaRAMs = listaRAMs;
	}

	public ArrayList<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}

	public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}

	public void calcularPrecio() {
		this.precio = this.precio+ procesador.getPrecio()+ placaBase.getPrecio() +
				tarjetaGrafica.getPrecio();
		
		for (Periferico periferico : listaPerifericos) {
			this.precio = this.precio + periferico.getPrecio();
		}
		for (RAM ram : listaRAMs) {
			this.precio = this.precio + ram.getPrecio();
		}
		
	}
	
	
		
}
