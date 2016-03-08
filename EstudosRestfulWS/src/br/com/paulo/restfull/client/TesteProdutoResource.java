package br.com.paulo.restfull.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import br.com.paulo.restfull.entities.Produto;

public class TesteProdutoResource {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/produtos/1/xml");
		
		Response response = target.request().get();
		String xml = response.readEntity(String.class);
		System.out.println (xml);
		
		response = target.request().get();
		Produto produto = response.readEntity(Produto.class);
		System.out.println(produto.getId());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		
		target = client.target("http://localhost:8080/produtos/1/json");
		
		response = target.request().get();
		String json = response.readEntity(String.class);
		System.out.println(json);
		
		response = target.request().get();
		produto = response.readEntity(Produto.class);
		System.out.println(produto.getId());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
	}

}
