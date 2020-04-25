package exerc02;

public class Piramide {
	
	public Piramide(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Piramide [base= " + base + ", altura= " + altura + "]";
	}
		
		public double calculaVolume() {
			
			return (this.getBase() * this.getAltura() )*1/3;
		}
	}
