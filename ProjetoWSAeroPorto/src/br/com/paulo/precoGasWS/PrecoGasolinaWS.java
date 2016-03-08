package br.com.paulo.precoGasWS;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PrecoGasolinaWS {
	
	@WebMethod
	public float precoGasolina(){
		float preco = 3.24f;
		
		return preco;
	}
}
