package exerc07;

public class Cone {

	private float raio;
	private float altura;

	/**
	 * @param raio
	 * @param altura
	 */

	public Cone(float raio, float altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	// (Responsabilidade) Calculo da quest�o

	public float geratrizCone() {
		return (float) Math.pow((Math.pow(this.getAltura(), 2) + Math.pow(this.getRaio(), 2)), 2);

	}

	public float volumeCone() {

		return (float) (1 / 3 * (3.1415 * (Math.pow(this.getRaio(), 2)) * this.getAltura()));
	}

//	 Como pegar o resultado de uma conta
	public float areaLateral() {
		return (float) (3.1415 * this.getRaio() * this.geratrizCone());
	}

	public float areaTotal() {
		return (float) ((3.1415 * this.getRaio() * (this.geratrizCone() + this.getRaio())));
	}

}