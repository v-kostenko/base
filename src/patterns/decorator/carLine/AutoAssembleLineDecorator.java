package patterns.decorator.carLine;

import patterns.decorator.carLine.autos.Auto;

public abstract class AutoAssembleLineDecorator implements IAssembleLine{
    private IAssembleLine assembleLine;

    public AutoAssembleLineDecorator(IAssembleLine assembleLine) {
        this.assembleLine = assembleLine;
    }

    @Override
    public Auto assemble() {
        return assembleLine.assemble();
    }


}
