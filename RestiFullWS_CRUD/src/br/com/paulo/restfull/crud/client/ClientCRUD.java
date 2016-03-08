package br.com.paulo.restfull.crud.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import br.com.paulo.restfull.crud.entities.Cliente;

public class ClientCRUD {
	public static void main(String args[]){
		//Obtém a lista
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/clientes");
		
		Response response = target.request().get();		
		String clientes = response.readEntity(String.class);
		System.out.println("Clientes existentes: " + clientes);
		System.out.println("");
		
		//Insere um item
		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080/clientes");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Teste");
		cliente.setCpf("Teste");
		cliente.setRg("Teste");
		response = target.request().post(Entity.xml(cliente));
		String json = response.readEntity(String.class);
		System.out.println("Cliente inserido1: " + json);
		
		//Insere outro item
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Teste2");
		cliente2.setCpf("Teste2");
		cliente2.setRg("Teste2");
		response = target.request().post(Entity.xml(cliente2));
		json = response.readEntity(String.class);
		System.out.println("Cliente inserido2: " + json);
		System.out.println("");
		
		//Atualiza um item
		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080/clientes/1");
		cliente.setNome("Novo Nome");
		
		response = target.request().put(Entity.xml(cliente));
		json = response.readEntity(String.class);
		System.out.println("Cliente atualizado: " + json);
		System.out.println("");
		
		//Apaga um cliente
		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080/clientes/2");
		
		response = target.request().delete();
		json = response.readEntity(String.class);
		System.out.println("Cliente removido: " + json);
		System.out.println("");
		
		//Obtém a lista
		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080/clientes");
		
		response = target.request().get();		
		clientes = response.readEntity(String.class);
		System.out.println("Clientes existentes: " + clientes);
		System.out.println("");
		
	}
}