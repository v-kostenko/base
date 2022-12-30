package functions.recursia;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 8, 33, 888, 800, 9999};
        printArray(arr, 0);

    }

    public static void printArray(int[] array, int index){
       if (index == array.length){
           return;
       }
        printArray(array, index+1);

        System.out.println(array[index]);

    }
}
