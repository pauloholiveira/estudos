package br.com.paulo.designpatterns.strategy.ducks;

import br.com.paulo.designpatterns.strategy.interfaces.FlyBehavior;
import br.com.paulo.designpatterns.strategy.interfaces.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flybehavior;
	protected QuackBehavior quackBehavior;
	
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!!");
	}
	
	public abstract void display();
	
	public void performFly(){
		flybehavior.fly();
	}

	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}

	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
