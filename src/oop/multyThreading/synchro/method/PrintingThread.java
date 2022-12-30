package oop.multyThreading.synchro.method;

public class PrintingThread extends Thread{
    private String name;
    private int amount;
    private Synchro synchro;

    public PrintingThread(String name, int amount, Synchro synchro){
        this.name = name;
        this.amount = amount;
        this.synchro = synchro;
    }

    public void run(){
        for (int i = 0; i < amount; i++) {
            synchro.write(name);
        }
    }


}
