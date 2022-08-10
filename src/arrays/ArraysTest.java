package arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        int[] array1 = new int[]{-11, 22, 33, -44, 54, 65, 77, -88};
        int[] array2 = new int[]{-1, 2, 3};

        int[] array3 = new int[array1.length + array2.length];

        int index = 3;

        for (int i = 0, j = 0 ; i < array3.length; i++) {

            if (i < index){
                array3[i] = array1[i];
            } else if(i >= index && i < index + array2.length){
                array3[i] = array2[j++];
            } else {
                array3[i] = array1[index++];
            }

        }

        System.out.println(Arrays.toString(array3));

        // Сортировка массива
        // найти второй максимум
        array1 = new int[]{-11, 22, 33, -44, 77, 77, 54, 65, 77, -88};
        Arrays.sort(array1);

        int firstMax = array1[array1.length - 1];
        int secondMax = Integer.MAX_VALUE;

        for (int i = array1.length; i > 0; i--) {

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(firstMax);










    }
}
