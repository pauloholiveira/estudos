package br.com.paulo.designpatterns.strategy.flies;

import br.com.paulo.designpatterns.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm Flying.!!!!");
		
	}

}
