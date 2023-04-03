package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;
import patterns.decorator.carLine.autos.Car;

public class CarAssembleLine implements IAssembleLine {

    @Override
    public Car assemble() {
        Car car = new Car();
        createBody(car);
        addEngine(car);
        addWheels(car);
        return car;
    }

    private void createBody(Car car) {
        // forming body
    }

    private void addEngine(Car car) {
        // add engine to car
    }

    private void addWheels(Car car) {
        // add wheels
    }
}
