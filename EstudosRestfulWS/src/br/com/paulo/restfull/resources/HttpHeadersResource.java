package br.com.paulo.restfull.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path ("/http-headers")
public class HttpHeadersResource {

	@GET
	@Produces (MediaType.TEXT_PLAIN)
	public String addUser (@Context HttpHeaders headers){

		String userAgent = headers.getRequestHeader("User-Agent").get(0);

		return "user-agent:" + userAgent;
	}
}