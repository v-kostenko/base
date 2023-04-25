package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;
import patterns.decorator.carLine.autos.Car;

import java.util.ArrayList;

public class CarAssembleLine implements IAssembleLine {

    @Override
    public Car assemble() {
        Car car = new Car("Red", 10000, 180);
        createBody(car);
        addEngine(car);
        addWheels(car);
        return car;
    }

    private void createBody(Car car) {
        car.addFeature("Create Body feature");
    }

    private void addEngine(Car car) {
        car.addFeature("Engine feature");
    }

    private void addWheels(Car car) {
        car.addFeature("Add wheels feature");
    }
}
