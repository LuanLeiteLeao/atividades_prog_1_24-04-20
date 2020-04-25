package exerc02;

import exerc02.Piramide;

public class TestePiramide {
	public static void main(String[] args) {
		
		Piramide volume = new Piramide(10,36);
		System.out.println(volume);
		System.out.printf("Volume = %.2f",volume.calculaVolume());
		
	}

}
