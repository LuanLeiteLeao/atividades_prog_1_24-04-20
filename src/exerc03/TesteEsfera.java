package exerc03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteEsfera {

	public static void main(String[] args) {

		Esfera valor;

		Double auxLeitura = null;
		Scanner leitor = new Scanner(System.in);

		do {
			System.out.printf("Digite um n�mero: ");
			try {
				auxLeitura = leitor.nextDouble();
				valor = new Esfera(auxLeitura);

				System.out.printf("\n�rea da esfera: %.2f\n", valor.areaTotalEsfera());
				System.out.printf("\nVolume da esfera: %.2f\n\n\n", valor.volumeEsfera());

			} catch (InputMismatchException e) {

				System.out.println("Entrada Inv�lida Somento Double\n\n\n");
				auxLeitura = 0.0;

			} catch (Exception e) {
				System.out.println("Somente N�meros positivos\n\n\n\n");
			}
			leitor.nextLine();
			
		} while (auxLeitura != -90);


	}

}
