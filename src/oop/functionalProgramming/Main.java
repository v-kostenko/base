package oop.functionalProgramming;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {


        double value = 38.82;

        DoublePredicate doublePredicate = (w) -> ("" + w).length() - (new StringBuilder(w + "").indexOf(".") + 1) > 2;
        System.out.println(doublePredicate.test(value));

        Random random = new Random();
        Supplier<String> supplier = () -> new StringBuilder().append(random.nextInt((1000 - 100) + 100))
                .append((char) (random.nextInt('Z' - 'A') + 'A'))
                .append((char) (random.nextInt('Z' - 'A') + 'A'))
                .append((char) (random.nextInt('z' - 'a') + 'a'))
                .append((char) (random.nextInt('z' - 'a') + 'a'))
                .toString();

        System.out.println(supplier.get());

        // В листе типа String найти самый короткий стринг и возвратить его длину.
        List<String> list = new ArrayList<>();
        list.add("q2");
        list.add("q1");
        list.add("q3");
        list.add("q4");
        list.add("qw2");
        list.add("qwe2");
        list.add("qwer2");
        list.add("qwer2wqwq");
        list.add("qwer2ccxvvvb");
        list.add("qwer2ccxvvvb ewewew bnvnvnv");
        list.add("1");
        list.add("333");

        ToIntFunction<List<String>> toIntFunction = (s) -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < s.size(); i++) {
                int length = s.get(i).length();
                if (length < min) {
                    min = length;
                }
            }
            return min;
        };

        System.out.println(toIntFunction.applyAsInt(list));

        //В листе с товарами сделать дисконт в размере 25% на товары общая цена которых превышает заданную

        Product product1 = new Product("Banana", 11.22, 299, "Africa");
        Product product2 = new Product("Orange", 10.33, 1299, "Spain");
        Product product3 = new Product("Apple", 1.72, 2299, "Poland");
        Product product4 = new Product("Plum", 1.21, 5299, "Slovacia");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

//        Consumer<Product> consumer2 = (o) -> {
//            double x = o.total() > 2000 ? o.setPrice(o.getPrice() * 0.75) : 2.5;
//        };
//
//        for (Product pr : productList) {
//            consumer2.accept(pr);
//        }
//        System.out.println(productList);
//
//        Consumer<Product> consumer = (p) -> {
//            double limit = 2000;
//            for (int i = 0; i < productList.size(); i++) {
//                if ((productList.get(i).getAmount() * productList.get(i).getPrice()) > limit) {
//                    productList.get(i).setPrice(productList.get(i).getPrice() * 0.75);
//                }
//            }
//
//            for (Product prod : productList) {
//                if ((prod.getPrice() * prod.getPrice()) > limit) {
//                    prod.setPrice(prod.getPrice() * 0.75);
//                }
//            }
//        };


        //Consumer<Product> consumerForEach = (p) -> System.out.println(p);
        productList.forEach((p) -> System.out.println(p));

        /**
         Consumer<Product> consumer2  = (o) -> {
         double x = o.total() > 2000 ? o.setPrice(o.getPrice() * 0.75) : 2.5;
         };
         **/

        productList.forEach((d) -> {
            double x = d.total() > 2000 ? d.setPrice(d.getPrice() * 0.75) : 2.5;
        });

        System.out.println();
        productList.forEach((p) -> System.out.println(p));
        Predicate<Integer> predicate = (i) -> {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(predicate.test(4));
        //есть лист стрингов, удалить с него все стринги с длинами мееньшими такой-то
//        int y = 3;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).length() <= y){
//                list.remove(list.get(i));
//                i--;
//            }
//        }
//
//        System.out.println(list);

//        list.removeIf((s) -> s.length() < 4);
//        System.out.println(list);


        System.out.println("UnaryOperator<Double> unaryOperator");
        //есть лист с даблами. используя метод листа риплейс,  Все положительные числа увеличить в 2 раза
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(22.94);
        doubleList.add(-2.44);
        doubleList.add(212.43);
        doubleList.add(-122.44);
        doubleList.add(32.04);

        UnaryOperator<Double> unaryOperator = d -> (d > 0) ? d * 2 : d;

        doubleList.replaceAll(unaryOperator);

        //Consumer<Double> doubleConsumer = doub -> System.out.println(doub);
        doubleList.forEach(doub -> System.out.println(doub));


//
// преобразовуем с помошью интерфейса фанкшн лист стрингов в лист интов (длин этих стрингов)

        List<Integer> integerList = new ArrayList<>();

        Function<List<String>, List<Integer>> function = str5 -> {
            str5.forEach(e -> integerList.add(e.length()));
            return integerList;
        };

        function.apply(list);
        System.out.println(integerList);

        // интерфейс фанкшн принимает дабл и возвращает зеркальный дабл   3.45 ---- 54.3
        StringBuilder stringBuilder = new StringBuilder("");

        Function<Double, Double> mirrorDouble = d -> Double.parseDouble(new StringBuilder("" + d).reverse().toString());
        System.out.println(mirrorDouble.apply(3.45));

//есть массив даблов. С помощью бинариОператора найти сумму его чисел
        double[] array = {1.22, 3.33, 4.44, 5.55};
        BinaryOperator<Double> binaryOperator = (Double d, Double f) -> d + f;

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = binaryOperator.apply(sum, array[i]);
        }

        //в массиве с товарами слелать скидку в объеме процентов, переданных обжектДаблКонсьюмеру, если его общая цена превышает такую-то

        Product[] productsArray = {product1, product2, product3, product4};

        ObjDoubleConsumer<Product> objDoubleConsumer = (p, d) -> {
            double dou = p.total() > 2000 ? p.setPrice(p.getPrice() * d) : 2.3;
        };

        for (int i = 0; i < productsArray.length; i++) {
            objDoubleConsumer.accept(productsArray[i], 0.75);
        }
        System.out.println(Arrays.toString(productsArray));

        // Лист стрингов и отсортировать по возрастанию длин
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "fhfjhfhjfeqeqeqe" , "q", "zx", "nm,", "12345", "lkhklfkfkf");


        stringList.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(stringList);
















    }
}

