package oop.inheritance.basic;

import java.util.ArrayList;

enum Gender {
    MALE, FEMALE
}

public abstract class Manager extends Position {
    private ArrayList<Position> subordinates = new ArrayList<>();
    private int cabinetNumber;

    public Manager(double salary, double experience, Gender gender, int cabinetNumber) {
        super("Manager", salary, experience, gender);
        this.cabinetNumber = cabinetNumber;
    }

    public void addSubordinates(Position position) {
        subordinates.add(position);
    }

    public void manage() {
        System.out.println("Manage");
    }

    public void negotiations() {
        System.out.println("Negotiations");
    }

    @Override
    public String toString() {
        return super.toString() + " " + cabinetNumber;
    }

}
