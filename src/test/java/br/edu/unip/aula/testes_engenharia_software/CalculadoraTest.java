package br.edu.unip.aula.testes_engenharia_software;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void SomarComSucesso() {
		Calculadora calculadora = new Calculadora();
		
		Integer esperado = 15;
		
		Integer resultado = calculadora.Somar(10, 5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarSituacaoAlunoAprovado() {
		Calculadora calculadora = new Calculadora();
		
		String esperado = "Aprovado";
		String resultado = calculadora.VerificarSituacaoAluno(7.5, 9.5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarSituacaoAlunoRecuperacao() {
		Calculadora calculadora = new Calculadora();
		
		String esperado = "Recuperação";
		String resultado = calculadora.VerificarSituacaoAluno(5.5, 4.5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void VerificarSituacaoAlunoReprovado() {
		Calculadora calculadora = new Calculadora();
		
		String esperado = "Reprovado";
		String resultado = calculadora.VerificarSituacaoAluno(2.5, 4.5);
		
		assertEquals(esperado, resultado);
	}
}
