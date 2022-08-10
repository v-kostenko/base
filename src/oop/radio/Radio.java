package oop.radio;

public class Radio {
    private boolean isOn;
    private int volume;
    private double[] frequencies = {90.3, 100.1, 101.3, 107.2};
    private String[] stations = {"LuxFM", "Shanson", "Rock", "PoP"};
    private int activePosition;


    public void turnOnOff(){
        if (!isOn){
            isOn = true;
            System.out.println("Now playing " + frequencies[activePosition] + "| " + stations[activePosition] + "| Volume "
            + volume);
        } else {
            isOn = false;
        }
    }

    public void volumeIncrease(){
        if (!isOn){
            return;
        }
        volume = (volume == 100) ? volume : volume + 1;
        System.out.println("Station " + frequencies[activePosition] + " " + stations[activePosition] +
                " Volume " + volume);
    }

    public void volumeDecrease(){
        if (!isOn){
            return;
        }
        volume = (volume == 0) ? volume : volume - 1;
        System.out.println("Station " + frequencies[activePosition] + " " + stations[activePosition] +
                "volume " + volume);
    }

    public void nextStation(){
        if (!isOn){
            return;
        }
        activePosition = (activePosition == frequencies.length) ? 0 : activePosition + 1;
        if (activePosition == frequencies.length){
            activePosition = 0;
        }
        System.out.println(frequencies[activePosition] + " " + stations[activePosition] + " Volume " + volume);
    }

    public void previousStation(){
        if (!isOn){
            return;
        }
        activePosition = (activePosition == 0) ? frequencies.length - 1 : activePosition - 1;

        System.out.println(frequencies[activePosition] + " " + stations[activePosition] + "Volume " + volume);
    }


}
