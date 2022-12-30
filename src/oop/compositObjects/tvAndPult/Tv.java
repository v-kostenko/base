package oop.compositObjects.tvAndPult;

public class Tv {
    private boolean isOn;
    private int chanelAmount;
    private int currentChanel = 1;
    private int volume;

    public Tv(int chanelAmount){
        this.chanelAmount = chanelAmount;
    }

    public void turnOnTv(){
        if (!isOn) {
            isOn = true;
            System.out.println("Hello! TV is ON \n Channel " + currentChanel + "\n Volume " + volume);
        }
    }

    public void turnOffTv(){
        if (isOn){
            isOn = false;
            System.out.println("Bye! TV is OFF");
        }
    }

    public void swithcChannelUp(){
        if (!isOn){
            System.out.println("TV is OFF");
            return;
        }
        if (currentChanel < chanelAmount){
            currentChanel++;
            System.out.println("Channel was switch UP. Now it is " + currentChanel);
        }
        if (currentChanel == chanelAmount){
            currentChanel = 1;
            System.out.println("Channel was switch UP. Now it is " + currentChanel);
        }
    }

    public void switchChannelDown(){
        if (!isOn){
            System.out.println("TV is OFF");
            return;
        }
        if (currentChanel > 1){
            currentChanel--;
            System.out.println("Channel was switch DOWN. Now it is " + currentChanel);
        }
        if (currentChanel == 1){
            currentChanel = chanelAmount;
            System.out.println("Channel was switch DOWN. Now it is " + currentChanel);
        }
    }

    public void setChannelManual(int channel){
        if (!isOn){
            System.out.println("TV is OFF");
            return;
        }
        if (channel >= 1 && channel <= chanelAmount){
            currentChanel = channel;
            System.out.println("Channel was switch. Now it is " + currentChanel);
        } else {
            System.out.println("Incorrect channel");
        }
    }

    public void volumeUp(){
        if (!isOn){
            System.out.println("TV is OFF");
            return;
        }
        if (volume <= 4){
            volume++;
            System.out.println("Volume was increase. Now it is " + volume);
        } else {
            System.out.println("Max volume");
        }
    }

    public void volumeDown(){
        if (!isOn){
            System.out.println("TV is OFF");
            return;
        }
        System.out.println(volume > 1 ?   "Volume was decrease. Now it is " +(volume = volume - 1)  : "Min volume");
//        if (volume > 1){
//            volume--;
//            System.out.println("Volume was decrease. Now it is " + volume);
//
//        } else {
//            System.out.println("Min volume");
//        }
    }









}
