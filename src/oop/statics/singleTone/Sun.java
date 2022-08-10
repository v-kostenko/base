package oop.statics.singleTone;

public enum Sun {SUN(999999, 988888, "Red");
    private double temperature;
    private double radius;
    private String color;

    Sun(double temperature, double radius, String color) {
        this.temperature = temperature;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "temperature=" + temperature +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
