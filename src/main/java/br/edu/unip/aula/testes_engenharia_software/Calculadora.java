package br.edu.unip.aula.testes_engenharia_software;

public class Calculadora {

	public Integer Somar(Integer a, Integer B) {
		Integer soma = a + B;
		return soma;
	}
	
	public String VerificarSituacaoAluno(Double nota1, Double nota2) {
		Double mediaDouble = (nota1 + nota2) / 2;
		if (mediaDouble <= 4) {
			return "Reprovado";
		}else if(mediaDouble > 4 && mediaDouble <=6){
			return "Recuperação";
		}else {
			return "Aprovado";
		}
	}
}
