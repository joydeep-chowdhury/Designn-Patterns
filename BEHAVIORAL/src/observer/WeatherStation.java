package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observerList;
    
    
    
	public WeatherStation() {
		this.observerList=new ArrayList<Observer>();
	}

	


	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyObserver();
	}




	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyObserver();
	}





	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyObserver();
	}


	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer temp:observerList)
		{
			temp.update(pressure, temperature, humidity);
		}
		
	}

}
