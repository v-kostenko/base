package functions;

import java.util.Arrays;

public class Func1 {
    //ф-я принимает массив интов и заменяет максимальный элемент массива ни минимальный и наоборот
    public static void replaceMax(int[] array){
        int max = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[max]){
                max = i;
            }

            if (array[i] < array[min]){
                min = i;
            }
        }

        int boof = array[min];
        array[max] = array[min];




    }




    public static String[] replace(String[] array) {

        int length = (array.length % 2 == 0) ? array.length : array.length - 1;

        for (int i = 0; i < length; i += 2) {
            String boof = array[i];
            array[i] = array[i + 1];
            array[i + 1] = boof;
        }

        return array;
    }

    public static void main(String[] args) {
        //ф-я принимает массив типа стринг и меняет смежные элементы через один

        System.out.println(Arrays.toString(replace(new String[]{"w", "e", "r", "t", "o"})));

    }
}
