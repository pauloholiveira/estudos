package br.com.paulo.designpatterns.strategy.quacks;

import br.com.paulo.designpatterns.strategy.interfaces.QuackBehavior;


public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

}
