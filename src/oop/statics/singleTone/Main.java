package oop.statics.singleTone;

public class Main {
    public static void main(String[] args) {
        System.out.println(Moon.getMoon());
        System.out.println(Moon.getMoon());
        Moon.getMoon().shine();

        System.out.println(Sun.SUN);

    }
}
