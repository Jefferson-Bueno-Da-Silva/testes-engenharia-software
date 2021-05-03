package br.edu.unip.aula.testes_engenharia_software;

import static org.junit.Assert.*;

import org.junit.Test;

public class IMCTest {
	@Test
	public void VerificarIMCAbaixo() {
		IMC imc = new IMC();
		
		String esperado = "Abaixo do peso";
		String resultado = imc.CalculaImc(50.0, 1.70);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarIMCNormal() {
		IMC imc = new IMC();
		
		String esperado = "Peso normal";
		String resultado = imc.CalculaImc(70.0, 1.70);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarIMCSobrepeso() {
		IMC imc = new IMC();
		
		String esperado = "Sobrepeso";
		String resultado = imc.CalculaImc(85.0, 1.70);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarIMCObesidade1() {
		IMC imc = new IMC();
		
		String esperado = "Obesidade nivel 1";
		String resultado = imc.CalculaImc(110.0, 1.70);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarIMCObesidade2() {
		IMC imc = new IMC();
		
		String esperado = "Obesidade nivel 2";
		String resultado = imc.CalculaImc(130.0, 1.70);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarIMCObesidade3() {
		IMC imc = new IMC();
		
		String esperado = "Obesidade nivel 3";
		String resultado = imc.CalculaImc(150.0, 1.70);
		
		assertEquals(esperado, resultado);
	}
}
