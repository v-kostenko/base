package oop.radioLaighter;

public class RadioLighter {
    private boolean isOn;
    private FlashLighter flashLighter;
    private Radio radio;

    public RadioLighter(){
        this.flashLighter = new FlashLighter();
        this.radio = new Radio();
    }

    public void turnOnRadio(){
        if(!isOn){
            isOn = true;
            radio.radioTurnOnOFF();
        }
    }

    public void turnOffRadio(){
        if (isOn = true){
            isOn = false;
        }
        System.out.println("Radio is OFF");
    }

    public void nextStation(){
        radio.next();

    }

    public void previousStation(){
        radio.previous();
    }

    public void turnOnFlashLighter(){
        flashLighter.turnOnOFF();
    }

//    public void turnOFFFlashLighter(){
//        flashLighter.turnOFF();
//    }

    public void plusVolume(){
        radio.plusVolume();
    }

    public void minusVolume(){
        radio.minusVolume();
    }
}
