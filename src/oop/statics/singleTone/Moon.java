package oop.statics.singleTone;

public class Moon {
    private double temperature = 2000.0;
    private double radius = 888888;
    private String color = "White";
    private static Moon moon = new Moon();

    private Moon(){

    }

    public static Moon getMoon(){
        return moon;
    }

    public void shine(){
        System.out.println("Shining...");
    }

}
