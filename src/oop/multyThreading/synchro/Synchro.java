package oop.multyThreading.synchro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Synchro {

    private BufferedWriter bufferedWriter;

    public Synchro(){
        try {
            this.bufferedWriter =  new BufferedWriter(new FileWriter("syncho.txt", true));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


    public void writeInFile(String info){
        try {
            bufferedWriter.append(info);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void close(){
        try {
            bufferedWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }



}
