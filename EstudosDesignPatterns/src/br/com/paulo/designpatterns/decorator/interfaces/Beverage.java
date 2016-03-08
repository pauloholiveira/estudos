package br.com.paulo.designpatterns.decorator.interfaces;

public abstract class Beverage {
	
	protected String description ="Unknown beverage";
	
	public Beverage(){}
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
