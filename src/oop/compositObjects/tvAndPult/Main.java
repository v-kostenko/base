package oop.compositObjects.tvAndPult;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv(5);
        Pult pult = new Pult();

        //pult.connectTv(tv);
        pult.on();

        pult.volumeUp();
        pult.volumeUp();
        pult.volumeUp();
        pult.volumeUp();
        pult.volumeUp();

        pult.volumeUp();
        pult.volumeUp();

        pult.volumeDown();
        pult.volumeDown();
        pult.volumeDown();
        pult.volumeDown();
        pult.volumeDown();

        pult.volumeDown();
        pult.volumeDown();
        pult.volumeDown();
        pult.volumeDown();

        pult.off();

     //   pult.on();





    }
}
