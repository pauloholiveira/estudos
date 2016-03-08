package br.com.paulo.restfull.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class TesteCotacaoResource{
	public static void main(String[]args){
		//Constroi o client
		Client client=ClientBuilder.newClient();
		
		//obtem o target do client.
		WebTarget target = client.target("http://localhost:8080/Cotacao/DollarToReal");
		//obtem a resposta.
		Response response = target.request().get();
		//le a resposta
		String cotacao = response.readEntity(String.class);
		
		System.out.println(cotacao);
	}
}
