package br.com.paulo.estudosws.consumer;

import br.com.paulo.estudosejbws.Calculadora;
import br.com.paulo.estudosejbws.CalculadoraService;

public class ConsumerCalc {

	public static void main(String[] args) {
		//service
		CalculadoraService calculadoraService = new CalculadoraService();
		
		//proxy
		Calculadora proxy = calculadoraService.getCalculadoraPort();
		
		//operation
		double soma = proxy.soma(50.00, 100.00);
		double subtracao = proxy.subtracao(100.00, 10.00);
		double multiplicacao = proxy.multiplicacao(5.00, 100.00);
		double divisao = proxy.divisap(500.00, 100.00);
		
		System.out.println("Result soma operation: " + soma);
		System.out.println("Result subtracao operation: " + subtracao);
		System.out.println("Result multiplicacao operation: " + multiplicacao);
		System.out.println("Result divisao operation: " + divisao);

	}

}
