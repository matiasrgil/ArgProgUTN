package Calculadora;

import java.util.Scanner;

public class Calculadora {
	double unNumero, otroNumero;
	
	public Calculadora (double a, double b) {
		unNumero = a;
		otroNumero = b;
	}
	
	public double sumar() {
		double resultado = unNumero + otroNumero;
		return resultado;
	}
	
	public double restar () {
		double resultado = unNumero - otroNumero;
		return resultado ;
	}
	
	public double multiplicar () {
		double resultado = unNumero * otroNumero;
		return resultado ;
	}
	
	public double dividir () {
		double resultado = unNumero / otroNumero;
		return resultado ;
	}
	
}

/*
*/