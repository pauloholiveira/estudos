package br.com.paulo.restfull.main;

import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer;

public class Publicador {

	public static void main(String[] args) {
		ResourceConfig rc = new ResourceConfig().packages(new String[]{"br.com.paulo.restfull.resources"});
		
		HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
	}

}
