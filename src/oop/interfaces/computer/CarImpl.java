package oop.interfaces.computer;

public abstract class CarImpl implements UsbDevice {
    private String model;
    private int year;
    private int vinCode;

    public CarImpl(String model, int year, int vinCode) {
        this.model = model;
        this.year = year;
        this.vinCode = vinCode;
    }

    @Override
    public String showInfo(){
        return getClass().getSimpleName() +  "\nModel " + model + "\nYear " + year + "\nVin code " + vinCode;
    }
}
