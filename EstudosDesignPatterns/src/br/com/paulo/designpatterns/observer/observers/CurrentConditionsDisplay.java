package br.com.paulo.designpatterns.observer.observers;

import java.util.Observable;
import java.util.Observer;

import br.com.paulo.designpatterns.observer.interfaces.DisplayElements;
//import br.com.paulo.designpatterns.observer.interfaces.Observer;
//import br.com.paulo.designpatterns.observer.interfaces.Subject;
import br.com.paulo.designpatterns.observer.subjects.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElements {

	private float temperature;
	private float humidity;
	//private Subject weatherData;
	private Observable weatherData; //precisa ter uma referencia ao observador
	
	/*public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}*/
	public CurrentConditionsDisplay(Observable weatherData){
		this.weatherData = weatherData;
		//weatherData.registerObserver(this);
		weatherData.addObserver(this);
	}
	
	/*@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}*/
	@Override
	public void update(Observable obs, Object arg) {//este é o método que avisa os observadores.
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.humidity = weatherData.getHumidity();
			this.temperature = weatherData.getTemperature();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: " + temperature + " F degrees and " + humidity + "% humidity");
		
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	/*public Subject getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
	}*/
	public Observable getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(Observable weatherData) {
		this.weatherData = weatherData;
	}

}
