package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

class CalculadoraTest {
	
	@Test
	void testUno() {
		/* El resultado de multiplicar 80 por 3 da 240*/
		Calculadora calcu = new Calculadora(80,3);
		double res = calcu.multiplicar();
		assertEquals(240,res);
	}
	
	@Test
	void testDos() {
		/*El resultado de sumar 150 y 180, dividido por 3, da 110*/
		Calculadora calcu1 = new Calculadora(150,180);
		double resSuma = calcu1.sumar();
		Calculadora calcu2 = new Calculadora(resSuma,3);
		double resDiv = calcu2.dividir();
		assertEquals(110,resDiv);
	}
	
	@Test
	void testTres() {
		/*El resultado de restar 90 y 50, multiplicado por 15, no da 605.*/
		Calculadora calcu1 = new Calculadora(90,50);
		double resResta = calcu1.restar();
		Calculadora calcu2 = new Calculadora(resResta,15);
		double resMulti = calcu2.multiplicar();
		
		boolean iguales = true; 
		
		if (605!=resMulti) {
			iguales = false;
		}
		assertFalse(iguales);
	}
	
	@Test
	void testCuatro() {
		/*El resultado de sumar 70 y 40, multiplicado por 25, no da 2700*/
		Calculadora calcu1 = new Calculadora(70,40);
		double resSuma = calcu1.sumar();
		Calculadora calcu2 = new Calculadora(resSuma,25);
		double resMulti = calcu2.multiplicar();
		
		boolean iguales = true; 
		
		if (2700!=resMulti) {
			iguales = false;
		}
		assertFalse(iguales);	
	}
}
