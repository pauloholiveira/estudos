package br.com.paulo.designpatterns.decorator.condiments;

import br.com.paulo.designpatterns.decorator.interfaces.Beverage;
import br.com.paulo.designpatterns.decorator.interfaces.CondimentDecorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .50;
	}
}