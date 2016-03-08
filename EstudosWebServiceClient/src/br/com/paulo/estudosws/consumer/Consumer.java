package br.com.paulo.estudosws.consumer;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.paulo.estudosws.Random;
import br.com.paulo.estudosws.RandomService;

public class Consumer {

	public static void main(String[] args) {
		//service
		RandomService randomService = new RandomService();
		
		//proxy
		Random proxy = randomService.getRandomPort();
		
		// username e password
		BindingProvider bp = (BindingProvider) proxy ;
		Map<String, List<String>> headers = new HashMap<String , List<String>>();
		headers.put("Username", Collections.singletonList("paulo.oliveira"));
		headers.put("Password", Collections.singletonList("parimo69"));
		bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS , headers );
		
		//operation
		double next = proxy.next(50.00);
		
		System.out.println("Result next operation: " + next);
	}

}
