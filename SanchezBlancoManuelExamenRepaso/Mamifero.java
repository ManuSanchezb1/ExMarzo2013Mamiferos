package SanchezBlancoManuelExamenRepaso;

public abstract class Mamifero {

	private String nombre;
	protected Etapa etapa;
	private int alimentan = 1;

	// Constructor

	Mamifero(String nombre) {
		setNombre(nombre);
		setEtapa(Etapa.CRIA);
	}

	protected String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getAlimentan() {
		return alimentan;
	}

	protected void setAlimentan(int alimentan) {
		this.alimentan = alimentan;
	}

	protected Etapa getEtapa() {
		return etapa;
	}

	protected void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	protected abstract String alimentar();

	protected abstract String desplazar();

	protected void crecer() {
		if (alimentan == 3) {

			this.setEtapa(Etapa.ADULTO);
		}
		alimentan++;
	}

	private String comprobarEtapa() {
		if (this.etapa == Etapa.ADULTO) {
		}
		return "Es adulto";
	}

	@Override
	public String toString() {
		return "Mamifero [nombre=" + nombre + ", etapa=" + etapa + ", alimentan=" + alimentan + "]";
	}
}
