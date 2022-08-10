package functions;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayFunc(3, 9)));

        System.out.println(answer(5));

        System.out.println(factorial(3));

        System.out.println(new int[] {1, 2, 9});


    }


    // ф-я принимает 2 числа типа инт и создает массив с числами от первого к второму вкл
    public static int[] arrayFunc(int x, int y) {

        int[] arrayTest = new int[y - x + 1];

        for (int i = 0; i < arrayTest.length; arrayTest[i] = x++, i++) ;

        return arrayTest;
    }

    // ф-я принимает инт и возвращает тру если это число простое
    public static boolean answer(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    //ф-я принимает целое и возвращает факториал его
    public static int factorial(int x){

        int y = 1;
        for (int i = x; i > 1; i--) {
            y = y * i;
        }
        return y;
    }

    //





}
