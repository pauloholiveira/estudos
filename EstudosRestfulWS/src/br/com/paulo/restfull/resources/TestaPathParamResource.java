package br.com.paulo.restfull.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/path-param") //Define o caminho do Serviço.
public class TestaPathParamResource {
	@GET//Informa que será acessado por uma requisição GET.
	@Path ("/{p1}/{p2}")//Define os Paths dos parametros.
	@Produces(MediaType.TEXT_PLAIN) //Informa o tipo de saída da resposta.
	//@PathParam - Informa que estes parâmetros serão utilizados no path /p1/p2
	public String pathParam(@PathParam("p1")String p1, @PathParam("p2")String p2) {
		return "P1 = " + p1 + ", P2 = " + p2;
	}
}
