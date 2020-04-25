package exerc03;

public class Esfera {
	
	private double raio;
	
	/**
	 * @param raio
	 */
	public Esfera(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double areaTotalEsfera()
	{
		return 4 * 3.1415 * Math.pow(this.getRaio(), 2);
	}
	
	public double volumeEsfera() {
		
		return 4/3 * (3.1415 * Math.pow(this.getRaio(), 3));
	}
}
