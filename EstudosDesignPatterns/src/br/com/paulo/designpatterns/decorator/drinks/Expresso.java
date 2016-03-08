package br.com.paulo.designpatterns.decorator.drinks;

import br.com.paulo.designpatterns.decorator.interfaces.Beverage;

public class Expresso extends Beverage {

	public Expresso(){
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
