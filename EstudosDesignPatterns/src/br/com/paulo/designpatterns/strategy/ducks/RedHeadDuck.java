package br.com.paulo.designpatterns.strategy.ducks;

import br.com.paulo.designpatterns.strategy.flies.FlyWithWings;
import br.com.paulo.designpatterns.strategy.quacks.Quack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flybehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a RedHead Duck");
		
	}

}
