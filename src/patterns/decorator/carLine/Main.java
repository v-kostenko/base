package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;

public class Main {
    public static void main(String[] args) {
        CarAssembleLine auto = new MilitaryDecorator( new CarAssembleLine());
        auto.assemble();
    }
}
