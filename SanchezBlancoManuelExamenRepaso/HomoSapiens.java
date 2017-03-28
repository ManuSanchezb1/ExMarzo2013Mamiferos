package SanchezBlancoManuelExamenRepaso;

public class HomoSapiens extends Mamifero {
	private int brazos = 2;
	private int piernas = 2;

	public HomoSapiens(String nombre) {
		super(nombre);

	}

	@Override
	protected String alimentar() {

		return "Comiendo de todo";
	}

	@Override
	protected String desplazar() {

		if (etapa == Etapa.CRIA) {
			return "gateando";
		} else
			return "corriendo";
	}

	@Override
	public String toString() {
		return "HomoSapiens [brazos=" + brazos + ", piernas=" + piernas + "]";
	}

}
