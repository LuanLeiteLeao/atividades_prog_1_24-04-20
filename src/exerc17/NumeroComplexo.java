package exerc17;

import java.util.Scanner;

import utils.AdicionarNum;

public class NumeroComplexo {
	private double real, imaginario;

	public NumeroComplexo(double real, double imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginario() {
		return imaginario;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

	public static NumeroComplexo soma(NumeroComplexo x, NumeroComplexo y) {

		return new NumeroComplexo(x.real - y.real, x.imaginario - y.imaginario);

	}
	
	/*
	 * public static NumeroComplexo adiciona(NumeroComplexo x, NumeroComplexo y) {
	 * return new soma()+NumeroComplexo(x.real-y.real,x.imaginario-y.imaginario); }
	 */
}
