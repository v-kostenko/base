package oop.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
//        Есть массив типа стринг с элементами. Нужно получить список элементов с массива без дубликатов

        String[] stringArray = new String[]{"Cat", "Dog", "Mouse", "Bird", "Dog", "Dog", "Cat"};

        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList.size());

        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArrayList.contains(stringArray[i])){
                stringArrayList.add(stringArray[i]);
            }
        }

        System.out.println(stringArrayList);
        // Есть массив типа дабл со значениями. С помощью эрейлист подсчитать количество каждого дабла в массиве
        double[] doubles = new double[]{12.3, 20.7, 12.3, 33.7, 0.21, 0.21};

        ArrayList<Double> arrayListDouble = new ArrayList<>();
        ArrayList<Integer> arrayListCounter= new ArrayList<>();

        for (int i = 0; i < doubles.length; i++) {

            if (!arrayListDouble.contains(doubles[i])){
                arrayListDouble.add(doubles[i]);
                arrayListCounter.add(1);
            } else {
                int index = arrayListDouble.indexOf(doubles[i]);
                arrayListCounter.set(index, arrayListCounter.get(index) + 1);
            }
        }

        for (int i = 0; i < arrayListDouble.size(); i++) {
            System.out.println(arrayListDouble.get(i) + " = " + arrayListCounter.get(i));
        }
        //есть лист со значениями. Сделать его зеркальным
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 10, 20, 30, 40, 50);

        for (int i = integers.size() - 1, j = 0; i >= integers.size()/2; i--, j++) {
            int boof = integers.get(i);

            integers.set(i, integers.get(j));
            integers.set(j, boof);
        }
        System.out.println(integers);






    }
}
