package loops;

public class ForLoop {
    public static void main(String[] args) {
        // напечатать числа от 43 до -12 с шагом 4
        for (int i = 43; i >= -12; i -= 4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" ======== Double HOME WORK ======== ");
        //цикл от -12.5  до 24.2  шаг 5.21

        for (double i = -12.5; i <= 24.2; i = Math.round((i + 5.25) * 1000) / 1000.0 ) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(" ======== Double HOME WORK ======== ");
        System.out.println();

        // цикл от -2 до    15. Напечатать только цифры 0    7     и 10
        for (int i = -2; i <= 15; i++) {
            if (i == 0 || i == 7 || i == 10) {
                System.out.print(i);
            }
        }
        System.out.println();
        //цикл от -4 до -27. Напечатать все кроме -10  и -20
        for (int i = -4; i >= -27; i = i - 1) {
            if (i != -10 && i != -20) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("============= Home work =========");
        // Задача №1
        //Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
        // 1 2 3 4 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача №2");
//        Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
//        5 4 3 2 1

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача №3");
        //Необходимо вывести на экран таблицу умножения на 3:
//     3*1=3
//     3*2=6
//     ...

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            int x = 3 * i;
            System.out.println("3 * " + i + " = " + x);
        }

        System.out.println();
        // Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом,
        // как на картинке ниже.
        // *****
        // *****
        // *****

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // Таблица умножения
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                int mult = i * j;
                System.out.println(i + " x " + j + " = " + mult);
            }
            System.out.println();
        }

        // Выести
        //"*******"
        //"******"
        //"*****"
        //"****"
        //"***"
        //"**"
        //"*"

        int counter = 7;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= counter; j++) {
                System.out.print("* ");
            }
            System.out.println();
            counter --;
        }
    }
}
