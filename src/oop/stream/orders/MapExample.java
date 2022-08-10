package oop.stream.orders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("qwerty12121", 1);
        map.put("Helloooooooooooooooo", 2);
        map.put("World", 3);
        map.put("Java", 4);
        map.put("J", 20);

//        System.out.println(map.size());
//        Integer value = map.get("dfghj");
//        System.out.println(value);
//
//        Integer v = map.get("Java");
//        System.out.println(v);

//        Integer ten = map.replace("Hello", 10);
//        System.out.println(ten);

//        Integer ten1 = map.replace("Hello1", 10);
//        System.out.println(ten1);

//        boolean result = map.replace("World", 3, 99);
//        System.out.println(result);
//
//        Integer x = map.remove("qwerty");
//        System.out.println(x);

//        boolean b = map.containsKey("fgh");
//        System.out.println(b);
//
//        boolean v = map.containsValue(1);
//        System.out.println(v);
//
//        for (String key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }
//
//        System.out.println();
//        for (Integer value: map.values()) {
//            System.out.println(value);
//        }
//
//        String str = "";
//        for (String key: map.keySet()) {
//            if (key.length() > str.length()){
//                str = key;
//            }
//        }
//        System.out.println(str);
//
//        String max = map.keySet().stream().max((o1, o2) -> o1.length() - o2.length()).get();
//        System.out.println(max);
//
//
//        System.out.println();
//        //отсортировать значения
//        List<Integer> integerList = map.values().stream().sorted((i1, i2) -> - (i1 - i2)).toList();
//        integerList.forEach(i -> System.out.println(i));
//
//        System.out.println();
//       List<String> list = map.keySet().stream().sorted((k1, k2) -> -( k1.length() - k2.length())).toList();
//       list.forEach(st -> System.out.println(st));

        System.out.println();
       //поменять местами ключи и значения
//        Set<String> temp = map.keySet();
//        Map<Integer, String> map2 = new HashMap<>();
//
//         for (String key: map.keySet()) {
//
//            map2.put(map.get(key), key);
//        }
//
//        for (Integer k : map2.keySet() ) {
//            System.out.println(k + " " + map2.get(k));
//        }

        //есть массив типа стринг  с дубликатами. С помощью мапы подсчитать количество каждого из стрингов
        String[] array = new String[10];
        array[0] = "qwerty";
        array[1] = "Java";
        array[2] = "Hello!";
        array[3] = "qwerty";
        array[4] = "Java";
        array[5] = "qwerty";
        array[6] = "Hello!";
        array[7] = "Hello!";
        array[8] = "World";
        array[9] = "!@#$";

        Map<String, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
          Integer was = !integerMap.containsKey(array[i]) ? integerMap.put(array[i], 1) :
                  integerMap.put(array[i], integerMap.get(array[i]) + 1);

//            if (!integerMap.containsKey(array[i])){
//                integerMap.put(array[i], 1);
//            } else {
//                int x = integerMap.get(array[i]);
//                integerMap.replace(array[i], x, ++x);
//            }
        }

        for (String key: integerMap.keySet()) {
            System.out.println(key + " - " + integerMap.get(key));
        }

        System.out.println();
        integerMap.forEach((k, v) -> System.out.println(k + " - " + v));















    }
}
