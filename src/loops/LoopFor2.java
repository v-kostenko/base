package loops;

import java.util.Random;

public class LoopFor2 {
    public static void main(String[] args) {
        // сгенерить 20 случ букв. и найти количество гласных  “a”, “e”, “i”, “o” и “u”
        Random random = new Random();
        int countEven = 0;
//        for (int i = 0; i < 20; i++) {
//
//            char x = (char) (random.nextInt('z' - 'a') + 'a');
//            System.out.print(x + " ");
//
//            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y'){
//                countEven += 1;
//            }
//
//        }
//        System.out.println();
//        System.out.println("Кол-во гласных = " + countEven);
//        System.out.println("-------------------------------------------");
        // сгенерить 7 случайных гласных букв

        while (countEven <= 6){
            char  x= (char) (random.nextInt('z' - 'a') + 'a');
            //System.out.print(x + " ");

            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y'){
                countEven += 1;
                System.out.print(x + " ");
            }
        }
        //








    }
}
