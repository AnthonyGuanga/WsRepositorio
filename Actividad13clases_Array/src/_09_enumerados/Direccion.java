package _09_enumerados;

public class Direccion {

	private TipoVia TipoVia;
	private String nombreVia;
	
	public TipoVia getTipoVia() {
		return TipoVia;
	}
	public void setTipoVia(TipoVia tipoVia) {
		TipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	@Override
	public String toString() {
		return "Direccion [TipoVia=" + TipoVia + ", nombreVia=" + nombreVia + "]";
	}
	

	
	
	
	
}
