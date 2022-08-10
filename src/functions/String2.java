package functions;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        int[] newArray = returnArray(new int[]{1, 3, -4, 6, -7, -19, -44, 99});
        int[] newArray2 = returnArray2(new int[]{1, 3, -4, 6, -7, -19, -44, 99});
        int[] zeroRe = zeroReturne(new int[]{111, 10, -4, 0, -7, -19, 0, -44, 99});

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray2));
        System.out.println(Arrays.toString(zeroRe));

        int[] first = new int[]{1, 3, -4, 6, -7, -19, -44, 99};
        int[] second = new int[]{-44, 99};

        boolean result = equals(first, second);
        System.out.println(result);

        String s = replacePosition("qqwert 1234 fg5678nm 567890w");
        System.out.println(s);
    }

    //ф-я принимает массив типа инт и удаляет отрицат  элементы
    public static int[] returnArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                if (array[i] < 0) {
                    i--;
                }
            }

        }
        return array;
    }

    // есть все тоже, но сделать с конца внешний цикл.

    public static int[] returnArray2(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] < 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }

        }
        return array;
    }

    //есть массив интов, все 0 сместить вправо
    public static int[] zeroReturne(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[j] != 0) {

                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }

                }
            }

        }

        return array;
    }

    // ф-я принимает 2 массива типа инт и возвр  тру если все элементы второго присутствуют в первом
    public static boolean equals(int[] first, int[] second) {
        for (int i = 0; i < second.length; i++) {

            boolean marker = false;
            for (int j = 0; j < first.length; j++) {
                if (second[i] == first[j]) {
                    marker = true;
                    break;
                }
            }
            if (marker == false) {
                return false;
            }

        }
        return true;
    }

    //ф-я принимает  стринг и менЯет в нем самую маленькую и самую большую цифру иместами возвращает самое большую цифру с него
    public static String replacePosition(String str) {
        char[] chars = str.toCharArray();
        //Arrays.sort(chars);

        int minPosition = 0;
        int maxPosition = 0;
        char boofer;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= '0' && chars[i] <= '9' && chars[i] > chars[maxPosition]) {
                maxPosition = i;
            }

            if (chars[i] >= '0' && chars[i] <= '9' && chars[i] < chars[minPosition]) {
                minPosition = i;
            }
        }

        boofer = chars[maxPosition];
        chars[maxPosition] = chars[minPosition];
        chars[minPosition] = boofer;

        return new String(chars);
    }

}


