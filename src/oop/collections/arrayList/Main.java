package oop.collections.arrayList;

import javax.swing.table.AbstractTableModel;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer integer = new Integer(44);
        int var = integer.intValue();
        System.out.println(var);

        Double var1 = 2.5;
        double x = var1;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bob");
        arrayList.add("Bob");
        arrayList.add("Bob");
        arrayList.add("Jhon");
        arrayList.add("Tom");
        arrayList.add("Bob");
        arrayList.add("Bob");
        arrayList.add("Bob");


//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        arrayList.add(0, "New Name");
//        arrayList.add(2, "New Name2222222");
//        System.out.println(arrayList);
//        arrayList.add(1, "New Name");
//        System.out.println(arrayList);
//        arrayList.add(0, null);
//        arrayList.add(null);
//        System.out.println(arrayList);
//
//        System.out.println(arrayList.contains("Bob2"));
//        int index = arrayList.indexOf("Bob222");
//        System.out.println(index);
//
//        System.out.println(arrayList);

        // System.out.println(arrayList.remove(1));
        //System.out.println(arrayList.remove("Bob"));
        System.out.println(arrayList);


//        System.out.println(arrayList);
//        for (int i = arrayList.size() - 1; i >= 0; i--) {
//            if ("Bob".equals(arrayList.get(i)) || "Jhon".equals(arrayList.get(i))){
//                arrayList.remove(i);
//            }
//        }
//        System.out.println(arrayList);

        ArrayList<String> delete = new ArrayList<>();
        delete.add("Bob");
        delete.add("Tom");

        arrayList.removeAll(delete);
        System.out.println(arrayList);

        Collections.addAll(arrayList, "Car", "Cat", "Corn");
        System.out.println(arrayList);

        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "Home", "House", "Horse");

        arrayList.addAll(1, words);
        System.out.println(arrayList);

//        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
//            arrayList.remove(i);
//        }

        //arrayList.clear();
        System.out.println(arrayList);

        String[] strings = new String[4];
        strings = arrayList.toArray(strings);

        System.out.println(Arrays.toString(strings));



    }
}
