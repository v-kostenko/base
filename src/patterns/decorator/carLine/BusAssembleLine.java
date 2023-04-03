package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;
import patterns.decorator.carLine.autos.Bus;

public class BusAssembleLine implements IAssembleLine{


    @Override
    public Auto assemble() {
        return new Bus();
    }
}
