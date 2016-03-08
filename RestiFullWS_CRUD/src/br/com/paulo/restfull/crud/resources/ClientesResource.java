package br.com.paulo.restfull.crud.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.paulo.restfull.crud.entities.Cliente;


@Path("/clientes")
public class ClientesResource {
	
	private static List<Cliente> lista;
	private static int id = 0;
	
	static {
		 lista = new ArrayList<Cliente>();
		 id = 0;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listaCliente(){
		return lista;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente adcionaCliente(Cliente cliente){
		id++;
		
		cliente.setId(""+id);
		lista.add(cliente);
		
		return cliente;
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente atualizaCliente(Cliente cliente, @PathParam("id") String id){
		Cliente cliente_existente = obterClienteById(id);
		
		if(cliente_existente != null){
			cliente_existente.setNome(cliente.getNome());
			cliente_existente.setCpf(cliente.getCpf());
			cliente_existente.setRg(cliente.getRg());
		}
		
		return cliente_existente;
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente deleteCliente(@PathParam("id") String id){
		Cliente cliente = obterClienteById(id);
		
		if(cliente != null){
			lista.remove(cliente);
		}
		
		return cliente;
	}
	
	private Cliente obterClienteById(String id){
		for(Cliente c : lista){
			if(c.getId().equals(id)){
				return c;
			}
		}
		
		return null;
	}
}
