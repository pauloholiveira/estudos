package br.com.paulo.restfull.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import br.com.paulo.restfull.entities.Produto;

public class TesteConversorDeProdutoResource {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		
		Produto p = new Produto();
		p.setId(1L);
		p.setNome("Bola");
		p.setPreco(45.67) ;
		
		WebTarget target = client.target("http://localhost:8080/produtos/converte/json/xml");
		Response response = target.request().post(Entity.json(p));
		String xml = response.readEntity(String.class);
		System.out.println(xml);
		
		target = client.target("http://localhost:8080/produtos/converte/xml/json");
		response = target.request().post(Entity.xml(p));
		String json = response.readEntity (String.class);
		System.out.println(json);
	}
}