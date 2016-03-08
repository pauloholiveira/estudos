package br.com.paulo.designpatterns.decorator.condiments;

import br.com.paulo.designpatterns.decorator.interfaces.Beverage;
import br.com.paulo.designpatterns.decorator.interfaces.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}
}