package oop.multyThreading.basic;

public class PrintingThread extends Thread{
    private String name;
    private int iterations;

    public PrintingThread(String name, int iterations){
        this.name = name;
        this.iterations = iterations;
    }

    public void run(){
        for (int i = 0; i < iterations; i++) {
            System.out.println(i + 1 + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

}
