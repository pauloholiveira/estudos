package br.com.paulo.restfull.resources;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class DownloadResource {
	@GET
	@Path("/texto")
	@Produces("text/plain")
	public Response getTexto() {
	
		File file = new File("texto.txt");
	
		ResponseBuilder response = Response.ok((Object)file);
		response.header("Content-Disposition", "attachment;filename=\"texto.txt\"");
		return response.build();
	}
	
	@GET
	@Path("/imagem")
	@Produces ("image/png")
	public Response getImagem() {
	
		File file = new File ("k19-logo.png");
		
		ResponseBuilder response = Response.ok((Object)file);
		response.header("Content-Disposition","attachment;filename=\"k19-logo.png\"");
		return response.build();
	}
}