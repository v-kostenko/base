package patterns.observer.weatherCenter;

public class SinopticUa implements Observer {

    private int temperatureCels;
    private int humidity;
    private double windSpeed; // m/sec

    public SinopticUa(int temperatureCels, int humidity, double windSpeed) {
        this.temperatureCels = temperatureCels;
        this.humidity = humidity;
        this.windSpeed = windSpeed;

    }

    public void giveAdvice(String advice) {
        System.out.println(advice);
    }

    public void forecast(int days) {
        //logic...
        System.out.println("Display forecast for " + days + " days");
    }

    public void showInfo(){
        System.out.println("--- Sinoptic UA --- \nTemp: " + temperatureCels + "\nHum: " + humidity + "\nWind: " + windSpeed);
    }


    @Override
    public void update(Observable observable) {
        WeatherCenter weatherCenter = (WeatherCenter) observable;
        temperatureCels = (weatherCenter.getTemperature() - 32) * 5 / 9;
        humidity = weatherCenter.getHumidity();
        windSpeed = weatherCenter.getWindSpeed() * 0.44704;
        System.out.println("--- Sinoptic UA --- \nTemp: " + temperatureCels + "cesl" + "\nHum: " + humidity + "\nWind: " + windSpeed + "m/s");
    }
}
