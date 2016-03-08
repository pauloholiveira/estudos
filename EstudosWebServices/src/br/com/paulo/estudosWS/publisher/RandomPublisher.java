package br.com.paulo.estudosWS.publisher;

import javax.xml.ws.Endpoint;

import br.com.paulo.estudosWS.Random;

public class RandomPublisher {

	public static void main(String[] args) {
		System.out.println("Random web service start...");
		Random random = new Random();//Random é o nosso WS.
		Endpoint.publish("http://localhost:9090/random", random);
		System.out.println("Random web service started...");
	}
}
