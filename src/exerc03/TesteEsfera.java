package exerc03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteEsfera {

	public static void main(String[] args) {

		Esfera valor;
		
		Scanner leitor = new Scanner(System.in);
		
		Double auxLeitura = null;
		Scanner leitor = new Scanner(System.in);		
		do {						
			System.out.printf("Digite a %s:",nomeVariavel);
			try {
				auxLeitura = leitor.nextDouble(); //
			}catch (InputMismatchException e) {
				System.out.printf(
						"%s inv�lida, redigite!\n",
						nomeVariavel);
				leitor.nextLine();
			}
			
		}while(auxLeitura == null);
		return auxLeitura;
		
			
			try {
				valor = new Esfera(raio);

				System.out.printf("�rea da esfera: %.2fm�", valor.areaTotalEsfera());
				System.out.printf("\n\nVolume da esfera: %.2fm�", valor.volumeEsfera());

			} catch (Exception e) {
				
				e.printStackTrace();
		
			}
		}
		
		

	}

}
