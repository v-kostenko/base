package oop.collections.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        Integer count = new Integer(32);
        int name = count.intValue();
        Integer age = 32;
        int age2 = age;

        HashMap<String, Double> staff = new HashMap<>();

        staff.put("Manager", 3000.0);
        staff.put("Accountant", 2000.0);
        staff.put("Security", 1500.0);
        staff.put("Security", 1599.0);


        Double salary = staff.get("Manager");
        System.out.println("Salary " + salary);

        salary = staff.get("Dvornik");
        System.out.println(salary);
        Double z = null;

        Double se = staff.get("Security");
        System.out.println(se);

        staff.replace("Manager", 99999.9);
        System.out.println(staff.get("Manager"));

        staff.replace("Manager", 99999.9, 1111.1);
        System.out.println(staff.size());

        boolean cont = staff.containsKey("Manager2");
        boolean cont2 = staff.containsValue(111.2);
        System.out.println(cont);
        System.out.println(cont2);

        for (String key : staff.keySet()){
            System.out.println(key + " " + staff.get(key));
        }

//        System.out.println(staff.remove("Manager"));
//        for (String key : staff.keySet()){
//            System.out.println(key + " " + staff.get(key));
//        }

        System.out.println();

        staff.remove("Manager", 1111.1);
        for (String key : staff.keySet()){
            System.out.println(key + " " + staff.get(key));
        }

// есть массив стрингов. С помощьб мапы избавиться от дубликатов
        String[] strings = new String[]{"Aaaa", "Bbbb", "Ccc", "Ddd", "Aaaa", "Bbbb"};
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], i);
        }

        for (String print: map.keySet()) {
            System.out.println(print);
        }

        // есть мапа типа стринг - интежер, инвертировать ее
        Map<String, Integer> mapTest = new HashMap<>();

        mapTest.put("First", 1);
        mapTest.put("Second", 2);
        mapTest.put("Third", 3);


        Map<Integer, String> invert = new HashMap<>();

        for (String variable: mapTest.keySet()) {
            invert.put(mapTest.get(variable), variable);
        }

        for (Integer var: invert.keySet()) {
            System.out.println(var + " " + invert.get(var));
        }

        // есть лист стрингов с повнорениями. Подсчитать количество каждого из стрингов в нем
        ArrayList<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Mouse");
        list.add("Frog");
        list.add("Lion");
        list.add("Mouse");
        list.add("Frog");

        Map<String, Integer> animals = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            if(!animals.containsKey(list.get(i))) {
                animals.put(list.get(i), 1);
            } else{
                int x = animals.get(list.get(i));
                animals.replace(list.get(i), x + 1);
            }
        }

        for (String var: animals.keySet()) {
            System.out.println(var + " " + animals.get(var));
        }

        //В мапе типа стринг - инт найти второй по длине стринг

        Map<String, Integer> lengthWord = new HashMap<>();
        lengthWord.put("QWERdfghwert", 1);
        lengthWord.put("qwertyuqwsqqqqqqqqqqqqqqqqqqqqq", 2);
        lengthWord.put("qwertyueeeeeeeeee", 3);
        lengthWord.put("w", 4);

        String max = "";
        String secondMax = "";
        for (String keys : lengthWord.keySet()) {
            int map1 = keys.length();

            if (map1 > max.length()){
                if (max.length() > secondMax.length()){
                    secondMax = max;
                }
                max = keys;
            } else if(map1 > secondMax.length()) {
                secondMax = keys;
            }
        }

        System.out.println("Max " + max + " Second Max " + secondMax);





















    }
}
