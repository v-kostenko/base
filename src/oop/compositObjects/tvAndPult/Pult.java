package oop.compositObjects.tvAndPult;

public class Pult {
    private Tv tv;

    public void connectTv(Tv tv) {
        this.tv = tv;
    }

    public void on() {
        if (tv != null) {
            tv.turnOnTv();
        } else {
            System.out.println("Tv is not connect to the pult");
        }
    }

    public void off() {
        if (tv != null) {
            tv.turnOffTv();
        }
    }

    public void channelUp() {
        if (tv != null) {
            tv.swithcChannelUp();
        }
    }

    public void channelDown() {
        if (tv != null) {
            tv.switchChannelDown();
        }
    }

    public void setChannel(int channel) {
        if (tv != null) {
            tv.setChannelManual(channel);
        }
    }

    public void volumeUp() {
        if (tv != null) {
            tv.volumeUp();
        }
    }

    public void volumeDown() {
        if (tv != null) {
            tv.volumeDown();
        }
    }


}


