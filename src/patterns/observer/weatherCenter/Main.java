package patterns.observer.weatherCenter;

public class Main {
    public static void main(String[] args) {

        GisMeteo gisMeteo = new GisMeteo(0, 0, 0);
        SinopticUa sinopticUa = new SinopticUa(0, 0, 0);
        System.out.println("");

        WeatherCenter weatherCenter = new WeatherCenter(0, 35, 5);
        weatherCenter.addObserver(gisMeteo);
        weatherCenter.addObserver(sinopticUa);
        System.out.println("--------------------------------------------------------");

        weatherCenter.changeWeather(100, 1000, 3232323);
        System.out.println("--------------------------------------------------------");

        weatherCenter.deleteObserver(gisMeteo);
        weatherCenter.addObserver(new WeatherOnline(0, 0, 0));
        System.out.println("--------------------------------------------------------");

        weatherCenter.changeWeather(99999, 99999, 99999);

















    }
}
