package arrays;

import java.util.Arrays;
import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        // есть массив типа инт сделать зеркальный
        Random random = new Random();

        int[] array = new int[]{1, 2, -3, 4, 5, -6, 7, -8};

        int[] arrayMirr = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; arrayMirr[j] = array[i], i--, j++) ;

        System.out.println(Arrays.toString(arrayMirr));

        // инверсировать массив

        for (int i = 0; i < array.length; array[i] *= -1, i++) ;

        System.out.println(Arrays.toString(array));

        //есть буленовскийц ассив. Инвертировать
        boolean[] bool = new boolean[]{true, false, false, true, true};

        for (int i = 0; i < bool.length; bool[i] = !bool[i], i++) ;

        System.out.println(Arrays.toString(bool));

        // есть массив типа дабл. Все положительные числа уменьшить в 1.3 раза, а отрицательные увеличить в 2 раза
        System.out.println(" -------------------- HOME WORK ----------------------");
        double[] arrayDouble = new double[]{-1.11, 2.22, -3.33, 4.44, 5.55, 6.66, -7.77, 8.88};
        for (int i = 0; i < arrayDouble.length; i++) {

//            if (arrayDouble[i] > 0){
//                arrayDouble[i] = Math.round((arrayDouble[i] * 1.3) * 100.0) / 100.0;
//            } else {
//                arrayDouble[i] *= 2;
//            }

            arrayDouble[i] = arrayDouble[i] > 0 ? Math.round((arrayDouble[i] * 0.7) * 100.0) / 100.0 : arrayDouble[i] * 2;

        }
        System.out.println(Arrays.toString(arrayDouble));


        System.out.println(" ---------------------- HOME WORK -----------------------");


        // есть массив типа инт сделать зеркальный
        array = new int[]{1, 2, -3, 4, 5, -6, 7, -8};

        int boof;
        for (int i = array.length - 1, j = 0; i >= array.length / 2; i--, j++) {

            boof = array[i];
            array[i] = array[j];
            array[j] = boof;
        }
        System.out.println(Arrays.toString(array));

        //есть массив Смешать рандомно его элеенты
        array = new int[]{1, 2, -3, 4, 5, -6, 7, -8};

        int arrIndex;
        int boof1;
        for (int i = 0; i < array.length; i++) {
            arrIndex = random.nextInt(array.length);
            boof1 = array[i];

            array[i] = array[arrIndex];
            array[arrIndex] = boof1;
        }
        System.out.println(Arrays.toString(array));

        //есть массив типа инт. Создать массив в кот будут только положит элементы с исходного;
        System.out.println(" ---------------------- HOME WORK -----------------------");

        array = new int[]{-1, 2, 3, -4, 5, 6, 7, -8};
        int quntityPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                quntityPositive++;
            }
        }

        int[] positive = new int[quntityPositive];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive[j++] = array[i];
            }
        }

        System.out.println(Arrays.toString(positive));
        // Есть массив  удалить первую ячейку. Циклом
        array = new int[]{-1, 2, 3, -4, 5, 6, 7, -8};

        int[] second = new int[array.length - 1];

        for (int i = 1, j = 0; i < array.length; second[j] = array[i], i++, j++) ;
        System.out.println(Arrays.toString(second));

        //есть массив и инт - номер позиции для удаления - фором
        array = new int[]{-1, 2, 3, -4, 5, 6, 7, -8};

        int counterIndex = 2;
        int[] test = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if (i < counterIndex) {
                test[j++] = array[i];
            }
            if (i > counterIndex)
            test[j++] = array[i];


        }
        System.out.println(Arrays.toString(test));

        //есть массив и 2 инта. Первый - згачение для вставки, второй - позиция для вставки
        array = new int[]{-1, 2, 3, -4, 5, 6, 7, -8};

        int value = 999;
        int index = 0;

        int[] testSecond = new int[array.length + 1];

        for (int i = 0, j = 0; i < testSecond.length; i++) {

            if (i < index){
                testSecond[j++] = array[i];
            } else if (i == index){
                testSecond[j++] = value;
            } else {
                testSecond[j++] = array[i - 1];
            }

        }
        System.out.println(Arrays.toString(testSecond));

        //есть 2 массива. Склеить их
        array = new int[]{-11, 22, 33, -44, 54, 65, 77, -88};
        int [] array2 = new int[]{-1, 2, 3, -4, 5, 6, 7, -8, 9};

        int[] third = new int[array.length + array2.length];

        for (int i = 0, j = 0; i < third.length; i++) {
            if (i < array.length) {
                third[i] = array[i];
            } else{
                third[i] = array2[j++];
            }

        }



//        for (int i = 0, j = 0; i < array.length; i++){
//            third[j++] = array[i];
//            }
//
//        for (int i = 0, j = array.length; i < array2.length; i++){
//            third[j++] = array2[i];
//        }

        System.out.println(Arrays.toString(third));

        //есть 2 массива и  инт - номер позиции для встввки второго в первій
        int [] array1 = new int[]{-11, 22, 33, -44, 54, 65, 77, -88};
        array2 = new int[]{-1, 2, 3};





    }

}
