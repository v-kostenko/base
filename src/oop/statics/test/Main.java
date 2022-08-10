package oop.statics.test;

import oop.statics.basik.BloodGroup;
import oop.statics.basik.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Bob", 1, BloodGroup.FIRST);
        human.sunBath();
    }
}
