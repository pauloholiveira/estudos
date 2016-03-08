package br.com.paulo.estudosEJBWS;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Stateless
public class Calculadora {
	
	@WebMethod
	public double soma (double op1, double op2){
		return op1+op2;
	}
	
	@WebMethod
	public double subtracao (double op1, double op2){
		return op1-op2;
	}
	
	@WebMethod
	public double multiplicacao (double op1, double op2){
		return op1*op2;
	}
	
	@WebMethod
	public double divisap (double op1, double op2){
		if(op2==0.0){
			throw new RuntimeException ("Divisão por Zero.");
		}
		
		return op1/op2;
	}
}