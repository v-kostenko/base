package patterns.singletone;

public class Sun {
    private double diametr;
    private String color;
    private double temperature;
    private static Sun sun = new Sun(100000, "white", 9999999);

    private Sun(double diametr, String color, double temperature) {
        this.diametr = diametr;
        this.color = color;
        this.temperature = temperature;
    }

    public static Sun getSun() {
//        if (sun == null) {
//            sun = new Sun(100000, "white", 9999999);
//            return sun;
//        }
        return sun;
    }


}
