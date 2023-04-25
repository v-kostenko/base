package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;

import java.util.*;

public class MilitaryDecorator extends AutoAssembleLineDecorator {
    private List<String> colors = Arrays.asList("Green color", "Military", "Pixel");


    public MilitaryDecorator(IAssembleLine assembleLine) {
        super(assembleLine);
    }

    @Override
    public Auto assemble() {
        Auto auto = super.assemble();
        addRockets(auto);
        paintMilitaryColor(auto);
        auto.setPrice(auto.getPrice() + 1000);

        return auto;
    }

    public void addRockets(Auto auto) {
        auto.addFeature("Auto get rockets");
    }

    public void paintMilitaryColor(Auto auto) {
        Random random = new Random();
        int color = random.nextInt(colors.size());
        auto.setColor(colors.get(color));
    }


}
