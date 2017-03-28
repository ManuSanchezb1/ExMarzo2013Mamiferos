package SanchezBlancoManuelExamenRepaso;

public class Foca extends Mamifero {
	private int patas = 4;

	public Foca(String nombre) {
		super(nombre);

	}

	@Override
	protected String alimentar() {

		return "Comiendo peces, crustaceos o cefalopodos variados";
	}

	@Override
	protected String desplazar() {

		if (etapa == Etapa.CRIA) {
			return "reptando torpemente";
		} else
			return "reptando o nadando";
	}

	@Override
	public String toString() {
		return "Foca [patas=" + patas + "]";
	}

}
