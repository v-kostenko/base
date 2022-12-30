package oop.multyThreading.synchro.method;

import oop.multyThreading.synchro.method.PrintingThread;
import oop.multyThreading.synchro.method.Synchro;

public class Main {
    public static void main(String[] args) {
        Synchro synchro = new Synchro();

        PrintingThread ivan = new PrintingThread("Ivan", 4, synchro);
        PrintingThread vasya = new PrintingThread("Vasya", 5, synchro);
        PrintingThread petr = new PrintingThread("Petro", 5, synchro);

        ivan.start();
        vasya.start();
        petr.start();

        try{
            ivan.join();
            vasya.join();
            petr.join();
        } catch (InterruptedException ie){

        }

        synchro.close();




    }
}
