package es.codeurjc.javatest;

import org.junit.Test;

import es.codeurjc.javatest.Calculadora;

import static org.junit.Assert.*;

public class CalculadoraTest {

	@Test
	public void testSuma() {

		// Arrange
		Calculadora calculadora = new Calculadora();

		// Act
		double res = calculadora.suma(1, 1);

		// Assert
		assertEquals(2, res, 0);
	}
}