package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class ArraysEx {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = {0, 1, 2, 3, 4, 5};

        int[] array1 = new int[6];
        array1[0] = 0;
        array1[1] = 1;

        boolean[] array2 = new boolean[]{true, false, true, true};

        System.out.println(Arrays.toString(array2));
        array[3] = 9;
        System.out.println(Arrays.toString(array));

        int[] test1 = new int[10];
        for (int i = 0; i < test1.length; i++) {
            test1[i] = random.nextInt(101);
            System.out.print(test1[i] + " ");
        }

        System.out.println();
        for (int i = test1.length - 1; i >= 0; i--) {

            System.out.print(test1[i] + " ");
        }

        //найти минимум и максимум в тесте1
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < test1.length; i++) {

            if (test1[i] > max) {
                max = test1[i];
            }

            if (test1[i] < min) {
                min = test1[i];
            }
        }
        System.out.println();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        //
        System.out.println();
        for (int name : test1) {

            System.out.print(name + " ");
        }

        // есть массив типа инт на 10 позиций. Скопироваит в новый массив все значения с 3 по 7 позиции включительно
        int[] arrNew = new int[]{1, 3, 56, 89, 8888, -988, 78, 32, -44, 99999};
        int[] arrNew1 = new int[5];
        System.arraycopy(arrNew, 2, arrNew1, 0, 5);

        System.out.println();
        System.out.println(Arrays.toString(arrNew1));

        //удалить первій єлемент массива

        int[] arr9 = new int[arrNew.length - 1];
        System.arraycopy(arrNew, 1, arr9, 0, arrNew.length - 1);
        System.out.println(Arrays.toString(arr9));


        //есть 2 массива. ссклеить их
        int[] array16 = new int[array.length + arrNew.length];
        System.arraycopy(array, 0, array16, 0, array.length);
        System.arraycopy(arrNew, 0, array16, array.length, arrNew.length);
        System.out.println(Arrays.toString(array16));

        //есть 2 массива и инт - номер позиции для вставки второго в первый
        int[] first = {0, 1, 2, 3, 4, 5};
        int[] second = {88, 99, 77};
        int insertPosition = 0;

        int[] third = new int[first.length + second.length];
        System.out.println("Длина 3-го массива = " + third.length);

        //Помещаем знач из первого массива от 0 до 4 в т-й массив
        System.arraycopy(first, 0, third, 0, insertPosition);
        System.out.println(Arrays.toString(third));

        // Помещаем 2-й массив в третий на позицию сдвига
        System.arraycopy(second, 0, third, insertPosition, second.length);
        System.out.println(Arrays.toString(third));

        // Помещаем оставшиеся елементы из первого массива в 3-й
        System.arraycopy(first, insertPosition, third, insertPosition + second.length, first.length - insertPosition);
        System.out.println(Arrays.toString(third));


        //----------------------------------------------------------------
//        System.out.println("-----------------TEMP-------------------------");
//        int[] temp = {0, 0, 0, 0, 0, 0, 0, 0, 0};
//        System.arraycopy(first,  insertPosition, temp, 0, first.length - insertPosition);
//        System.out.println(Arrays.toString(temp));
//
//        System.arraycopy(first, insertPosition,temp, insertPosition + second.length,first.length - insertPosition);
//        System.out.println(Arrays.toString(temp));
        //-----------------------------------------------------------------

        //есть массив и инт - номер позиции для удаления
        int[] ten = {10, 20, 30, 40, 50, 60, 70};
        int deleteIndex = 4;

        int[] temp1 = new int[ten.length - 1];

        System.arraycopy(ten, 0, temp1, 0, deleteIndex);
        System.out.println();
        System.out.println(Arrays.toString(ten));
        System.out.println(Arrays.toString(temp1));

        System.arraycopy(ten, deleteIndex + 1, temp1, deleteIndex, ten.length - deleteIndex - 1);
        System.out.println(Arrays.toString(temp1));


        //есть массив и 2 инта - что вставлять и куда
        int var = 82;
        int replaceIndex = 6;

        int[] vova = new int[ten.length];

        System.arraycopy(ten, 0, vova, 0, replaceIndex);
        vova[replaceIndex] = var;
        System.out.println(Arrays.toString(vova));
        System.arraycopy(ten, replaceIndex + 1, vova, replaceIndex + 1, ten.length - replaceIndex - 1);
        System.out.println(Arrays.toString(vova));

        //есть 2 массива и номер позиции для вставки второго в первый
        int[] firstArray = {111, 222, 333, 444, 555, 666};
        int[] secondArray = {10, 20, 30, 40};
        int index = 2;

        int[] thirdArray = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, thirdArray, 0, index);
        System.arraycopy(secondArray, 0, thirdArray, index, secondArray.length);
        System.arraycopy(firstArray, index, thirdArray, index + secondArray.length, firstArray.length - index);
        System.out.println(Arrays.toString(thirdArray));

        // есть массив и 2 инт. С какой по какую удалить?
        int[] firstArrayVova = {111, 222, 333, 444, 555, 666, 777, 888, 999};

        int from = 1;
        int to = 3;

        int[] newArray = new int[firstArrayVova.length - (from + to) + 1];
        System.arraycopy(firstArrayVova, 0, newArray, 0, from);
        System.arraycopy(firstArrayVova, from + to, newArray, from, firstArrayVova.length - (from + to));
        System.out.println(Arrays.toString(newArray));

        // есть массив типа инт сделать зеркальный


    }


}
