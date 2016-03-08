package br.com.paulo.designpatterns.strategy.ducks;

import br.com.paulo.designpatterns.strategy.flies.FlyNoWay;
import br.com.paulo.designpatterns.strategy.quacks.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flybehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("I'm a Rubber Duck");
		
	}

}
