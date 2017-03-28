package SanchezBlancoManuelExamenRepaso;

public class Murcielago extends Mamifero {
	private int alas = 2;
	private int patas = 2;

	Murcielago(String nombre) {
		super(nombre);
	}

	@Override
	protected String alimentar() {

		return "Comiendo Insectos";
	}

	@Override
	protected String desplazar() {

		return "Vuela";
	}

	@Override
	public String toString() {
		return "Murcielago [alas=" + alas + ", patas=" + patas + "]";
	}

}
