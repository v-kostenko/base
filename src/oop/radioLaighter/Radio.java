package oop.radioLaighter;

enum Stations {
    RADIO_ROCKS(100.1, "Radio Rocks"), HIT_FM(200.2, "Hit FM"), LUX_FM(300.3, "Lux FM"),
    EUROPA_PLUS(400.4, "Europa +");

    private double wave;
    private String title;

    Stations(double wave, String title) {
        this.wave = wave;
        this.title = title;
    }

    public double getWave() {
        return wave;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Stations{" +
                "wave=" + wave +
                ", title='" + title + '\'' +
                '}';
    }
}

public class Radio {
    private Stations[] stations = Stations.values();
    private int currentStation;
    private Spiker spiker = new Spiker();
    private boolean isOnOff;

    public void radioTurnOnOFF(){
        if (!isOnOff){
            isOnOff = true;
            spiker.show(stations[currentStation]);
        }
    }

    public void next() {
        // Проверить включенол ли радио
        currentStation++;
        if (currentStation >= stations.length) {
            currentStation = 0;
        }
        spiker.show(stations[currentStation]);
    }

    public void previous() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = stations.length - 1;
        }
        spiker.show(stations[currentStation]);
    }

    public void plusVolume(){
        spiker.increaseVolume();
    }

    public void minusVolume(){
        spiker.decreaseVolume();
    }


}
