package patterns.observer.weatherCenter;

import java.util.ArrayList;
import java.util.List;

public class WeatherCenter implements Observable {
    private int temperature;
    private int humidity;
    private int windSpeed;
    private List<Observer> observerList = new ArrayList<>();

    public WeatherCenter(int temperature, int humidity, int windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        System.out.println("§§§ Weather center §§§ \nTemp: " + temperature + "\nHum: " + humidity + "\nWind: " + windSpeed);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
        observer.update(this);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    public void changeWeather(int temperature, int humidity, int windSpeed){
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        notifyObservers();
    }
}
