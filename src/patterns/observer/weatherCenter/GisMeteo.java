package patterns.observer.weatherCenter;

public class GisMeteo implements Observer{
    private double temperatureKel;
    private int humidity;
    private double windSpeed; // m/sec

    public GisMeteo(double temperatureKel, int humidity, double windSpeed) {
        this.temperatureKel = temperatureKel;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public void rainProbability(){
        //logic...
        System.out.println("Rain probability ");
    }

    @Override
    public void update(Observable observable){
        WeatherCenter weatherCenter = (WeatherCenter) observable;
        this.temperatureKel = (weatherCenter.getTemperature() + 459.67) * 5/9;
        this.humidity = humidity;
        this.windSpeed = weatherCenter.getWindSpeed();
        System.out.println("--- Gis Meteo --- \n" + "Temperature: " + temperatureKel + "kel" + "\nHum: " + humidity + "%" + "\nWind: " + windSpeed + "m/s");
    }

}
