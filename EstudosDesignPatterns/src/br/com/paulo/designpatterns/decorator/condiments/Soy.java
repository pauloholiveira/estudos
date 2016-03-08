package br.com.paulo.designpatterns.decorator.condiments;

import br.com.paulo.designpatterns.decorator.interfaces.Beverage;
import br.com.paulo.designpatterns.decorator.interfaces.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .30;
	}
}