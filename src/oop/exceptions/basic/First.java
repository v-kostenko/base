package oop.exceptions.basic;

public class First {

    public static void first() throws AgroColobok{
        Second.secondMethod();
        int[] arr = new int[5];
        System.out.println(arr[5]);
    }
}
