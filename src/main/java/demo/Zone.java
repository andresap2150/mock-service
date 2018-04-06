package demo;

public class Zone {
	private String[] Envigado;
	private BelloSubZone Bello;
	private SabanetaSubZone Sabaneta;
	private LaEstrellaSubZone LaEstrella;
	private ItaguiSubZone Itagui;
	private MedellinSubZone Medellin;
	
	public MedellinSubZone getMedellin() {
		return Medellin;
	}
	public void setMedellin(MedellinSubZone medellin) {
		Medellin = medellin;
	}
	public ItaguiSubZone getItagui() {
		return Itagui;
	}
	public void setItagui(ItaguiSubZone itagui) {
		Itagui = itagui;
	}
	public String[] getEnvigado() {
		return Envigado;
	}
	public void setEnvigado(String[] envigado) {
		Envigado = envigado;
	}
	
	public BelloSubZone getBello() {
		return Bello;
	}
	public void setBello(BelloSubZone bello) {
		Bello = bello;
	}
	
	public SabanetaSubZone getSabaneta() {
		return Sabaneta;
	}
	public void setSabaneta(SabanetaSubZone sabaneta) {
		Sabaneta = sabaneta;
	}
	public LaEstrellaSubZone getLaEstrella() {
		return LaEstrella;
	}
	public void setLaEstrella(LaEstrellaSubZone laEstrella) {
		LaEstrella = laEstrella;
	}
	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}
}
