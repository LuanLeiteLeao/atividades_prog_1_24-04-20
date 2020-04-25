package exerc01;

import java.util.Scanner;

public class TestePessoa {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite idade: ");
		int idade = leitor.nextInt();
		System.out.println("Digite peso: ");
		
		float peso = (float) leitor.nextDouble();
		System.out.println("Digite a altura: ");
		float altura = (float) leitor.nextDouble();
		
		
		Pessoa pes = new Pessoa(nome, idade, peso, altura);
		System.out.println(pes);
		System.out.printf("IMC: %.2f",pes.calcularIMC());
		
	}
}
