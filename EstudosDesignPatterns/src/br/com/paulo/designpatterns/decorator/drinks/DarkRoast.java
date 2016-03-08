package br.com.paulo.designpatterns.decorator.drinks;

import br.com.paulo.designpatterns.decorator.interfaces.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return 1.00;
	}

}