package oop.multyThreading.synchro;

import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {

        Synchro synchro = new Synchro();

        PrintingThread vasya = new PrintingThread("Vasya", 5, synchro);
        PrintingThread ivan = new PrintingThread("Ivan", 6, synchro);
        PrintingThread petr = new PrintingThread("Petr", 7, synchro);

        vasya.start();
        ivan.start();
        petr.start();

        try {
            vasya.join();
            ivan.join();
            petr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        synchro.close();
















    }
}
