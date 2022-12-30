package oop.multyThreading.synchro.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Synchro {

    private BufferedWriter bufferedWriter;

    public Synchro(){
        try {
            this.bufferedWriter = new BufferedWriter(new FileWriter("block.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void write(String text){

        for (int i = 0; i < 3; i++) {
            try {
                bufferedWriter.append(i + ". " + text);
                Thread.sleep(1000);
                bufferedWriter.append("->" + i + "." + text + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    public void close(){
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
