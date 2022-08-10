package oop.interfaces.contactWindow;

public class Client extends ContactImpl{
    private double evarageCheck;

    public Client(String name, String address, int phone, String email, String type, double evarageCheck) {
        super(name, address, phone, email, type);
        this.evarageCheck = evarageCheck;
    }

    public double getEvarageCheck() {
        return evarageCheck;
    }
}
