package br.edu.unip.aula.testes_engenharia_software;

public class IMC {
	public String CalculaImc(Double peso, Double altura) {
		Double imc = peso / (altura * 2);

		if (imc < 18.5) {
			return "Abaixo do peso";
		}else if(imc >= 18.5 && imc < 24.9){
			return "Peso normal";
		}else if(imc >= 25 && imc < 29.9) {
			return "Sobrepeso";
		}else if(imc >= 30 && imc < 34.9) {
			return "Obesidade nivel 1";
		}else if(imc >= 35 && imc < 39.9) {
			return "Obesidade nivel 2";
		}else {
			return "Obesidade nivel 3";
		}
	}
}
