package br.com.paulo.designpatterns.strategy;

import br.com.paulo.designpatterns.strategy.ducks.DecoyDuck;
import br.com.paulo.designpatterns.strategy.ducks.Duck;
import br.com.paulo.designpatterns.strategy.ducks.MallardDuck;
import br.com.paulo.designpatterns.strategy.ducks.RedHeadDuck;
import br.com.paulo.designpatterns.strategy.ducks.RubberDuck;

public class SimuDuck {

	public static void main(String[] args) {
		Duck pato = new MallardDuck();
		
		pato.display();
		pato.performFly();
		pato.performQuack();
		pato.swim();
		
		pato = new DecoyDuck();
		
		pato.display();
		pato.performFly();
		pato.performQuack();
		pato.swim();
		
		pato = new RubberDuck();
		
		pato.display();
		pato.performFly();
		pato.performQuack();
		pato.swim();
		
		pato = new RedHeadDuck();
		
		pato.display();
		pato.performFly();
		pato.performQuack();
		pato.swim();

	}

}
