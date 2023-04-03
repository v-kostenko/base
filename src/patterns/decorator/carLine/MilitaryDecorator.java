package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;

public class MilitaryDecorator extends AutoAssembleLineDecorator{


    public MilitaryDecorator(IAssembleLine assembleLine) {
        super(assembleLine);
    }

    public void addRockets(Auto auto){
        System.out.println("Auto get rockets");
    }

    public void paintMilitaryColor(Auto uto){
        // Add color
    }


}
