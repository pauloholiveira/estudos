package br.com.paulo.designpatterns.observer.subjects;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Observable;

//import br.com.paulo.designpatterns.observer.interfaces.Observer;
//import br.com.paulo.designpatterns.observer.interfaces.Subject;

public class WeatherData extends Observable{/*implements Subject {*/

	//private List<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		//observers = new ArrayList<Observer>();
	}
	
	/*@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}*/

	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}

	public float getPressure(){
		return pressure;
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged(){
		setChanged();//avisa que houveram mudanças.
		notifyObservers();//notifica os observadores
		
	}
	
	/*@Override
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(this.temperature, this.humidity, this.pressure);
		}

	}*/
}
