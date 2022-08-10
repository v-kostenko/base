package oop.multyThreading.synchro;

public class PrintingThread extends Thread{
    private String name;
    private int amount;
    private Synchro synchro;

    public PrintingThread(String name, int amount, Synchro synchro){
        this.name = name;
        this.amount = amount;
        this.synchro = synchro;
    }

    @Override
    public void run(){
        for (int i = 0; i < amount; i++) {
            synchro.writeInFile(i + "." + name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchro.writeInFile(" -> " + i + "." + name);
        }
    }



}
