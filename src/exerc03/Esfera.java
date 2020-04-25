package exerc03;

import javax.management.RuntimeErrorException;

import utils.Valida;

public class Esfera {

	private double raio;

	public Esfera(double raio) throws Exception {
		super();

		this.setRaio(raio);

	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws Exception {
		
		Valida.validaNegativo(raio);
		
		this.raio = raio;
	}

	public double areaTotalEsfera() {
		return 4 * 3.1415 * Math.pow(this.getRaio(), 2);
	}

	public double volumeEsfera() {
		return 4 / 3 * (3.1415 * Math.pow(this.getRaio(), 3));
	}

}
