package br.com.paulo.designpatterns.strategy.ducks;

import br.com.paulo.designpatterns.strategy.flies.FlyNoWay;
import br.com.paulo.designpatterns.strategy.quacks.MuteQuack;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		flybehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("I'm a Decoy Duck");
		
	}

}
