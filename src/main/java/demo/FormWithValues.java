package demo;

public class FormWithValues {
	
	private String[] prioridad;
	private String[] Genero;
	private String[] CompartirVivienda;
	private String[] Ocupacion;
	private String[] TransportePrincipal;
	private String[] TransportePropio;
	private LifesStyles EstilosVida;
	private Zone Zonas;
	public LifesStyles getEstilosVida() {
		return EstilosVida;
	}
	public void setEstilosVida(LifesStyles estilosVida) {
		EstilosVida = estilosVida;
	}
	public String[] getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String[] prioridad) {
		this.prioridad = prioridad;
	}
	public String[] getGenero() {
		return Genero;
	}
	public void setGenero(String[] genero) {
		Genero = genero;
	}
	public String[] getCompartirVivienda() {
		return CompartirVivienda;
	}
	public void setCompartirVivienda(String[] compartirVivienda) {
		CompartirVivienda = compartirVivienda;
	}
	public String[] getOcupacion() {
		return Ocupacion;
	}
	public void setOcupacion(String[] ocupacion) {
		Ocupacion = ocupacion;
	}
	public String[] getTransportePrincipal() {
		return TransportePrincipal;
	}
	public void setTransportePrincipal(String[] transportePrincipal) {
		TransportePrincipal = transportePrincipal;
	}
	public String[] getTransportePropio() {
		return TransportePropio;
	}
	public void setTransportePropio(String[] transportePropio) {
		TransportePropio = transportePropio;
	}
	public Zone getZonas() {
		return Zonas;
	}
	public void setZonas(Zone zonas) {
		Zonas = zonas;
	}
	public FormWithValues() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
