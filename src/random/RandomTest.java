package random;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        Random rnd = new Random();
        boolean b = rnd.nextBoolean();
        System.out.println(b);
        int i = rnd.nextInt(5); // 0   4
        System.out.println(i);
        // (max - min) + min
        //  -12  to  8
        int i2 = rnd.nextInt(9 - -12) - 12;
        System.out.println(i2);
        // сгенерить 20 случайных чисел от 3  до 21
        for (i = 0; i < 20; i++) {
            int j = rnd.nextInt(21 - 3) + 3;
            System.out.print(j + " ");
        }
        //сгенерить 100 случ чисел от 0 до 170. Если число кратно 3, то вывести его и что оно кратно 3. Тоже и с 5 и 15, но если число кратно 15, то выводить кратность числа 3 и 5 не надо и так очевидно

        for (int k = 0; k < 100; k++) {
            int var = rnd.nextInt(171);

            if (var % 15 == 0 && var != 0) {
                System.out.println(var + " число кратно 15-м ");
                //continue;
            } else if (var % 3 == 0 && var != 0) {
                System.out.println(var + " число кратно 3-м ");
            } else if (var % 5 == 0 && var != 0) {
                System.out.println(var + " число кратно 5-м ");
            }


        }
        //ссгенерить 20  числа от -20 до 30. Сеолько нечетных
        int counter = 0;
        for (int j = 0; j < 21; j++) {
            int boof1 = rnd.nextInt(30 + 20) - 20;
            if (boof1 % 2 != 0)
                counter = counter + 1;
            System.out.print(boof1 + " ");
        }
        System.out.println("Кол-во нечетных = " + counter);


        System.out.println();
        // сгенерировать 20 случ буленей. Кого больше - тру или фолсов?
        int counterTrue = 0;
        int counterFalse = 0;

        for (int j = 0; j < 20; j++) {
            boolean bool = rnd.nextBoolean();
            if (bool == true) {
                counterTrue = counterTrue + 1;
            } else {
                counterFalse = counterFalse + 1;
            }
            System.out.print(bool + " ");
        }
        if (counterTrue > counterFalse) {
            System.out.println("Переменных true больше чем переменных false");
        } else if (counterTrue < counterFalse) {
            System.out.println("Переменных false больше чем переменных true");
        } else {
            System.out.println("Кол-во переменных одинаково");

        }
        //сгенерить 5 фолсов случайных


        System.out.println();
        for (int countFalse = 0; countFalse < 5; ) {
            boolean bo = rnd.nextBoolean();
            System.out.println(bo);
            if (bo == false) {
                countFalse = countFalse + 1;
            }
        }

        //сгенерить 20 случ  букв (65 - 90 большие буквы)
        // =========== ДЗ =================
        System.out.println("HOME WORK");
        char test;
        int letter;
        for (int j = 0; j < 20; j++) {
            //int count01 = rnd.nextInt(2);

            System.out.print((rnd.nextInt(2) == 0 ? (char) (rnd.nextInt(90 - 65) + 65) : (char) (rnd.nextInt(122 - 97) + 97)) + " ");

//            if (count01 == 0) {
//                int letter = rnd.nextInt(90 - 65) + 65;
//                char test = (char) letter;
//                System.out.print(test + " ");
//            } else {
//                int letter = rnd.nextInt(122 - 97) + 97;
//                char test = (char) letter;
//                System.out.print(test + " ");
//            }

        }

        System.out.println();
        // сгенерить 26 буленей  в пропорции 1 к 3 (1 тру на 3 фолс)


        for (int j = 0; j < 26; j++) {
            //int x = rnd.nextInt(4);

            System.out.println(rnd.nextInt(4) == 3);

        }
        //сгенерить (четыре числа 5  && 2 числа 1) при генерации случ  чисел от -32 до 30
        int vova5 = 0;
        int vova1 = 0;
        for (; ; ) {

            int digits = rnd.nextInt(30 + 32) - 32;

            if (digits == 5) {
                vova5 += 1;
//                System.out.print(digits + " ");
            } else if (digits == 1) {
                vova1 += 1;
//                System.out.println();
            }
            System.out.print(digits + " ");

            if (vova5 >= 4 && vova1 >= 2)
                break;
        }

        System.out.println();
        System.out.println(" ============= NEW ================");
        //сгенерить 25 случ чисел от -15 до 27. Найти среднее отрицательных нечетных
        int oddNegativeQuantity = 0;
        int sumOddNegative = 0;

        for (int j = 0; j < 25; j++) {
            int sluch = rnd.nextInt(27 + 15) - 15;

            if (sluch % 2 == -1) {
                sumOddNegative = sumOddNegative + sluch;
                oddNegativeQuantity += 1;
                System.out.print(sluch + " ");
            }
        }
        System.out.println();
        System.out.println(" Сумма средних отр. " + Math.round(sumOddNegative * 100 / oddNegativeQuantity) / 100.0);


        System.out.println();
        System.out.println("========== HOME WORK =================");
        //сгенерить 20 случ  от -23 до 19. Найти минимальное и максим  значение
        int min = Integer.MAX_VALUE;
        int max = -23;
        for (int j = 0; j < 20; j++) {
            int home = rnd.nextInt(19 + 23) - 23;

            System.out.print(home + " ");

            if (home < min) {
                min = home;
            }

            if (home > max){
                max = home;
            }
        }
        System.out.println();
        System.out.println("Min is " +  min);
        System.out.println("Max is " + max);


    }





}




