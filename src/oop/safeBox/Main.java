package oop.safeBox;

public class Main {
    public static void main(String[] args) {
        SafeBox safeBox = new SafeBox();
        safeBox.close("ASDFG");
        safeBox.open("ASDF");
        safeBox.open("ASDF");
        safeBox.open("ASDF");

        safeBox.open("QWERTY");
    }
}
