package br.com.paulo.designpatterns.decorator.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import br.com.paulo.designpatterns.decorator.IODecorator.LowerCaseInputStream;
import br.com.paulo.designpatterns.decorator.condiments.Mocha;
import br.com.paulo.designpatterns.decorator.condiments.Soy;
import br.com.paulo.designpatterns.decorator.condiments.Whip;
import br.com.paulo.designpatterns.decorator.drinks.DarkRoast;
import br.com.paulo.designpatterns.decorator.drinks.Expresso;
import br.com.paulo.designpatterns.decorator.drinks.HouseBlend;
import br.com.paulo.designpatterns.decorator.interfaces.Beverage;

public class StarBuzzCoffee {

	public static void main(String[] args) throws IOException {
		Beverage drink = new Expresso();
		System.out.println(drink.getDescription() + " $ "+ drink.cost());
		
		Beverage drink2 = new DarkRoast();
		
		drink2 = new Mocha(drink2);
		drink2 = new Mocha(drink2);
		drink2 = new Whip(drink2);
		System.out.println(drink2.getDescription() + " $ "+ drink2.cost());
		
		Beverage drink3 = new HouseBlend();
		
		drink3 = new Soy(drink3);
		drink3 = new Mocha(drink3);
		drink3 = new Whip(drink3);
		System.out.println(drink3.getDescription() + " $ "+ drink3.cost());
		
		
		//Test com decodrator IO
		int c;
		//Decodrator tem o conceito de adicionar funcoinalidade.
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File("test.txt"))));
		
		while((c = in.read()) >= 0){
			System.out.print((char)c);
		}
		
		in.close();
	}

}
