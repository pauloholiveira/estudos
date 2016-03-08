package br.com.paulo.cotacaoWS;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CotacaoMoedaWS {
	
	private static double cotacao[][] = {{1.00, 4.00, 5.00},
										{0.25, 1.00, 1.25},
										{0.20, 0.75, 1.00}};
	@WebMethod
	public double cotacao(double valor, int moeda, int moeda_dest){
		
		int from = moeda;
		int to = moeda_dest;
		
		double cotacao_valor = (cotacao[from][to]) * valor;
		
		return cotacao_valor;
	}
}
