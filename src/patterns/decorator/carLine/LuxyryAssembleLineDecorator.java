package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;

public class LuxyryAssembleLineDecorator extends AutoAssembleLineDecorator{


    public LuxyryAssembleLineDecorator(IAssembleLine assembleLine) {
        super(assembleLine);
    }

    @Override
    public Auto assemble(){
        Auto auto = super.assemble();
        addLeatherSalon(auto);
        addTitanDiscs(auto);
        return auto;
    }

    private void addLeatherSalon(Auto auto){
        auto.addFeature("Leather salon");
        auto.setPrice(auto.getPrice() + 1500);
    }

    private void addTitanDiscs(Auto auto){
        auto.addFeature("Titan discs");
        auto.setPrice(auto.getPrice() + 550);
    }


}
