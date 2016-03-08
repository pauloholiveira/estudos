package br.com.paulo.taxi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;
import br.com.paulo.distanciaws.DistanciaWS;
import br.com.paulo.distanciaws.DistanciaWSService;
import br.com.paulo.precogasws.PrecoGasolinaWS;
import br.com.paulo.precogasws.PrecoGasolinaWSService;
import br.com.paulo.validacaows.ValidaCPFCNPJWS;
import br.com.paulo.validacaows.ValidaCPFCNPJWSService;

public class PrincipalTaxi {
	
	public static String endereco_aeroporto = "Aeroporto Internacional de São Paulo";
	
	public static int consumo_medio_taxi_kmL = 10;
	
	public static Map<String, Currency> moedas;
	
	static{
		moedas = new HashMap<String, Currency>();
		
		moedas.put("BRL", Currency.BRL);
		moedas.put("USD", Currency.USD);
		moedas.put("EUR", Currency.EUR);
	}
	
	public static Currency moeda_default = Currency.BRL;
	
	
	public static void main(String[] args) throws IOException {
		Currency moeda;
		String documento = "";
		String endereco = "";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Sistema Taxi Aero Porto");
		System.out.print("Digite CNPJ ou CPF: "); documento = reader.readLine();
		System.out.println("");
		
		//service validacao
		ValidaCPFCNPJWSService validaService = new ValidaCPFCNPJWSService();
		ValidaCPFCNPJWS valida = validaService.getValidaCPFCNPJWSPort();
		
		if(valida.validarCPFouCNPJ(documento)){
			
			System.out.print("Digite o Número Correspondente a Moeda de Pagamento: ");
			System.out.println("\nBRL - REAL");
			System.out.println("USD - DOLLAR");
			System.out.println("EUR - EURO");
			
			moeda = moedas.get(reader.readLine());
			System.out.println("");
			
			System.out.print("Endereço Destino: "); endereco = reader.readLine();
			System.out.println("");
			System.out.println("");
			
			//service distancia
			DistanciaWSService distanciaService = new DistanciaWSService();
			DistanciaWS calcDist = distanciaService.getDistanciaWSPort();
			
			double dist_calculada = calcDist.calculaDistancia(endereco_aeroporto, endereco);
			System.out.println("Distancia entre o Aeroporto e " + endereco + " é de : " + dist_calculada + " KMs");
			System.out.println("");
			
			//Assumir uma taxa de consumo do taxi. (ex. 10 km p/litro).
			//Calcular quantidade de litros que irá gastar para percorrer o km pedido.
			double litros_gastos = dist_calculada / (double)consumo_medio_taxi_kmL;
			System.out.println("Litros gastos no Trajeto("+consumo_medio_taxi_kmL+"KM/Ls) " + litros_gastos);
			System.out.println("");
			
			//Multiplicar os litros gastos pelo valor do litro.
			//service ValorLitro
			PrecoGasolinaWSService valor_litro = new PrecoGasolinaWSService();
			PrecoGasolinaWS valor = valor_litro.getPrecoGasolinaWSPort();
			double preco = valor.precoGasolina();
			System.out.println("Preço do Litro: " + preco + "(R$)");
			System.out.println("");
			
			double valor_total_gasto = preco * litros_gastos;
			System.out.println("Total (R$): " + valor_total_gasto);
			System.out.println("");
			
			//O valor total, converter de Real para a moeda escolhida.
			//service Cotação
			CurrencyConvertor cotacao_service = new CurrencyConvertor();
			CurrencyConvertorSoap cotacaoWS = cotacao_service.getCurrencyConvertorSoap();
			
			double fator_conversao = cotacaoWS.conversionRate(moeda_default, moeda);
			double total_convertido = valor_total_gasto * fator_conversao;
			System.out.println("O valor total do Taxi em " + moeda + ": " + (total_convertido));
			System.out.println("");
		} else{
			System.out.println("Documento inserido é inválido");
		}
	}

}
