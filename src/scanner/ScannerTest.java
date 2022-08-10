package scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        cчитать буленя
//        System.out.println("Введи boolean ");
//        boolean bool = scanner.nextBoolean();
//        System.out.println(bool);


        //Предлагаем ввести  число типа дабл с диапазона, и пока пользователь не введет корректные данные, вопрос повторяется
//        System.out.println("Ввести число в диапазоне от -5.55 до 5.55");
//        double x = scanner.nextDouble();
//
//        while (x < -5.55 || x > 5.55) {
//            System.out.println("Ввести число в диапазоне от -5.55 до 5.55");
//            x = scanner.nextDouble();
//        }
//        System.out.println("Congrats! ");

//        double y;
//        do {
//            System.out.println("Ввести число в диапазоне от -5.55 до 5.55");
//            y = scanner.nextDouble();
//        } while (y < -5.55 || y > 5.55);
//        System.out.println("Congrats! ");

        // комп загадывает случ  число из диапазона и предлагает отгадать.
        // Если введено не то число, то если ввел меньшее, комп говорит что число больше и наоборот.
        // После 2 неверных попыток- предупреждение
// ----------------- ДЗ ------------------------
        int userAnswer;
        int randDigit;

        randDigit = random.nextInt(11);
        System.out.println("Отгадай число от 0 до 10");
        userAnswer = scanner.nextInt();

        while (userAnswer != randDigit) {

            if (userAnswer < randDigit){
                System.out.println("Загаданное число больше ");

            } else {
                System.out.println("Загаданное число меньше ");

            }

        }
        System.out.println("Congrats! Загаданное число = " + randDigit);




    }
}
