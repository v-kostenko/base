package arrays2d;

import arrays.Arr;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int[][] array = {{2, 4, 6}, {3, 2, 5, 1, 4}, {2, 1, 7}};

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
        System.out.println(Arrays.deepToString(array));

        int[][] test = new int[3][];

        int[] first = {1, 0, 2};
        test[0] = first;

        int[] second = new int[130];
        for (int i = 0; i < second.length; i++) {
            second[i] = i;
        }

        test[1] = second;

        int[] third = {4, 6};
        test[2] = third;

        twoDarray(new int[]{2, 5, 3, 2});

        int[][] example = arr(0, 2, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(Arrays.deepToString(example));

        System.out.println();

        String name = winnerName(new String[]{"Bob", "Jhon", "Ben"}, new int[][]{{23, 46, 12, 0, 10}, {9, 3, 6, 10, 33}, {4, 5, 40, 39, 33}});

        System.out.println(name);

        sort(new int[][]{{23, 46, 12, 0, 10}, {9, 3, 6, 10, 33}});

    }

    // ф-я принимает 1д массив и строит по нему 2д и возвращает этот 2д
    public static int[][] twoDarray(int[] array) {

        int[][] twoArray = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            twoArray[i] = new int[array[i]];
        }
        System.out.println(Arrays.deepToString(twoArray));
        return twoArray;
    }

    //ф-я принимает 2д  и 2 инта - номера строк для обмена
    public static int[][] arr(int x, int y, int[][] array) {
        int[] boof = array[x]; //массив в индексе 0

        array[x] = array[y];
        array[y] = boof;

        return array;
    }

    // ф-я принимает резудьтаты участнико в в виде прямоуголь  массива 2д и массив имен участников.
    // Возвратить имя победителя (по макс   результату. Если макс  рез-т одинаков - по макс  сумме балов
    private static int maxValueFunc(int[] results) {
        Arrays.sort(results);
        return results[results.length - 1];
    }

    private static int sum(int[] results) {
        int sum = 0;
        for (int i = 0; i < results.length; i++) {
            sum = sum + results[i];
        }
        return sum;
    }

    public static String winnerName(String[] names, int[][] results) {

        int rowNumberWinner = 0;
        int maxValueVar = Integer.MIN_VALUE; //46
        int maxSum = 0;

        for (int i = 0; i < results.length; i++) {
            int value = maxValueFunc(results[i]);
            int sum = sum(results[i]);

            if (value > maxValueVar) {
                maxValueVar = value;
                rowNumberWinner = i;
                maxSum = sum;
            } else if (value == maxValueVar && sum > maxSum) {
                maxValueVar = value;
                maxSum = sum;
                rowNumberWinner = i;
            }

        }
        return names[rowNumberWinner];
    }

    //..ф-я принимает 2д  и сортирует его по убыванию
    public static void sort(int[][] arrayTwoD) {
        int[] boofArray = convert(arrayTwoD); //0, 3, 6
        int k = boofArray.length - 1;

        for (int i = 0; i < arrayTwoD.length; i++) {
            for (int j = 0; j < arrayTwoD[i].length; j++) {

                arrayTwoD[i][j] = boofArray[k--];
            }
        }
        System.out.println(Arrays.deepToString(arrayTwoD));
    }

    public static int[] convert(int[][] twoD) {
        int count = 0;

        for (int i = 0; i < twoD.length; i++) {
                count += twoD[i].length;
        }

        int[] array = new int[count];
        int k = 0;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                array[k++] = twoD[i][j];
            }
        }

        Arrays.sort(array);

        return array;
    }


}
