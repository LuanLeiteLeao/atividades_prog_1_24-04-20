package exerc04;

public class Retangulo {
	
	private double comprimento;
	private double largura;
	
	/*
	 * Para quê serve esta parte?
	 */
	public Retangulo(double comprimento, double largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	/*
	 * Getters in Setters
	 */
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calculaPerimetro() {
		return (this.getLargura()*2) + (this.getComprimento()*2); 
	}
	
	public double calculaAreaRetangulo() {
		return this.getComprimento()*this.getLargura();
	}
}
