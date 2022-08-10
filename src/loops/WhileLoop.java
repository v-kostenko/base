package loops;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        // сгенерить 20 случ чисел от -20 до 20
        Random random = new Random();

        int count = 0;
        while (count < 20) {
            count += 1;
            int x = random.nextInt(20 + 20) - 20;
            System.out.print(x + " ");
        }
       // сгенерить



    }
}
