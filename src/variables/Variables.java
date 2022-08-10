package variables;

import org.w3c.dom.ls.LSOutput;

import javax.management.OperationsException;
import java.lang.management.MemoryType;
import java.math.BigInteger;


public class Variables {

//    public static int maxValue(int kost1, int kost2, int kost3){
//
//        if (t1 > t2 && t1 > t3) {
//            maxValue1 = t1;
//        } else if (t2 > t1 && t2 > t3){
//            maxValue1 = t2;
//        } else {
//            maxValue1 = t3;
//        }
//        return maxValue1;
//
//    }

    public static void main(String[] args) {
        BigInteger big;
        int age = 55;
        System.out.println(34 + 5); // int  4 byte
        int a = 23 - 5 + 4;

        int y;
        int x = 3;
        a = 4;

        y = (2 * x - 3) / (5 * a) - (4 * x) / (1 + x);
        System.out.println("y равно: " + y);
        System.out.println("sum = " + (12 + 6));
        System.out.println(12 + 5 + " = sum");
        a = a + 1;
        a++; // a = a + 1
        System.out.println("a = " + a);
        int res = 14 + a++; // 6
        System.out.println("a = " + a);
        System.out.println("sum = " + a++);
        int w = 55;
        w /= 5; // w = w / 5;
        System.out.println(w);
        w *= 4;

        long cardNumber = 4132_1471_8743_5598L; // 8
        char num1 = '$';
        System.out.println(num1 + 0);
        num1 = 92;
        System.out.println(num1);
        int t = '%';
        System.out.println(t);
        System.out.println("vasya".replace('a', '$'));
        System.out.println(45.67); // 8 byte
        float money = 44.3f;
        double width = 338.1;
        System.out.println(7.0 / 2);
        a = 99;
        int b = 2;
        double n = a / (b * 1.0);
        System.out.println(n);

        double z = (2.0 * x - 3) / (5 * a) - (4.0 * x) / (1 + x);
        System.out.println("z = " + z);
        System.out.println("y = " + y);


        double y1 = Math.pow((2.0 * Math.pow(Math.PI, 1.0 / 7) + 1.0 * x) / (2 * a) + Math.pow(Math.E, 0.21) * 4 * x / (3 * a), 1.0 / 3);
        System.out.println(y1);

        double w2 = 12.71 - 3.27;
        System.out.println(w2);

        double r1 = 5.6255343613414439; //0.426
        System.out.println(Math.round(r1 * 1000) / 1000.0);

        boolean bool = y1 > '$';
        System.out.println(bool);
        System.out.println(w < 4);
        //равен ли w2 числу 8?
        System.out.println(w2 != 8);
        //есть 2 товара по цене и кол-ву. Есть сумма денег. Сколько остаток от покупки

        int item1 = 1;
        int item2 = 3;
        double price1 = 32.5;
        double price2 = 43.9;
        double moneyTest = 77777.8;

        double rest;

        rest = moneyTest - (item1 * price1 + item2 * price2);
        System.out.println("Rest is " + rest);
        // есть сумка что выдерживает столько-то кг. Есть 3 продукта с весамми. Порвется ?

        int prodWeight1 = 2;
        int prodWeight2 = 4;
        int prodWeight3 = 9;

        int bagWeigt = 10;

        boolean isOk = (prodWeight1 + prodWeight2 + prodWeight3) <= bagWeigt;
        System.out.println("Пакет не порвется " + isOk);
        // Есть возраст человека. Совершеннолетний
        int agePerson = 12;

        if (agePerson <= 18)
            System.out.println("Person is not adult");
        else
            System.out.println("Person is adult");
        // есть 2 переменные. Сравнить их
        int var1 = 6;
        int var2 = 9;
        int var3;

        if (var1 > var2) {
            System.out.println(var1 + ">" + var2);
        } else if (var2 > var1) {
            System.out.println(var2 + ">" + var1);
        } else {
            System.out.println(var1 + "=" + var2);
        }
        //ессть 2 переменные. Поменять в них значения местами
        var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println("var1 = " + var1 + " and " + " var2 = " + var2);
        // Есть температура. Есть перем  Сигнал, кот  зависит от темп. Если темп ниже 23, то сигнал 35. Иначе -123
        int signal;
        int tempr = 70;

        if (tempr < 23) {
            System.out.println(signal = 35);
        } else {
            System.out.println(signal = -123);
        }
        signal = tempr < 23 ? 35 : -123;
        System.out.println(signal);
        //ессть 1 авто со сскоростью Есть растояние. Проедет ли за время такое-то?
        int speed = 30;
        int length = 60;
        int time = 2;

        if (time * speed >= length) {
            System.out.println("Car proedet");
        } else {
            System.out.println("Car ne proedet");
        }
// есть книга со столько стр. Читали 2 дня по какому-то кол-ву. Прочитали больше 40%?
        int pagesQuantity = 1000;
        int pagesPerFirstDays = 200;
        int pagesPerSecondDays = 400;

        int pegasQuantityPerTwoDAys = pagesPerFirstDays + pagesPerSecondDays;

        if (pegasQuantityPerTwoDAys < (pagesQuantity * 0.6))
            System.out.println("We have read less than 40%");
        else
            System.out.println("We have read 40% or even more");
        ;
        //    &   |
        // есть мебель с площпдью  Есть 2 комнаты с площадью. Влезет мебель в обе комнаты?
        int furnitureS = 23;
        int room1S = 56;
        int room2S = 12;

        //boolean compareRooms = room1S < room2S;
        if (furnitureS > room1S || furnitureS > room2S)
            System.out.println("Furniture is not fit to both rooms");
        else {
            System.out.println("Furniture is fit to both rooms");
        }


        // есть 3 переменных. Найти большую из них
        int var101 = 67;
        int var102 = 5678;
        int var103 = 0;


        if (var101 > var102 & var101 > var103) {
            System.out.println("The largest var is " + var101);
        } else if (var102 > var101 && var102 > var103) {
            System.out.println("The largest var is " + var102);
        } else {
            System.out.println("The largest var is " + var103);
        }


        int s = 0;
        System.out.println(s != 0 && var102 / s < 4);
        System.out.println(2 < 10 || 23 < 100);
        // есть макс  глубина в дайвинге 40  м.  Погружались 3 раза. Хоть в каком-то погружении не привысили допуск?
        int deep = 40;
        int dive1 = 2;
        int dive2 = 6;
        int dive3 = 9;

        if (dive1 <= deep && dive2 <= deep && dive3 <= deep) {
            System.out.println("Ни в каком не привысили");
        } else {
            System.out.println("Хоть в каком-то привысили");
        }
        //есть трое люжей. Асе совершеннолетние?
        int person1 = 78;
        int person2 = 32;
        int person3 = 68;

        if (person1 >= 18 && person2 >= 18 && person3 >= 18) {
            System.out.println("Все совершеннолетние");
        } else {
            System.out.println("Хотябы кто-то 1 не совершеннолентний");
        }
        //есть 3 переменные. Сделать так чтобы в первой стало наименьшее, а в третьей - наибольшее число

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("====================== HOME WORK ======================");
        int t1 = 0;
        int t2 = 234;
        int t3 = -21110;

        int maxValue1;
        int minValue1;

//        int maxValue = Math.max(Math.max(t1, t2), t3);
//        int minValue = Math.min(Math.min(t1, t2), t3);
//
//        System.out.println("Max value = " + maxValue + " and " + "min value = " + minValue);
//
//        t1 = minValue;
//        t3 = maxValue;
//        System.out.println("New value t1 = " + t1);
//        System.out.println("New value t3 = " + t3);

        System.out.println("-------------- Second ----------------");
        System.out.println("-------------- Second ----------------");

//         try {
//             if (t1 == t2 || t1 == t3 || t2 == t3);
//        } catch (ArithmeticException e) {
//             System.out.println("Some of digits are equals");
//        }
//
//         // Find out maxDigit
//        if (t1 > t2 && t1 > t3) {
//            maxValue1 = t1;
//        } else if (t2 > t1 && t2 > t3){
//            maxValue1 = t2;
//        } else {
//            maxValue1 = t3;
//        }
//
//        // Find out minDigit
//        if (t1 < t2 && t1 < t3) {
//            minValue1 = t1;
//        } else if (t2 < t1 && t2 < t3){
//            minValue1 = t2;
//        } else {
//            minValue1 = t3;
//        }
//
//        t1 = minValue1;
//        t3 = maxValue1;
//        System.out.println("Max value = " + maxValue1 + " and " + "min value = " + minValue1);
//        System.out.println("New value t1 = " + t1);
//        System.out.println("New value t3 = " + t3);



        System.out.println("====================== HOME WORK ======================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        if (t2 < t1 &&  t2 < t3) {
            int boof = t1;
            t1 = t2;
            t2 = boof;
        }
        if (t3 < t1 && t3 < t2){
            int boof = t1;
            t1 = t3;
            t3 = boof;
        }
        if (t2 > t3){
            int boof = t3;
            t3 = t2;
            t2 = boof;
        }

        System.out.println(" 8888888888888888888888888888888888888888888888888888888888888");
        System.out.println("t1 = " + t1 + "\n t2 = " + t2 + "\n t3 = " + t3);


        //========================Тернарные операции.======================================
        // Условие. Если l меньше k, то складіваем, иначе вычитаем
        int l = 1;
        int k = 4;
        String hi;

        System.out.println("========================Тернарные операции.======================================");
        int g = (l < k) ? (l + k) : (l - k);

        System.out.println(g);
        hi = (l > k) ? ("Hello") : ("Bye");

        System.out.println(hi);

        System.out.println("============================Через if ============================================");
        if (l < k) {
            System.out.println(l + k);
        } else {
            System.out.println(l - k);
        }


    }

}

