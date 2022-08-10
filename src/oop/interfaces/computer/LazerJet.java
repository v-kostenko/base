package oop.interfaces.computer;

public class LazerJet extends PrinterImpl {
    private String colorPowder;

    public LazerJet(String model, int speedOfPrint, String material, String colorPowder) {
        super(model, speedOfPrint, material);
        this.colorPowder = colorPowder;
    }

    @Override
    public void print(String text){
        System.out.println(text);
    }

    @Override
    public String toString() {
        return super.toString() + "\nLazerJet{" +
                "colorPowder='" + colorPowder + '\'' +
                '}';
    }
}
