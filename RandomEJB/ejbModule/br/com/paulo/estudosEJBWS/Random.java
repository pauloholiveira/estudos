package br.com.paulo.estudosEJBWS;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Stateless
public class Random {
	
	@WebMethod
	public double next (double max){
		return Math.random()*max;
	}
}