package oop.radioLaighter;

public class Spiker {
    private int volume;

    public void increaseVolume() {
        volume = (volume < 100) ? volume + 5 : volume;
    }

    public void decreaseVolume() {
        volume = (volume > 0) ? volume - 5 : 0;
    }

    public void show(Stations station) {
        System.out.println("Station :" + station + "\n Volume :" + volume);
    }
}
