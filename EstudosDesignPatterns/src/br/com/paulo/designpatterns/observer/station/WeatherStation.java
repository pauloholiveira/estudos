package br.com.paulo.designpatterns.observer.station;

import br.com.paulo.designpatterns.observer.observers.CurrentConditionsDisplay;
import br.com.paulo.designpatterns.observer.subjects.WeatherData;

public class WeatherStation {
	@SuppressWarnings("unused")
	public static void main(String args[]){
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
		
		data.setMeasurements(80.66F, 65.56F, 30.22F);
		data.setMeasurements(82.66F, 70.56F, 29.22F);
		data.setMeasurements(78.66F, 90.56F, 29.22F);
	}
}
