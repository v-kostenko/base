package oop.io.bytes.data;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Battery battery1 = new Battery("VARTA", 100, 9.99);
        Battery battery2 = new Battery("ENERGISER", 90, 8.88);
        Battery battery3 = new Battery("DURASEL", 70, 7.77);
        Battery battery4 = new Battery("BIG", 60, 6.66);

        Date date1 = new Date(2000 - 1900, 1, 1);
        Date date2 = new Date(2001 - 1900, 2, 2);
        Date date3 = new Date(2002 - 1900, 3, 3);
        Date date4 = new Date(2004 - 1900, 4, 4);

        Clock clock1 = new Clock("Casio", "Steel", battery1, 10.99, 1000001, date1, true);
        Clock clock2 = new Clock("Montana", "Plastic", battery2, 11.33, 1000002, date2, true);
        Clock clock3 = new Clock("Samsung", "Steel", battery3, 130.99, 1000003, date3, false);
        Clock clock4 = new Clock("LG", "Wood", battery4, 1110.99, 1000004, date4, false);
        Clock clock5 = new Clock("testLG1111", "Wood12222111", battery4, 114.99, 1000005, date4, false);

//        ClockController.save(clock1);
//        ClockController.save(clock2);
//        ClockController.save(clock3);
//        ClockController.save(clock4);

//        Clock clock = ClockController.find(1000001);
//        System.out.println(clock);
//
//        System.out.println("Объект удалился? " + ClockController.remove(clock1));
//
//        Clock after = ClockController.find(1000001);
//        System.out.println(after);
//
//        clock4 = clock5;
//        ClockController.update(clock4);
//        System.out.println(clock4);

        //System.out.println(ClockController.find(11.00, 11999.33));
        System.out.println(ClockController.find("montana"));



    }
}
