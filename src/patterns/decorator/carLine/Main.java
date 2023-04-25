package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;

public class Main {
    public static void main(String[] args) {
        IAssembleLine line =  new LuxyryAssembleLineDecorator( new MilitaryDecorator(new CarAssembleLine()));
        Auto auto = line.assemble();
        System.out.println(auto);


    }
}
