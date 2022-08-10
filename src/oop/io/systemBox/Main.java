package oop.io.systemBox;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Memory> memoriesList = new ArrayList<>();
        Memory memory1 = new Memory(128, "Samsung", 123.45);
        Memory memory2 = new Memory(256, "Apple", 999.45);
        Memory memory3 = new Memory(512, "Huawei", 333.44);

        memoriesList.add(memory1);
        memoriesList.add(memory2);
        memoriesList.add(memory3);

        Ssd ssd = new Ssd(256, 12.5, 124.3);
        Ssd ssdUpdated = new Ssd(99999, 999.99, 999.99);
        VideoCart videoCart = new VideoCart("LG", 33.55);
        Processor processor = new Processor(777.77, "AMD");


        List<Memory> memoriesList2 = new ArrayList<>();
        Memory memory12 = new Memory(128, "Samsung", 123.45);
        Memory memory22 = new Memory(256, "Apple", 999.45);
        Memory memory32 = new Memory(512, "Huawei", 333.44);

        memoriesList2.add(memory12);
        memoriesList2.add(memory22);
        memoriesList2.add(memory32);

        Ssd ssd2 = new Ssd(2562, 12.52, 124.32);
        VideoCart videoCart2 = new VideoCart("LG2", 33.552);
        Processor processor2 = new Processor(777.772, "AMD2");


        SystemBox systemBox1 = new SystemBox(memoriesList, ssd, videoCart, processor, 100001);
        SystemBox systemBox2 = new SystemBox(memoriesList2, ssd2, videoCart2, processor2, 100002);

//        Controller.create(systemBox1);
//        Controller.create(systemBox2);

//        System.out.println(Controller.find());
//
//        systemBox1.setSsd(ssdUpdated);
//
//        Controller.update(systemBox1);
//        System.out.println(Controller.find());

//        Controller.delete(systemBox1);
//        System.out.println(Controller.find());

//        Controller2.create(systemBox1);
//        Controller2.create(systemBox2);
//        System.out.println(Controller2.findAll());
//        Controller2.delete(systemBox1);
//        System.out.println(Controller2.findAll());
        Ssd ssdNew = new Ssd(777777, 7777.77, 7777.777);
        systemBox2.setSsd(ssdNew);

        Controller2.update(systemBox2);
        System.out.println(Controller2.findAll());










    }
}

