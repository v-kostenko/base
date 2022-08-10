package oop.interfaces.computer;

public class Phone implements UsbDevice{
    private String name;
    private int memory;

    public Phone(String name, int memory){
        this.name = name;
        this.memory = memory;
    }

    public String showInfo(){
        return getClass().getSimpleName() + " " + name + "\nMemory " + memory;
    }

}
