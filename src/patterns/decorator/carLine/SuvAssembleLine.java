package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;
import patterns.decorator.carLine.autos.Car;
import patterns.decorator.carLine.autos.Suv;

public class SuvAssembleLine implements IAssembleLine {


    @Override
    public Suv assemble() {
        Suv suv = new Suv();
        createBody(suv);
        addEngine(suv);
        addWheels(suv);
        return suv;
    }

    private void createBody(Suv suv) {
        // forming body
    }

    private void addEngine(Suv suv) {
        // add engine to car
    }

    private void addWheels(Suv suv) {
        // add wheels
    }
}
