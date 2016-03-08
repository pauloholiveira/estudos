package br.com.paulo.designpatterns.strategy.quacks;

import br.com.paulo.designpatterns.strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
		
	}

}
