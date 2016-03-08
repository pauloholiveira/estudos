package br.com.paulo.designpatterns.strategy.flies;

import br.com.paulo.designpatterns.strategy.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't Fly!!!!");
	}

}
