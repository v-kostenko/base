package oop.interfaces.anonymys.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        new DrinkVodka(){
            private double capacity;

            public double getCapacity(){
                return capacity;
            }

            public void setCapacity(double capacity){
                this.capacity = capacity;
            }

            @Override
            public void execute(){
                System.out.println("Override execute method");
            }
        }.setCapacity(1.5);


        Walking walkingCLimb = new Walking(){
            @Override
            public void execute(){
                System.out.println("Override in the Anonym class");
            }
        };
        walkingCLimb.execute();


        Action action = new Action() {
            @Override
            public void execute() {
                System.out.println("Override Action interface");
            }
        };
        action.execute();

        new Action() {
            private int speed;

            public int getSpeed(){
                return speed;
            }

            public void setSpeed(int speed){
                this.speed = speed;
            }

            @Override
            public void execute() {
                System.out.println("I am running");
            }
        }.getSpeed();

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "q", "we", "rty", "uiop");

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - ( o1.length() - o2.length());
            }
        };

        Collections.sort(arrayList, stringComparator);
        System.out.println(arrayList);


        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - ( o1.compareTo(o2));
            }
        });

        System.out.println(arrayList);

        Action2 action2 = new Action2() {
            @Override
            public int execute(int x1, int x2) {
                int sum = 0;
                for (int i = x1; i <= x2; i++) {
                    sum = sum + i;
                }
                return sum;
            }
        };
        System.out.println(action2.execute(2, 7));



    }
}
